# com.finbourne.insights.model.ScrollableCollectionOfAuditEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List&lt;AuditEntry&gt;**](AuditEntry.md) |  | [optional] [default to List<AuditEntry>]
**state** | **String** |  | [optional] [default to String]

```java
import com.finbourne.insights.model.ScrollableCollectionOfAuditEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<AuditEntry> Data = new List<AuditEntry>();
@jakarta.annotation.Nullable String State = "example State";


ScrollableCollectionOfAuditEntry scrollableCollectionOfAuditEntryInstance = new ScrollableCollectionOfAuditEntry()
    .Data(Data)
    .State(State);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
