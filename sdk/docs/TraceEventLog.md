

# TraceEventLog

Holds information about a trace event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**traceEventId** | **String** | The identifier of the trace event. |  |
|**traceId** | **String** | The identifier of the parent trace. |  |
|**createdAt** | **OffsetDateTime** | The datetime at which the trace event was created. |  |
|**eventType** | **String** | The type of the trace event. |  |
|**content** | **String** | The content of the trace event. |  |
|**sessionId** | **String** | The session ID of the trace event. |  |
|**circuitId** | **String** | The ID of the circuit in which the trace event occurred. |  |
|**circuitVersion** | **String** | The version of the circuit in which the trace event occurred. |  |
|**nodeId** | **String** | The ID of the circuit&#39;s node at which the trace event occured. |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


