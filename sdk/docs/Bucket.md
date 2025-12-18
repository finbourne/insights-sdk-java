# com.finbourne.insights.model.Bucket
A single histogram bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The bucket&#39;s start time as a DateTimeOffset. | [optional] [default to OffsetDateTime]
**itemCount** | **Long** | The number of items in the bucket. | [optional] [default to Long]

```java
import com.finbourne.insights.model.Bucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartTime = OffsetDateTime.now();
Long ItemCount = new Long("100.00");


Bucket bucketInstance = new Bucket()
    .StartTime(StartTime)
    .ItemCount(ItemCount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
