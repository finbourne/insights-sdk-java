# com.finbourne.insights.model.TraceDiagramResponse
Represents a trace diagram composed of nodes and edges.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodes** | [**List&lt;TraceDiagramNode&gt;**](TraceDiagramNode.md) | The nodes that make up the diagram. | [optional] [default to List<TraceDiagramNode>]
**edges** | [**List&lt;TraceDiagramEdge&gt;**](TraceDiagramEdge.md) | The edges that connect the nodes in the diagram. | [optional] [default to List<TraceDiagramEdge>]

```java
import com.finbourne.insights.model.TraceDiagramResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<TraceDiagramNode> Nodes = new List<TraceDiagramNode>();
@jakarta.annotation.Nullable List<TraceDiagramEdge> Edges = new List<TraceDiagramEdge>();


TraceDiagramResponse traceDiagramResponseInstance = new TraceDiagramResponse()
    .Nodes(Nodes)
    .Edges(Edges);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
