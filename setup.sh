#!/bin/bash

usage()
{
  echo
  echo "Usage: $0 "
  echo
  echo " -a Application e.g. luminesce"
  echo " -m Optional meta-requestid header e.g. honeycomb"
  echo
  exit 1
}

while getopts a:m: flag
do
    case "${flag}" in
        a) application=${OPTARG};;
        m) meta=${OPTARG};;
    esac
done

[ -z "$application" ] && usage

application_lower=${application,,}
application_upper=${application^^}
application_camel=${application^}

if [ -z "$meta" ]
  then
    echo "No meta-requestid argument supplied, defaulting to application"
    meta=$application_lower 
fi

echo "Setting up repository for $application_lower-sdk-java-preview";

echo "Setting up GitHub actions ..."
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" resources/workflows/build-and-test.yaml
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" resources/workflows/build-and-test.yaml
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" resources/workflows/build-and-test.yaml
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" resources/workflows/cron.yaml
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" resources/workflows/cron.yaml
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" resources/workflows/cron.yaml

echo "Setting up README ..."
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" resources/README.md
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" resources/README.md
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" resources/README.md

echo "Setting up CONTRIBUTING ..."
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" docs/CONTRIBUTING.md
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" docs/CONTRIBUTING.md
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" docs/CONTRIBUTING.md

echo "Setting up Docker ..."
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" resources/Dockerfile
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" resources/Dockerfile
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" resources/Dockerfile
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" resources/docker-compose.yml
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" resources/docker-compose.yml
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" resources/docker-compose.yml

echo "Setting up config.json ..."
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" config.json
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" config.json
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" config.json
sed -i '' "s/CHANGEME-META-ID/$meta/g" config.json 


echo "Moving files ..."
mkdir sdk
mv resources/Dockerfile sdk/
mv resources/docker-compose.yml sdk/
mv resources/README.md ./
mv resources/workflows .github/