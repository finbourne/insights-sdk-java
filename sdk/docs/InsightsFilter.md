# com.finbourne.insights.model.InsightsFilter
A single filter applied to a queryable log field. Exactly one comparator (Finbourne.Insights.WebApi.Dtos.Querying.InsightsFilter.Text, Finbourne.Insights.WebApi.Dtos.Querying.InsightsFilter.Numeric, Finbourne.Insights.WebApi.Dtos.Querying.InsightsFilter.Date or Finbourne.Insights.WebApi.Dtos.Querying.InsightsFilter.Boolean) must be populated, and its type must match the data type of the field named by Finbourne.Insights.WebApi.Dtos.Querying.InsightsFilter.Field. The available comparator and operation for a field can be discovered via the queryable-fields metadata endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | The name of the field to filter on (case-insensitive). Must be a filterable field of the queried log type. | [default to String]
**text** | [**TextComparator**](TextComparator.md) |  | [optional] [default to TextComparator]
**numeric** | [**NumericComparator**](NumericComparator.md) |  | [optional] [default to NumericComparator]
**date** | [**DateComparator**](DateComparator.md) |  | [optional] [default to DateComparator]
**_boolean** | [**BooleanComparator**](BooleanComparator.md) |  | [optional] [default to BooleanComparator]

```java
import com.finbourne.insights.model.InsightsFilter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Field = "example Field";
TextComparator Text = new TextComparator();
NumericComparator Numeric = new NumericComparator();
DateComparator Date = new DateComparator();
BooleanComparator Boolean = new BooleanComparator();


InsightsFilter insightsFilterInstance = new InsightsFilter()
    .Field(Field)
    .Text(Text)
    .Numeric(Numeric)
    .Date(Date)
    .Boolean(Boolean);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
