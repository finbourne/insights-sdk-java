# com.finbourne.insights.model.Histogram
A histogram showing an item's count in buckets of equal timespans.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buckets** | [**List&lt;Bucket&gt;**](Bucket.md) | An ordered list of the histogram buckets. | [optional] [default to List<Bucket>]

```java
import com.finbourne.insights.model.Histogram;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<Bucket> Buckets = new List<Bucket>();


Histogram histogramInstance = new Histogram()
    .Buckets(Buckets);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
