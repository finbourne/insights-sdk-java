# com.finbourne.insights.model.AuditEntryNote

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** |  | [default to String]
**text** | **String** |  | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]

```java
import com.finbourne.insights.model.AuditEntryNote;
import java.util.*;
import java.lang.System;
import java.net.URI;

String UserId = "example UserId";
String Text = "example Text";
OffsetDateTime Date = OffsetDateTime.now();


AuditEntryNote auditEntryNoteInstance = new AuditEntryNote()
    .UserId(UserId)
    .Text(Text)
    .Date(Date);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
