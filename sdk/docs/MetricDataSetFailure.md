# com.finbourne.insights.model.MetricDataSetFailure
Names a metric data set that was requested but could not be returned, with a caller-safe explanation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The data set that could not be returned. One of the Finbourne.Insights.WebApi.Dtos.Metrics.MetricDataSet values, and identical to the name of the Finbourne.Insights.WebApi.Dtos.Metrics.MetricsResponse property that would have carried it. | [default to String]
**reason** | **String** | A generic, caller-safe explanation of why the data set is missing. Never contains provider names, query text, internal service names or exception detail. | [default to String]

```java
import com.finbourne.insights.model.MetricDataSetFailure;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Reason = "example Reason";


MetricDataSetFailure metricDataSetFailureInstance = new MetricDataSetFailure()
    .Name(Name)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
