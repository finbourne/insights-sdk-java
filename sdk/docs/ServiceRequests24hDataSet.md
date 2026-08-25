# com.finbourne.insights.model.ServiceRequests24hDataSet
Request volume and server-error rate per service over a rolling twenty four hour window.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this data set. Always &#x60;ServiceRequests24h&#x60;, matching the corresponding Finbourne.Insights.WebApi.Dtos.Metrics.MetricDataSet value and Finbourne.Insights.WebApi.Dtos.Metrics.MetricsResponse property. | [default to String]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | Inclusive start of the window the data covers, in UTC, floored to a whole minute. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | End of the window the data covers, in UTC, floored to a whole minute. | [default to OffsetDateTime]
**truncated** | **Boolean** | True when the query reached the row cap, so some services are missing. False when the whole result set was returned. | [default to Boolean]
**values** | [**List&lt;ServiceRequests&gt;**](ServiceRequests.md) | The rows, ordered by service. | [default to List<ServiceRequests>]

```java
import com.finbourne.insights.model.ServiceRequests24hDataSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
OffsetDateTime WindowStart = OffsetDateTime.now();
OffsetDateTime WindowEnd = OffsetDateTime.now();
Boolean Truncated = true;
List<ServiceRequests> Values = new List<ServiceRequests>();


ServiceRequests24hDataSet serviceRequests24hDataSetInstance = new ServiceRequests24hDataSet()
    .Name(Name)
    .WindowStart(WindowStart)
    .WindowEnd(WindowEnd)
    .Truncated(Truncated)
    .Values(Values);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
