# AuditingApi

All URIs are relative to *https://fbn-prd.lusid.com/insights*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEntry**](AuditingApi.md#createEntry) | **POST** /api/auditing/entries | [EARLY ACCESS] CreateEntry: Create (persist) and audit entry.. |
| [**getProcesses**](AuditingApi.md#getProcesses) | **GET** /api/auditing/processes | [EARLY ACCESS] GetProcesses: Get the latest audit entry for each process. |
| [**listEntries**](AuditingApi.md#listEntries) | **GET** /api/auditing/entries | [EARLY ACCESS] ListEntries: Get the audit entries. |


<a id="createEntry"></a>
# **createEntry**
> AuditEntry createEntry().createAuditEntry(createAuditEntry).execute();

[EARLY ACCESS] CreateEntry: Create (persist) and audit entry..

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.AuditingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AuditingApi apiInstance = new AuditingApi(defaultClient);
    CreateAuditEntry createAuditEntry = new CreateAuditEntry(); // CreateAuditEntry | Information about the entry to be created.
    try {
      AuditEntry result = apiInstance.createEntry()
            .createAuditEntry(createAuditEntry)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditingApi#createEntry");
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
| **createAuditEntry** | [**CreateAuditEntry**](CreateAuditEntry.md)| Information about the entry to be created. | [optional] |

### Return type

[**AuditEntry**](AuditEntry.md)

### Authorization

[oauth2](../README.md#oauth2)

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

<a id="getProcesses"></a>
# **getProcesses**
> ResourceListOfAuditProcessSummary getProcesses().execute();

[EARLY ACCESS] GetProcesses: Get the latest audit entry for each process.

This will never be &#x60;null&#x60;, though it may be empty.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.AuditingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AuditingApi apiInstance = new AuditingApi(defaultClient);
    try {
      ResourceListOfAuditProcessSummary result = apiInstance.getProcesses()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditingApi#getProcesses");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourceListOfAuditProcessSummary**](ResourceListOfAuditProcessSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

<a id="listEntries"></a>
# **listEntries**
> ScrollableCollectionOfAuditEntry listEntries().filter(filter).sortBy(sortBy).size(size).state(state).execute();

[EARLY ACCESS] ListEntries: Get the audit entries.

This will never be &#x60;null&#x60;, though it may be empty.

### Example
```java
// Import classes:
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.auth.*;
import com.finbourne.insights.models.*;
import com.finbourne.insights.api.AuditingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/insights");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AuditingApi apiInstance = new AuditingApi(defaultClient);
    String filter = "filter_example"; // String | The filter to be applied to the results.
    String sortBy = "sortBy_example"; // String | The order to return the entries in.
    Integer size = 1000; // Integer | The maximum number of entries to return.
    String state = "state_example"; // String | The scrolling state, used to iterate through the data set.
    try {
      ScrollableCollectionOfAuditEntry result = apiInstance.listEntries()
            .filter(filter)
            .sortBy(sortBy)
            .size(size)
            .state(state)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditingApi#listEntries");
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
| **filter** | **String**| The filter to be applied to the results. | [optional] |
| **sortBy** | **String**| The order to return the entries in. | [optional] |
| **size** | **Integer**| The maximum number of entries to return. | [optional] [default to 1000] |
| **state** | **String**| The scrolling state, used to iterate through the data set. | [optional] |

### Return type

[**ScrollableCollectionOfAuditEntry**](ScrollableCollectionOfAuditEntry.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

