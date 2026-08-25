# com.finbourne.insights.model.ServiceEndpointDuration
The request duration distribution for a single service and endpoint over the window.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service** | **String** | The name of the service (application) that handled the requests. | [optional] [default to String]
**endpoint** | **String** | The endpoint (API operation) the requests were made to. | [optional] [default to String]
**totalRequests** | **Long** | The number of requests over the window, or null if not reported. | [optional] [default to Long]
**meanDurationMs** | **java.math.BigDecimal** | The mean request duration in milliseconds, or null if not reported. | [optional] [default to java.math.BigDecimal]
**medianDurationMs** | **java.math.BigDecimal** | The median (50th percentile) request duration in milliseconds, or null if not reported. | [optional] [default to java.math.BigDecimal]
**p95DurationMs** | **java.math.BigDecimal** | The 95th percentile request duration in milliseconds, or null if not reported. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.insights.model.ServiceEndpointDuration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Service = "example Service";
@jakarta.annotation.Nullable String Endpoint = "example Endpoint";
@jakarta.annotation.Nullable Long TotalRequests = new Long("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MeanDurationMs = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MedianDurationMs = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal P95DurationMs = new java.math.BigDecimal("100.00");


ServiceEndpointDuration serviceEndpointDurationInstance = new ServiceEndpointDuration()
    .Service(Service)
    .Endpoint(Endpoint)
    .TotalRequests(TotalRequests)
    .MeanDurationMs(MeanDurationMs)
    .MedianDurationMs(MedianDurationMs)
    .P95DurationMs(P95DurationMs);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
