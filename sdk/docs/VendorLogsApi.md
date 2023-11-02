# VendorLogsApi

All URIs are relative to *https://fbn-ci.lusid.com/insights*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVendorLog**](VendorLogsApi.md#getVendorLog) | **GET** /api/vendor/{id} | [EXPERIMENTAL] GetVendorLog: Get the log for a specific vendor request. |
| [**getVendorRequest**](VendorLogsApi.md#getVendorRequest) | **GET** /api/vendor/{id}/request | [EXPERIMENTAL] GetVendorRequest: Get the request body for a vendor request. |
| [**getVendorResponse**](VendorLogsApi.md#getVendorResponse) | **GET** /api/vendor/{id}/response | [EXPERIMENTAL] GetVendorResponse: Get the response from a vendor request. |
| [**listVendorLogs**](VendorLogsApi.md#listVendorLogs) | **GET** /api/vendor | [EXPERIMENTAL] ListVendorLogs: List the logs for vendor requests. |


<a id="getVendorLog"></a>
# **getVendorLog**
> VendorLog getVendorLog(id).execute();

[EXPERIMENTAL] GetVendorLog: Get the log for a specific vendor request.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.VendorLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    VendorLogsApi apiInstance = new VendorLogsApi(defaultClient);
    String id = "id_example"; // String | The identifier of the request to obtain the log for.
    try {
      VendorLog result = apiInstance.getVendorLog(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorLogsApi#getVendorLog");
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

[**VendorLog**](VendorLog.md)

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

<a id="getVendorRequest"></a>
# **getVendorRequest**
> VendorRequest getVendorRequest(id).execute();

[EXPERIMENTAL] GetVendorRequest: Get the request body for a vendor request.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.VendorLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    VendorLogsApi apiInstance = new VendorLogsApi(defaultClient);
    String id = "id_example"; // String | The identifier of the request to obtain the content for.
    try {
      VendorRequest result = apiInstance.getVendorRequest(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorLogsApi#getVendorRequest");
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

[**VendorRequest**](VendorRequest.md)

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

<a id="getVendorResponse"></a>
# **getVendorResponse**
> VendorResponse getVendorResponse(id).execute();

[EXPERIMENTAL] GetVendorResponse: Get the response from a vendor request.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.VendorLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    VendorLogsApi apiInstance = new VendorLogsApi(defaultClient);
    String id = "id_example"; // String | The identifier of the request to obtain the response for.
    try {
      VendorResponse result = apiInstance.getVendorResponse(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorLogsApi#getVendorResponse");
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

[**VendorResponse**](VendorResponse.md)

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

<a id="listVendorLogs"></a>
# **listVendorLogs**
> ResourceListWithHistogramOfVendorLog listVendorLogs().filter(filter).sortBy(sortBy).limit(limit).page(page).histogramInterval(histogramInterval).execute();

[EXPERIMENTAL] ListVendorLogs: List the logs for vendor requests.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.VendorLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    VendorLogsApi apiInstance = new VendorLogsApi(defaultClient);
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about <see href=\"https://support.lusid.com/filtering-results-from-lusid\"> filtering results from LUSID</see>.
    String sortBy = "sortBy_example"; // String | Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
    Integer limit = 56; // Integer | When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000.
    String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied.
    String histogramInterval = "histogramInterval_example"; // String | Optional interval to use in a histogram of the returned values. If not provided, no histogram will be generated.
    try {
      ResourceListWithHistogramOfVendorLog result = apiInstance.listVendorLogs()
            .filter(filter)
            .sortBy(sortBy)
            .limit(limit)
            .page(page)
            .histogramInterval(histogramInterval)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorLogsApi#listVendorLogs");
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

[**ResourceListWithHistogramOfVendorLog**](ResourceListWithHistogramOfVendorLog.md)

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

