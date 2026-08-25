# com.finbourne.insights.model.DateComparator
Filters a date/time field by comparing it to a supplied date/time value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** | The comparison to apply between the field and Finbourne.Insights.WebApi.Dtos.Querying.DateComparator.Value. One of the Finbourne.Insights.WebApi.Dtos.Querying.DateOperation values (e.g. Before, OnOrAfter); discoverable via the queryable-fields metadata endpoint. | [default to String]
**value** | [**OffsetDateTime**](OffsetDateTime.md) | The value to compare the field against. | [default to OffsetDateTime]

```java
import com.finbourne.insights.model.DateComparator;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Operation = "example Operation";
OffsetDateTime Value = OffsetDateTime.now();


DateComparator dateComparatorInstance = new DateComparator()
    .Operation(Operation)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
