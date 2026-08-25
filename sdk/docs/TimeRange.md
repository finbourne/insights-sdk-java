# com.finbourne.insights.model.TimeRange
A server-resolved time window for a query, as an alternative to supplying absolute StartAt/EndAt. Supply either a Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.Preset (e.g. LastWeek, CurrentMonth) or a relative range via Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.From and Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.To. The window is resolved on the server at query time, so a saved query re-runs against a sliding window. Calendar boundaries are anchored in Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.TimeZone (default UTC); weeks start on Monday.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preset** | **String** | A named preset window. One of the Finbourne.Insights.WebApi.Dtos.Querying.TimeRangePreset values. Mutually exclusive with Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.From/Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.To. | [optional] [default to String]
**from** | [**RelativeBoundary**](RelativeBoundary.md) |  | [optional] [default to RelativeBoundary]
**to** | [**RelativeBoundary**](RelativeBoundary.md) |  | [optional] [default to RelativeBoundary]
**timeZone** | **String** | Optional IANA time-zone identifier (e.g. \&quot;Europe/London\&quot;) used to anchor calendar boundaries (start of day/week/month/quarter/year). Defaults to UTC when not supplied. | [optional] [default to String]

```java
import com.finbourne.insights.model.TimeRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Preset = "example Preset";
RelativeBoundary From = new RelativeBoundary();
RelativeBoundary To = new RelativeBoundary();
@jakarta.annotation.Nullable String TimeZone = "example TimeZone";


TimeRange timeRangeInstance = new TimeRange()
    .Preset(Preset)
    .From(From)
    .To(To)
    .TimeZone(TimeZone);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
