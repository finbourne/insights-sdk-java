![LUSID_by_Finbourne](https://content.finbourne.com/LUSID_repo.png)


# LUSID<sup>®</sup> Java SDK Preview Template

This is a template repository for creating a new Java SDK for one of LUSID platform applications. For more details on applications in the LUSID platform, see [Understanding all the applications in the LUSID platform](https://support.lusid.com/knowledgebase/article/KA-01787/en-us).

## Usage
To run the setup script you need to provide an `application` argument and an optional `meta-requestid` argument. This is only supplied when the `response-meta-requestid` header differs from the application name. 
```
bash setup.sh -a Luminesce -m honeycomb
```
or
```
bash setup.sh -a Drive
```
Please note that the `-m` argument is case sensitive.