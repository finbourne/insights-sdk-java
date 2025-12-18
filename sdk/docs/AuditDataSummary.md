# com.finbourne.insights.model.AuditDataSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Integer** |  | [optional] [readonly] [default to Integer]
**categories** | **Map&lt;String, Integer&gt;** |  | [optional] [default to Map<String, Integer>]

```java
import com.finbourne.insights.model.AuditDataSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Count = new Integer("100.00");
@jakarta.annotation.Nullable Map<String, Integer> Categories = new Map<String, Integer>();


AuditDataSummary auditDataSummaryInstance = new AuditDataSummary()
    .Count(Count)
    .Categories(Categories);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
