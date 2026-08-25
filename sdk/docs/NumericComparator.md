# com.finbourne.insights.model.NumericComparator
Filters a numeric field by comparing it to a supplied numeric value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** | The comparison to apply between the field and Finbourne.Insights.WebApi.Dtos.Querying.NumericComparator.Value. One of the Finbourne.Insights.WebApi.Dtos.Querying.NumericOperation values (e.g. EqualTo, GreaterThan); discoverable via the queryable-fields metadata endpoint. | [default to String]
**value** | **java.math.BigDecimal** | The value to compare the field against. | [default to java.math.BigDecimal]

```java
import com.finbourne.insights.model.NumericComparator;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Operation = "example Operation";
java.math.BigDecimal Value = new java.math.BigDecimal("100.00");


NumericComparator numericComparatorInstance = new NumericComparator()
    .Operation(Operation)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
