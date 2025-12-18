# com.finbourne.insights.model.TraceLog
Holds metadata for a trace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**traceId** | **String** | The identifier of the trace. | [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime at which the trace was created. | [default to OffsetDateTime]
**userId** | **String** | The id of the user who created the trace. | [default to String]
**description** | **String** | The description of the trace. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.insights.model.TraceLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TraceId = "example TraceId";
OffsetDateTime CreatedAt = OffsetDateTime.now();
String UserId = "example UserId";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TraceLog traceLogInstance = new TraceLog()
    .TraceId(TraceId)
    .CreatedAt(CreatedAt)
    .UserId(UserId)
    .Description(Description)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
