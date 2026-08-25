# com.finbourne.insights.model.QueryableLogType
The queryable fields of a single log type, returned by the queryable-fields metadata endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logType** | **String** | The log type, e.g. Requests, Vendor, Access, Trace or TraceEvent. | [default to String]
**fields** | [**List&lt;QueryableLogField&gt;**](QueryableLogField.md) | The fields of this log type that can be selected and/or filtered. | [default to List<QueryableLogField>]

```java
import com.finbourne.insights.model.QueryableLogType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String LogType = "example LogType";
List<QueryableLogField> Fields = new List<QueryableLogField>();


QueryableLogType queryableLogTypeInstance = new QueryableLogType()
    .LogType(LogType)
    .Fields(Fields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
