# com.finbourne.insights.model.TextComparator
Filters a text field. Single-value operations (EqualTo, NotEqualTo, StartsWith, EndsWith) compare the field to Finbourne.Insights.WebApi.Dtos.Querying.TextComparator.Value; set operations (In, NotIn) compare it to Finbourne.Insights.WebApi.Dtos.Querying.TextComparator.Values. Exactly one of Finbourne.Insights.WebApi.Dtos.Querying.TextComparator.Value or Finbourne.Insights.WebApi.Dtos.Querying.TextComparator.Values is supplied, matching the chosen Finbourne.Insights.WebApi.Dtos.Querying.TextComparator.Operation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** | The comparison to apply between the field and the supplied value(s). One of the Finbourne.Insights.WebApi.Dtos.Querying.TextOperation values (e.g. EqualTo, StartsWith, In); discoverable via the queryable-fields metadata endpoint. | [default to String]
**value** | **String** | The value to compare the field against, for the single-value operations (EqualTo, NotEqualTo, StartsWith, EndsWith). | [optional] [default to String]
**values** | **List&lt;String&gt;** | The set of values to compare the field against, for the set operations (In, NotIn). | [optional] [default to List<String>]

```java
import com.finbourne.insights.model.TextComparator;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Operation = "example Operation";
@jakarta.annotation.Nullable String Value = "example Value";
@jakarta.annotation.Nullable List<String> Values = new List<String>();


TextComparator textComparatorInstance = new TextComparator()
    .Operation(Operation)
    .Value(Value)
    .Values(Values);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
