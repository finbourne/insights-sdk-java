# RequestsApi

All URIs are relative to *https://fbn-ci.lusid.com/insights*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRequest**](RequestsApi.md#getRequest) | **GET** /api/requests/{id}/request | [EARLY ACCESS] GetRequest: Get the request content for a specific API request. |
| [**getRequestLog**](RequestsApi.md#getRequestLog) | **GET** /api/requests/{id} | [EARLY ACCESS] GetRequestLog: Get the log for a specific API request. |
| [**getResponse**](RequestsApi.md#getResponse) | **GET** /api/requests/{id}/response | [EARLY ACCESS] GetResponse: Get the response for a specific API request. |
| [**listRequestLogs**](RequestsApi.md#listRequestLogs) | **GET** /api/requests | [EARLY ACCESS] ListRequestLogs: Get the logs for API requests. |


<a id="getRequest"></a>
# **getRequest**
> Request getRequest(id).execute();

[EARLY ACCESS] GetRequest: Get the request content for a specific API request.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.RequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RequestsApi apiInstance = new RequestsApi(defaultClient);
    String id = "id_example"; // String | The identifier of the request to obtain the content for.
    try {
      Request result = apiInstance.getRequest(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestsApi#getRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The identifier of the request to obtain the content for. | |

### Return type

[**Request**](Request.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getRequestLog"></a>
# **getRequestLog**
> RequestLog getRequestLog(id).execute();

[EARLY ACCESS] GetRequestLog: Get the log for a specific API request.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.RequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RequestsApi apiInstance = new RequestsApi(defaultClient);
    String id = "id_example"; // String | The identifier of the request to obtain the log for.
    try {
      RequestLog result = apiInstance.getRequestLog(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestsApi#getRequestLog");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The identifier of the request to obtain the log for. | |

### Return type

[**RequestLog**](RequestLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getResponse"></a>
# **getResponse**
> Response getResponse(id).execute();

[EARLY ACCESS] GetResponse: Get the response for a specific API request.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.RequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RequestsApi apiInstance = new RequestsApi(defaultClient);
    String id = "id_example"; // String | The identifier of the request to obtain the response for.
    try {
      Response result = apiInstance.getResponse(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestsApi#getResponse");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The identifier of the request to obtain the response for. | |

### Return type

[**Response**](Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listRequestLogs"></a>
# **listRequestLogs**
> ResourceListWithHistogramOfRequestLog listRequestLogs().filter(filter).sortBy(sortBy).limit(limit).page(page).histogramInterval(histogramInterval).execute();

[EARLY ACCESS] ListRequestLogs: Get the logs for API requests.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.RequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RequestsApi apiInstance = new RequestsApi(defaultClient);
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about <see href=\"https://support.lusid.com/filtering-results-from-lusid\"> filtering results from LUSID</see>.
    String sortBy = "sortBy_example"; // String | Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
    Integer limit = 56; // Integer | When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000.
    String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied.
    String histogramInterval = "histogramInterval_example"; // String | Optional interval to use in a histogram of the returned values. If not provided, no histogram will be generated.
    try {
      ResourceListWithHistogramOfRequestLog result = apiInstance.listRequestLogs()
            .filter(filter)
            .sortBy(sortBy)
            .limit(limit)
            .page(page)
            .histogramInterval(histogramInterval)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestsApi#listRequestLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filter** | **String**| Expression to filter the result set. Read more about &lt;see href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot;&gt; filtering results from LUSID&lt;/see&gt;. | [optional] |
| **sortBy** | **String**| Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000. | [optional] |
| **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied. | [optional] |
| **histogramInterval** | **String**| Optional interval to use in a histogram of the returned values. If not provided, no histogram will be generated. | [optional] |

### Return type

[**ResourceListWithHistogramOfRequestLog**](ResourceListWithHistogramOfRequestLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

