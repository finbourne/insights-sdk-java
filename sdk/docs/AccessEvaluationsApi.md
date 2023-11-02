# AccessEvaluationsApi

All URIs are relative to *https://fbn-ci.lusid.com/insights*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccessEvaluationLog**](AccessEvaluationsApi.md#getAccessEvaluationLog) | **GET** /api/access/{id} | [EARLY ACCESS] GetAccessEvaluationLog: Get the log for a specific access evaluation.  This endpoint will be deprecated in the near future. |
| [**listAccessEvaluationLogs**](AccessEvaluationsApi.md#listAccessEvaluationLogs) | **GET** /api/access | [EARLY ACCESS] ListAccessEvaluationLogs: List the logs for access evaluations. |


<a id="getAccessEvaluationLog"></a>
# **getAccessEvaluationLog**
> AccessEvaluationLog getAccessEvaluationLog(id).execute();

[EARLY ACCESS] GetAccessEvaluationLog: Get the log for a specific access evaluation.  This endpoint will be deprecated in the near future.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.AccessEvaluationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AccessEvaluationsApi apiInstance = new AccessEvaluationsApi(defaultClient);
    String id = "id_example"; // String | The identifier of the access evaluation to obtain the log for.
    try {
      AccessEvaluationLog result = apiInstance.getAccessEvaluationLog(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessEvaluationsApi#getAccessEvaluationLog");
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
| **id** | **String**| The identifier of the access evaluation to obtain the log for. | |

### Return type

[**AccessEvaluationLog**](AccessEvaluationLog.md)

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

<a id="listAccessEvaluationLogs"></a>
# **listAccessEvaluationLogs**
> ResourceListWithHistogramOfAccessEvaluationLog listAccessEvaluationLogs().startAt(startAt).endAt(endAt).filter(filter).sortBy(sortBy).limit(limit).page(page).histogramInterval(histogramInterval).execute();

[EARLY ACCESS] ListAccessEvaluationLogs: List the logs for access evaluations.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.AccessEvaluationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AccessEvaluationsApi apiInstance = new AccessEvaluationsApi(defaultClient);
    OffsetDateTime startAt = OffsetDateTime.now(); // OffsetDateTime | Start date from which point to fetch logs.
    OffsetDateTime endAt = OffsetDateTime.now(); // OffsetDateTime | End date to which point to fetch logs.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about <see href=\"https://support.lusid.com/filtering-results-from-lusid\"> filtering results from LUSID</see>.
    String sortBy = "sortBy_example"; // String | Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
    Integer limit = 56; // Integer | When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000.
    String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied.
    String histogramInterval = "histogramInterval_example"; // String | The interval for an included histogram of the logs
    try {
      ResourceListWithHistogramOfAccessEvaluationLog result = apiInstance.listAccessEvaluationLogs()
            .startAt(startAt)
            .endAt(endAt)
            .filter(filter)
            .sortBy(sortBy)
            .limit(limit)
            .page(page)
            .histogramInterval(histogramInterval)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessEvaluationsApi#listAccessEvaluationLogs");
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
| **startAt** | **OffsetDateTime**| Start date from which point to fetch logs. | [optional] |
| **endAt** | **OffsetDateTime**| End date to which point to fetch logs. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about &lt;see href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot;&gt; filtering results from LUSID&lt;/see&gt;. | [optional] |
| **sortBy** | **String**| Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000. | [optional] |
| **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied. | [optional] |
| **histogramInterval** | **String**| The interval for an included histogram of the logs | [optional] |

### Return type

[**ResourceListWithHistogramOfAccessEvaluationLog**](ResourceListWithHistogramOfAccessEvaluationLog.md)

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

