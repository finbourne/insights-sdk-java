# com.finbourne.insights.model.RelativeBoundary
One end of a relative time range. Exactly one of the options must be set: Finbourne.Insights.WebApi.Dtos.Querying.RelativeBoundary.Now (the current instant), Finbourne.Insights.WebApi.Dtos.Querying.RelativeBoundary.Midnight (the start of the current day in the range's time zone), Finbourne.Insights.WebApi.Dtos.Querying.RelativeBoundary.Offset (a duration back from now) or Finbourne.Insights.WebApi.Dtos.Querying.RelativeBoundary.Absolute (an explicit instant).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**now** | **Boolean** | When &#x60;true&#x60;, this boundary is the current instant (\&quot;now\&quot;). | [optional] [default to Boolean]
**midnight** | **Boolean** | When &#x60;true&#x60;, this boundary is the start of the current day (midnight) in the range&#39;s time zone. | [optional] [default to Boolean]
**offset** | [**RelativeOffset**](RelativeOffset.md) |  | [optional] [default to RelativeOffset]
**absolute** | [**OffsetDateTime**](OffsetDateTime.md) | An explicit absolute instant. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.insights.model.RelativeBoundary;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Now = true;
Boolean Midnight = true;
RelativeOffset Offset = new RelativeOffset();
@jakarta.annotation.Nullable OffsetDateTime Absolute = OffsetDateTime.now();


RelativeBoundary relativeBoundaryInstance = new RelativeBoundary()
    .Now(Now)
    .Midnight(Midnight)
    .Offset(Offset)
    .Absolute(Absolute);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
