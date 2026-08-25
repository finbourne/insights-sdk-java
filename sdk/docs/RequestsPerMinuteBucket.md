# com.finbourne.insights.model.RequestsPerMinuteBucket
One minute of request activity for a single service and endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minuteBucket** | [**OffsetDateTime**](OffsetDateTime.md) | Start of the whole minute this row covers, in UTC. | [default to OffsetDateTime]
**service** | **String** | The name of the service (application) that handled the requests. | [optional] [default to String]
**endpoint** | **String** | The endpoint (API operation) the requests were made to. | [optional] [default to String]
**totalRequests** | **Long** | The number of requests in this minute, or null if not reported. | [optional] [default to Long]
**requests5xx** | **Long** | The number of requests in this minute that returned a 5xx status code, or null if not reported. | [optional] [default to Long]
**durationSumMs** | **java.math.BigDecimal** | The sum of the request durations in this minute, in milliseconds, or null if not reported. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.insights.model.RequestsPerMinuteBucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime MinuteBucket = OffsetDateTime.now();
@jakarta.annotation.Nullable String Service = "example Service";
@jakarta.annotation.Nullable String Endpoint = "example Endpoint";
@jakarta.annotation.Nullable Long TotalRequests = new Long("100.00");
@jakarta.annotation.Nullable Long Requests5xx = new Long("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DurationSumMs = new java.math.BigDecimal("100.00");


RequestsPerMinuteBucket requestsPerMinuteBucketInstance = new RequestsPerMinuteBucket()
    .MinuteBucket(MinuteBucket)
    .Service(Service)
    .Endpoint(Endpoint)
    .TotalRequests(TotalRequests)
    .Requests5xx(Requests5xx)
    .DurationSumMs(DurationSumMs);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
