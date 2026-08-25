# com.finbourne.insights.model.MetricsResponse
The aggregated platform metrics for a domain: one nullable, strongly-typed property per data set.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | When this response was assembled, in UTC. Every data set in the response was resolved against this instant. | [default to OffsetDateTime]
**domain** | **String** | The domain the metrics are for, resolved from the authenticated request rather than from any parameter. | [default to String]
**requestsPerMinute** | [**RequestsPerMinuteDataSet**](RequestsPerMinuteDataSet.md) |  | [optional] [default to RequestsPerMinuteDataSet]
**serviceEndpointDurations24h** | [**ServiceEndpointDurations24hDataSet**](ServiceEndpointDurations24hDataSet.md) |  | [optional] [default to ServiceEndpointDurations24hDataSet]
**serviceRequests24h** | [**ServiceRequests24hDataSet**](ServiceRequests24hDataSet.md) |  | [optional] [default to ServiceRequests24hDataSet]
**identityMetrics** | [**IdentityMetricsDataSet**](IdentityMetricsDataSet.md) |  | [optional] [default to IdentityMetricsDataSet]
**notIncluded** | **List&lt;String&gt;** | The data sets the caller excluded via the &#x60;include&#x60; parameter, and which were therefore never queried. Each value is one of the Finbourne.Insights.WebApi.Dtos.Metrics.MetricDataSet values. | [default to List<String>]
**failed** | [**List&lt;MetricDataSetFailure&gt;**](MetricDataSetFailure.md) | The data sets that were requested but could not be returned, each with a caller-safe reason. | [default to List<MetricDataSetFailure>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.insights.model.MetricsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsAt = OffsetDateTime.now();
String Domain = "example Domain";
RequestsPerMinuteDataSet RequestsPerMinute = new RequestsPerMinuteDataSet();
ServiceEndpointDurations24hDataSet ServiceEndpointDurations24h = new ServiceEndpointDurations24hDataSet();
ServiceRequests24hDataSet ServiceRequests24h = new ServiceRequests24hDataSet();
IdentityMetricsDataSet IdentityMetrics = new IdentityMetricsDataSet();
List<String> NotIncluded = new List<String>();
List<MetricDataSetFailure> Failed = new List<MetricDataSetFailure>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


MetricsResponse metricsResponseInstance = new MetricsResponse()
    .AsAt(AsAt)
    .Domain(Domain)
    .RequestsPerMinute(RequestsPerMinute)
    .ServiceEndpointDurations24h(ServiceEndpointDurations24h)
    .ServiceRequests24h(ServiceRequests24h)
    .IdentityMetrics(IdentityMetrics)
    .NotIncluded(NotIncluded)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
