# com.finbourne.insights.model.AuditProcess

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**runId** | **String** |  | [default to String]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**succeeded** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.insights.model.AuditProcess;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String RunId = "example RunId";
OffsetDateTime StartTime = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EndTime = OffsetDateTime.now();
@jakarta.annotation.Nullable Boolean Succeeded = true;


AuditProcess auditProcessInstance = new AuditProcess()
    .Name(Name)
    .RunId(RunId)
    .StartTime(StartTime)
    .EndTime(EndTime)
    .Succeeded(Succeeded);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
