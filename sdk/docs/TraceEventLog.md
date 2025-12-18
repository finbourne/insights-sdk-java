# com.finbourne.insights.model.TraceEventLog
Holds information about a trace event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**traceEventId** | **String** | The identifier of the trace event. | [default to String]
**traceId** | **String** | The identifier of the parent trace. | [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime at which the trace event was created. | [default to OffsetDateTime]
**eventType** | **String** | The type of the trace event. | [default to String]
**origin** | **String** | Whether the event originated from the AI or the user | [default to String]
**content** | **String** | The content of the trace event. | [default to String]
**agentScope** | **String** | The scope of the agent currently being interacted with | [default to String]
**agentCode** | **String** | The code identifier of the agent currently being interacted with | [default to String]
**agentVersion** | **Integer** | The version of the circuit in which the trace event occurred. | [default to Integer]
**nodeId** | **String** | The ID of the circuit&#39;s node at which the trace event occured. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.insights.model.TraceEventLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TraceEventId = "example TraceEventId";
String TraceId = "example TraceId";
OffsetDateTime CreatedAt = OffsetDateTime.now();
String EventType = "example EventType";
String Origin = "example Origin";
String Content = "example Content";
String AgentScope = "example AgentScope";
String AgentCode = "example AgentCode";
Integer AgentVersion = new Integer("100.00");
String NodeId = "example NodeId";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TraceEventLog traceEventLogInstance = new TraceEventLog()
    .TraceEventId(TraceEventId)
    .TraceId(TraceId)
    .CreatedAt(CreatedAt)
    .EventType(EventType)
    .Origin(Origin)
    .Content(Content)
    .AgentScope(AgentScope)
    .AgentCode(AgentCode)
    .AgentVersion(AgentVersion)
    .NodeId(NodeId)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
