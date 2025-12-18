# com.finbourne.insights.model.TraceDiagramEdge
Represents an edge connecting two nodes within a trace diagram.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Sequential identifier of the edge. | [optional] [default to Integer]
**nodeId** | **String** | Identifier of the parent node. | [optional] [default to String]
**childNodeId** | **String** | Identifier of the child node. | [optional] [default to String]
**label** | **String** | Label displayed for the edge. | [optional] [default to String]

```java
import com.finbourne.insights.model.TraceDiagramEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Id = new Integer("100.00");
@jakarta.annotation.Nullable String NodeId = "example NodeId";
@jakarta.annotation.Nullable String ChildNodeId = "example ChildNodeId";
@jakarta.annotation.Nullable String Label = "example Label";


TraceDiagramEdge traceDiagramEdgeInstance = new TraceDiagramEdge()
    .Id(Id)
    .NodeId(NodeId)
    .ChildNodeId(ChildNodeId)
    .Label(Label);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
