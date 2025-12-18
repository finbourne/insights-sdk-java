# com.finbourne.insights.model.TraceDiagramNode
Represents a node within a trace diagram.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the node. | [optional] [default to String]
**displayName** | **String** | Display name of the node. | [optional] [default to String]
**level** | **Integer** | Depth level of the node within the diagram. | [optional] [default to Integer]
**parent** | **String** | Identifier of the node&#39;s parent. This is null for the root node. | [optional] [default to String]
**type** | **String** | Type classification of the node. | [optional] [default to String]
**agentScope** | **String** | The scope of the agent. | [optional] [default to String]
**agentVersion** | **Integer** | The version of the agent. | [optional] [default to Integer]

```java
import com.finbourne.insights.model.TraceDiagramNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
Integer Level = new Integer("100.00");
@jakarta.annotation.Nullable String Parent = "example Parent";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String AgentScope = "example AgentScope";
Integer AgentVersion = new Integer("100.00");


TraceDiagramNode traceDiagramNodeInstance = new TraceDiagramNode()
    .Id(Id)
    .DisplayName(DisplayName)
    .Level(Level)
    .Parent(Parent)
    .Type(Type)
    .AgentScope(AgentScope)
    .AgentVersion(AgentVersion);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
