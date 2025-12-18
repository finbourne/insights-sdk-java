# com.finbourne.insights.model.AuditProcessSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**process** | [**AuditProcess**](AuditProcess.md) |  | [optional] [default to AuditProcess]
**latestEntry** | [**AuditData**](AuditData.md) |  | [optional] [default to AuditData]
**summary** | [**AuditDataSummary**](AuditDataSummary.md) |  | [optional] [default to AuditDataSummary]

```java
import com.finbourne.insights.model.AuditProcessSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

AuditProcess Process = new AuditProcess();
AuditData LatestEntry = new AuditData();
AuditDataSummary Summary = new AuditDataSummary();


AuditProcessSummary auditProcessSummaryInstance = new AuditProcessSummary()
    .Process(Process)
    .LatestEntry(LatestEntry)
    .Summary(Summary);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
