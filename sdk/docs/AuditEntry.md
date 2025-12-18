# com.finbourne.insights.model.AuditEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**process** | [**AuditProcess**](AuditProcess.md) |  | [default to AuditProcess]
**data** | [**AuditData**](AuditData.md) |  | [default to AuditData]
**notes** | [**List&lt;AuditEntryNote&gt;**](AuditEntryNote.md) |  | [optional] [default to List<AuditEntryNote>]

```java
import com.finbourne.insights.model.AuditEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
OffsetDateTime Date = OffsetDateTime.now();
AuditProcess Process = new AuditProcess();
AuditData Data = new AuditData();
@jakarta.annotation.Nullable List<AuditEntryNote> Notes = new List<AuditEntryNote>();


AuditEntry auditEntryInstance = new AuditEntry()
    .Id(Id)
    .Date(Date)
    .Process(Process)
    .Data(Data)
    .Notes(Notes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
