# com.finbourne.insights.model.QueryableLogField
Describes a field of a log type that can be selected and (where Finbourne.Insights.WebApi.Dtos.Querying.QueryableLogField.Filterable is set) filtered when querying logs, including the comparator operations available for it. Returned by the queryable-fields metadata endpoint so a UI can advertise the correct comparators for each field.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the field, as used when requesting it or filtering on it (case-insensitive). | [default to String]
**dataType** | **String** | The data type of the field: Text, Numeric, Date or Boolean. | [default to String]
**supportedOperations** | **List&lt;String&gt;** | The comparator operations available for this field. Empty when the field is not filterable. | [default to List<String>]
**filterable** | **Boolean** | Whether the field can be used in a filter. | [optional] [default to Boolean]
**alwaysReturned** | **Boolean** | Whether the field is always returned (and therefore need not be requested). | [optional] [default to Boolean]

```java
import com.finbourne.insights.model.QueryableLogField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String DataType = "example DataType";
List<String> SupportedOperations = new List<String>();
Boolean Filterable = true;
Boolean AlwaysReturned = true;


QueryableLogField queryableLogFieldInstance = new QueryableLogField()
    .Name(Name)
    .DataType(DataType)
    .SupportedOperations(SupportedOperations)
    .Filterable(Filterable)
    .AlwaysReturned(AlwaysReturned);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
