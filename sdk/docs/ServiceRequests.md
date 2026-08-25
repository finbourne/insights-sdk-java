# com.finbourne.insights.model.ServiceRequests
The request volume and server-error rate for a single service over the window.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service** | **String** | The name of the service (application) that handled the requests. | [optional] [default to String]
**totalRequests** | **Long** | The number of requests over the window, or null if not reported. | [optional] [default to Long]
**requests5xx** | **Long** | The number of requests over the window that returned a 5xx status code, or null if not reported. | [optional] [default to Long]
**pct5xx** | **java.math.BigDecimal** | The percentage of requests that returned a 5xx status code, or null if not reported. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.insights.model.ServiceRequests;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Service = "example Service";
@jakarta.annotation.Nullable Long TotalRequests = new Long("100.00");
@jakarta.annotation.Nullable Long Requests5xx = new Long("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Pct5xx = new java.math.BigDecimal("100.00");


ServiceRequests serviceRequestsInstance = new ServiceRequests()
    .Service(Service)
    .TotalRequests(TotalRequests)
    .Requests5xx(Requests5xx)
    .Pct5xx(Pct5xx);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
