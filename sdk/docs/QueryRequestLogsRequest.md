# com.finbourne.insights.model.QueryRequestLogsRequest
Body of the QueryRequestLogs endpoint. A query is bounded by a time range (Finbourne.Insights.WebApi.Dtos.QueryRequestLogsRequest.StartAt/Finbourne.Insights.WebApi.Dtos.QueryRequestLogsRequest.EndAt) and refined by an optional set of Finbourne.Insights.WebApi.Dtos.QueryRequestLogsRequest.Filters that are combined with logical AND. The discoverable set of filterable fields, their data types and the operations available for each is returned by the queryable-fields metadata endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startAt** | [**OffsetDateTime**](OffsetDateTime.md) | The inclusive start of the time range to query. Required unless Finbourne.Insights.WebApi.Dtos.QueryRequestLogsRequest.Page is supplied. Used to bound the underlying partition scan, so a tighter range is cheaper and faster. | [optional] [default to OffsetDateTime]
**endAt** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the time range to query. Required unless Finbourne.Insights.WebApi.Dtos.QueryRequestLogsRequest.Page or Finbourne.Insights.WebApi.Dtos.QueryRequestLogsRequest.TimeRange is supplied. | [optional] [default to OffsetDateTime]
**timeRange** | [**TimeRange**](TimeRange.md) |  | [optional] [default to TimeRange]
**filters** | [**List&lt;InsightsFilter&gt;**](InsightsFilter.md) | Optional filters to apply, combined with logical AND. Each filter targets a filterable field and supplies exactly one comparator matching that field&#39;s data type. | [optional] [default to List<InsightsFilter>]
**sortBy** | **String** | Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName. | [optional] [default to String]
**maxResults** | **Integer** | The maximum total number of records to capture in the result set; applied as the Luminesce query limit and so bounding the work the query performs. The minimum value is 1 and the maximum is 10000; defaults to 500 when not supplied. The per-page limit then controls how many of these captured records are returned per page. | [optional] [default to Integer]
**limit** | **Integer** | When paginating, only return this number of records per page. The minimum value is 0 (return all captured records in a single page) and the maximum is 10000. | [optional] [default to Integer]
**page** | **String** | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, the query-defining fields should not be supplied. | [optional] [default to String]
**fields** | **List&lt;String&gt;** | Optional list of additional field names to include in the response. The fields Timestamp, Id, Application and Operation are always returned. Values are matched case-insensitively against the queryable fields of the request logs. | [optional] [default to List<String>]

```java
import com.finbourne.insights.model.QueryRequestLogsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime StartAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EndAt = OffsetDateTime.now();
TimeRange TimeRange = new TimeRange();
@jakarta.annotation.Nullable List<InsightsFilter> Filters = new List<InsightsFilter>();
@jakarta.annotation.Nullable String SortBy = "example SortBy";
@jakarta.annotation.Nullable Integer MaxResults = new Integer("100.00");
Integer Limit = new Integer("100.00");
@jakarta.annotation.Nullable String Page = "example Page";
@jakarta.annotation.Nullable List<String> Fields = new List<String>();


QueryRequestLogsRequest queryRequestLogsRequestInstance = new QueryRequestLogsRequest()
    .StartAt(StartAt)
    .EndAt(EndAt)
    .TimeRange(TimeRange)
    .Filters(Filters)
    .SortBy(SortBy)
    .MaxResults(MaxResults)
    .Limit(Limit)
    .Page(Page)
    .Fields(Fields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
