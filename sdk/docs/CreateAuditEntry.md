# com.finbourne.insights.model.CreateAuditEntry
Details to create an audit entry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**process** | [**AuditProcess**](AuditProcess.md) |  | [default to AuditProcess]
**data** | [**AuditData**](AuditData.md) |  | [default to AuditData]

```java
import com.finbourne.insights.model.CreateAuditEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

AuditProcess Process = new AuditProcess();
AuditData Data = new AuditData();


CreateAuditEntry createAuditEntryInstance = new CreateAuditEntry()
    .Process(Process)
    .Data(Data);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
