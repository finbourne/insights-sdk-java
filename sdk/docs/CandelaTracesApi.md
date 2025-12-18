# CandelaTracesApi

All URIs are relative to *https://fbn-prd.lusid.com/insights*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTraceDiagram**](CandelaTracesApi.md#getTraceDiagram) | **GET** /api/candelatraces/{traceId}/diagram | [EXPERIMENTAL] GetTraceDiagram: Get the diagram representation for a specific trace. |
| [**getTraceLog**](CandelaTracesApi.md#getTraceLog) | **GET** /api/candelatraces/{traceId} | [EXPERIMENTAL] GetTraceLog: Get the log for a specific trace. |
| [**listTraceEventLogs**](CandelaTracesApi.md#listTraceEventLogs) | **GET** /api/candelatraces/{traceId}/events | [EXPERIMENTAL] ListTraceEventLogs: Get the trace event logs for a specific trace. |
| [**listTraceLogs**](CandelaTracesApi.md#listTraceLogs) | **GET** /api/candelatraces | [EXPERIMENTAL] ListTraceLogs: Get the logs for traces. |



## getTraceDiagram

> TraceDiagramResponse getTraceDiagram(traceId)

[EXPERIMENTAL] GetTraceDiagram: Get the diagram representation for a specific trace.

### Example

```java
import com.finbourne.insights.model.*;
import com.finbourne.insights.api.CandelaTracesApi;
import com.finbourne.insights.extensions.ApiConfigurationException;
import com.finbourne.insights.extensions.ApiFactoryBuilder;
import com.finbourne.insights.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CandelaTracesApiExample {

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
        // CandelaTracesApi apiInstance = apiFactory.build(CandelaTracesApi.class);

        CandelaTracesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CandelaTracesApi.class);
        String traceId = "traceId_example"; // String | The identifier of the trace.
        try {
            // uncomment the below to set overrides at the request level
            // TraceDiagramResponse result = apiInstance.getTraceDiagram(traceId).execute(opts);

            TraceDiagramResponse result = apiInstance.getTraceDiagram(traceId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CandelaTracesApi#getTraceDiagram");
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
| **traceId** | **String**| The identifier of the trace. | |

### Return type

[**TraceDiagramResponse**](TraceDiagramResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTraceLog

> TraceLog getTraceLog(traceId)

[EXPERIMENTAL] GetTraceLog: Get the log for a specific trace.

### Example

```java
import com.finbourne.insights.model.*;
import com.finbourne.insights.api.CandelaTracesApi;
import com.finbourne.insights.extensions.ApiConfigurationException;
import com.finbourne.insights.extensions.ApiFactoryBuilder;
import com.finbourne.insights.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CandelaTracesApiExample {

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
        // CandelaTracesApi apiInstance = apiFactory.build(CandelaTracesApi.class);

        CandelaTracesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CandelaTracesApi.class);
        String traceId = "traceId_example"; // String | The identifier of the request to obtain the log for.
        try {
            // uncomment the below to set overrides at the request level
            // TraceLog result = apiInstance.getTraceLog(traceId).execute(opts);

            TraceLog result = apiInstance.getTraceLog(traceId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CandelaTracesApi#getTraceLog");
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
| **traceId** | **String**| The identifier of the request to obtain the log for. | |

### Return type

[**TraceLog**](TraceLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTraceEventLogs

> ResourceListOfTraceEventLog listTraceEventLogs(traceId, page)

[EXPERIMENTAL] ListTraceEventLogs: Get the trace event logs for a specific trace.

### Example

```java
import com.finbourne.insights.model.*;
import com.finbourne.insights.api.CandelaTracesApi;
import com.finbourne.insights.extensions.ApiConfigurationException;
import com.finbourne.insights.extensions.ApiFactoryBuilder;
import com.finbourne.insights.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CandelaTracesApiExample {

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
        // CandelaTracesApi apiInstance = apiFactory.build(CandelaTracesApi.class);

        CandelaTracesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CandelaTracesApi.class);
        String traceId = "traceId_example"; // String | The identifier of the request to obtain the log for.
        String page = "page_example"; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfTraceEventLog result = apiInstance.listTraceEventLogs(traceId, page).execute(opts);

            ResourceListOfTraceEventLog result = apiInstance.listTraceEventLogs(traceId, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CandelaTracesApi#listTraceEventLogs");
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
| **traceId** | **String**| The identifier of the request to obtain the log for. | |
| **page** | **String**|  | [optional] |

### Return type

[**ResourceListOfTraceEventLog**](ResourceListOfTraceEventLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTraceLogs

> ResourceListOfTraceLog listTraceLogs(filter, sortBy, limit, page)

[EXPERIMENTAL] ListTraceLogs: Get the logs for traces.

### Example

```java
import com.finbourne.insights.model.*;
import com.finbourne.insights.api.CandelaTracesApi;
import com.finbourne.insights.extensions.ApiConfigurationException;
import com.finbourne.insights.extensions.ApiFactoryBuilder;
import com.finbourne.insights.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CandelaTracesApiExample {

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
        // CandelaTracesApi apiInstance = apiFactory.build(CandelaTracesApi.class);

        CandelaTracesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CandelaTracesApi.class);
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about [filtering results from LUSID](https://support.lusid.com/filtering-results-from-lusid).
        String sortBy = "sortBy_example"; // String | Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
        Integer limit = 56; // Integer | When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000.
        String page = "page_example"; // String | Encoded pagwwwwe string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfTraceLog result = apiInstance.listTraceLogs(filter, sortBy, limit, page).execute(opts);

            ResourceListOfTraceLog result = apiInstance.listTraceLogs(filter, sortBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CandelaTracesApi#listTraceLogs");
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
| **filter** | **String**| Expression to filter the result set. Read more about [filtering results from LUSID](https://support.lusid.com/filtering-results-from-lusid). | [optional] |
| **sortBy** | **String**| Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000. | [optional] |
| **page** | **String**| Encoded pagwwwwe string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied. | [optional] |

### Return type

[**ResourceListOfTraceLog**](ResourceListOfTraceLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

