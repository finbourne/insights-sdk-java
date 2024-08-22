# AuditingApi

All URIs are relative to *https://fbn-prd.lusid.com/insights*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEntry**](AuditingApi.md#createEntry) | **POST** /api/auditing/entries | [EARLY ACCESS] CreateEntry: Create (persist) and audit entry.. |
| [**getProcesses**](AuditingApi.md#getProcesses) | **GET** /api/auditing/processes | [EARLY ACCESS] GetProcesses: Get the latest audit entry for each process. |
| [**listEntries**](AuditingApi.md#listEntries) | **GET** /api/auditing/entries | [EARLY ACCESS] ListEntries: Get the audit entries. |



## createEntry

> AuditEntry createEntry(createAuditEntry)

[EARLY ACCESS] CreateEntry: Create (persist) and audit entry..

### Example

```java
import com.finbourne.insights.model.*;
import com.finbourne.insights.api.AuditingApi;
import com.finbourne.insights.extensions.ApiConfigurationException;
import com.finbourne.insights.extensions.ApiFactoryBuilder;
import com.finbourne.insights.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AuditingApiExample {

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
        // AuditingApi apiInstance = apiFactory.build(AuditingApi.class);

        AuditingApi apiInstance = ApiFactoryBuilder.build(fileName).build(AuditingApi.class);
        CreateAuditEntry createAuditEntry = new CreateAuditEntry(); // CreateAuditEntry | Information about the entry to be created.
        try {
            // uncomment the below to set overrides at the request level
            // AuditEntry result = apiInstance.createEntry(createAuditEntry).execute(opts);

            AuditEntry result = apiInstance.createEntry(createAuditEntry).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditingApi#createEntry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAuditEntry** | [**CreateAuditEntry**](CreateAuditEntry.md)| Information about the entry to be created. | [optional] |

### Return type

[**AuditEntry**](AuditEntry.md)

### HTTP request headers

- **Content-Type**: application/json, application/json-patch+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **429** | There have been too many recent requests, retry later (using the RETRY-AFTER header value as the delay). |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getProcesses

> ResourceListOfAuditProcessSummary getProcesses()

[EARLY ACCESS] GetProcesses: Get the latest audit entry for each process.

This will never be &#x60;null&#x60;, though it may be empty.

### Example

```java
import com.finbourne.insights.model.*;
import com.finbourne.insights.api.AuditingApi;
import com.finbourne.insights.extensions.ApiConfigurationException;
import com.finbourne.insights.extensions.ApiFactoryBuilder;
import com.finbourne.insights.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AuditingApiExample {

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
        // AuditingApi apiInstance = apiFactory.build(AuditingApi.class);

        AuditingApi apiInstance = ApiFactoryBuilder.build(fileName).build(AuditingApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAuditProcessSummary result = apiInstance.getProcesses().execute(opts);

            ResourceListOfAuditProcessSummary result = apiInstance.getProcesses().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditingApi#getProcesses");
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

[**ResourceListOfAuditProcessSummary**](ResourceListOfAuditProcessSummary.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listEntries

> ScrollableCollectionOfAuditEntry listEntries(filter, sortBy, size, state)

[EARLY ACCESS] ListEntries: Get the audit entries.

This will never be &#x60;null&#x60;, though it may be empty.

### Example

```java
import com.finbourne.insights.model.*;
import com.finbourne.insights.api.AuditingApi;
import com.finbourne.insights.extensions.ApiConfigurationException;
import com.finbourne.insights.extensions.ApiFactoryBuilder;
import com.finbourne.insights.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AuditingApiExample {

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
        // AuditingApi apiInstance = apiFactory.build(AuditingApi.class);

        AuditingApi apiInstance = ApiFactoryBuilder.build(fileName).build(AuditingApi.class);
        String filter = "filter_example"; // String | The filter to be applied to the results.
        String sortBy = "sortBy_example"; // String | The order to return the entries in.
        Integer size = 1000; // Integer | The maximum number of entries to return.
        String state = "state_example"; // String | The scrolling state, used to iterate through the data set.
        try {
            // uncomment the below to set overrides at the request level
            // ScrollableCollectionOfAuditEntry result = apiInstance.listEntries(filter, sortBy, size, state).execute(opts);

            ScrollableCollectionOfAuditEntry result = apiInstance.listEntries(filter, sortBy, size, state).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditingApi#listEntries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filter** | **String**| The filter to be applied to the results. | [optional] |
| **sortBy** | **String**| The order to return the entries in. | [optional] |
| **size** | **Integer**| The maximum number of entries to return. | [optional] [default to 1000] |
| **state** | **String**| The scrolling state, used to iterate through the data set. | [optional] |

### Return type

[**ScrollableCollectionOfAuditEntry**](ScrollableCollectionOfAuditEntry.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

