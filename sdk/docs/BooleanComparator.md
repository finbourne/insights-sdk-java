# com.finbourne.insights.model.BooleanComparator
Filters a boolean field by comparing it to a supplied boolean value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** | The comparison to apply between the field and Finbourne.Insights.WebApi.Dtos.Querying.BooleanComparator.Value. One of the Finbourne.Insights.WebApi.Dtos.Querying.BooleanOperation values (EqualTo, NotEqualTo); discoverable via the queryable-fields metadata endpoint. | [default to String]
**value** | **Boolean** | The value to compare the field against. | [default to Boolean]

```java
import com.finbourne.insights.model.BooleanComparator;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Operation = "example Operation";
Boolean Value = true;


BooleanComparator booleanComparatorInstance = new BooleanComparator()
    .Operation(Operation)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
