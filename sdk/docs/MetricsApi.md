# MetricsApi

All URIs are relative to *https://fbn-prd.lusid.com/insights*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetrics**](MetricsApi.md#getMetrics) | **GET** /api/metrics | [EARLY ACCESS] GetMetrics: Get the aggregated platform metrics for the caller&#39;s domain. |



## getMetrics

> MetricsResponse getMetrics(include)

[EARLY ACCESS] GetMetrics: Get the aggregated platform metrics for the caller&#39;s domain.

 Returns request volumes, error rates and duration distributions for the domain&#39;s services, plus its identity  population and activity counts. The domain is taken from the authenticated request, never from a parameter.  &lt;b&gt;This endpoint is slow by design.&lt;/b&gt; It runs several analytical queries in parallel and commonly takes  upwards of thirty seconds when the underlying data is cold. The server abandons a data set that has not  completed within its configured budget and reports it in &#x60;failed&#x60;, so a call returns rather than hanging  indefinitely; allow comfortably more than that budget on the client, and do not call this on a  user-interactive code path without showing progress.  Partial success is normal and is still reported as a &#x60;200&#x60;. A data set that could not be retrieved is  null in the response and named in &#x60;failed&#x60; with a reason; a data set excluded via  include is null and named in &#x60;notIncluded&#x60;. Render a null data set as unavailable  rather than as an absence of activity.

### Example

```java
import com.finbourne.insights.model.*;
import com.finbourne.insights.api.MetricsApi;
import com.finbourne.insights.extensions.ApiConfigurationException;
import com.finbourne.insights.extensions.ApiFactoryBuilder;
import com.finbourne.insights.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MetricsApiExample {

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
        // MetricsApi apiInstance = apiFactory.build(MetricsApi.class);

        MetricsApi apiInstance = ApiFactoryBuilder.build(fileName).build(MetricsApi.class);
        List<String> include = Arrays.asList(); // List<String> | The data sets to return, by name. Omit to return all of them. Repeat the parameter to request several, for example `?include=RequestsPerMinute&include=IdentityMetrics`. Matched case-insensitively against the data set names, which are the `name` values on the response's data sets; duplicates are ignored.
        try {
            // uncomment the below to set overrides at the request level
            // MetricsResponse result = apiInstance.getMetrics(include).execute(opts);

            MetricsResponse result = apiInstance.getMetrics(include).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#getMetrics");
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
| **include** | [**List&lt;String&gt;**](String.md)| The data sets to return, by name. Omit to return all of them. Repeat the parameter to request several, for example &#x60;?include&#x3D;RequestsPerMinute&amp;include&#x3D;IdentityMetrics&#x60;. Matched case-insensitively against the data set names, which are the &#x60;name&#x60; values on the response&#39;s data sets; duplicates are ignored. | [optional] |

### Return type

[**MetricsResponse**](MetricsResponse.md)

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

