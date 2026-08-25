# com.finbourne.insights.model.RelativeOffset
A relative offset back from \"now\", e.g. `{ Amount = 2, Unit = Hours }` meaning two hours before now.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Integer** | The number of units to go back from now. Must be at least 1. | [default to Integer]
**unit** | **String** | The unit of the offset. One of the Finbourne.Insights.WebApi.Dtos.Querying.RelativeTimeUnit values. | [default to String]

```java
import com.finbourne.insights.model.RelativeOffset;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Amount = new Integer("100.00");
String Unit = "example Unit";


RelativeOffset relativeOffsetInstance = new RelativeOffset()
    .Amount(Amount)
    .Unit(Unit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
