# com.finbourne.insights.model.ResourceListWithHistogramOfRequestLog
ResourceList with additional aggregation data about the values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**histogram** | [**Histogram**](Histogram.md) |  | [optional] [default to Histogram]
**values** | [**List&lt;RequestLog&gt;**](RequestLog.md) |  | [default to List<RequestLog>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.insights.model.ResourceListWithHistogramOfRequestLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

Histogram Histogram = new Histogram();
List<RequestLog> Values = new List<RequestLog>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ResourceListWithHistogramOfRequestLog resourceListWithHistogramOfRequestLogInstance = new ResourceListWithHistogramOfRequestLog()
    .Histogram(Histogram)
    .Values(Values)
    .Href(Href)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
