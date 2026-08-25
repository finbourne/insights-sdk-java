# LogMetadataApi

All URIs are relative to *https://fbn-prd.lusid.com/insights*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listQueryableFields**](LogMetadataApi.md#listQueryableFields) | **GET** /api/metadata/logs | [EARLY ACCESS] ListQueryableFields: List the queryable fields for every supported log type. |



## listQueryableFields

> ResourceListOfQueryableLogType listQueryableFields()

[EARLY ACCESS] ListQueryableFields: List the queryable fields for every supported log type.

Returns, for each log type, the fields that can be selected and/or filtered, their data types, and the comparator operations available for each filterable field. Intended to power a UI that advertises the correct comparators for a chosen field.

### Example

```java
import com.finbourne.insights.model.*;
import com.finbourne.insights.api.LogMetadataApi;
import com.finbourne.insights.extensions.ApiConfigurationException;
import com.finbourne.insights.extensions.ApiFactoryBuilder;
import com.finbourne.insights.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LogMetadataApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"insightsUrl\": \"https://<your-domain>.lusid.com/insights\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LogMetadataApi apiInstance = apiFactory.build(LogMetadataApi.class);

        LogMetadataApi apiInstance = ApiFactoryBuilder.build(fileName).build(LogMetadataApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfQueryableLogType result = apiInstance.listQueryableFields().execute(opts);

            ResourceListOfQueryableLogType result = apiInstance.listQueryableFields().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMetadataApi#listQueryableFields");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ResourceListOfQueryableLogType**](ResourceListOfQueryableLogType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

