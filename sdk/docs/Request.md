# com.finbourne.insights.model.Request
DTO of Finbourne.AspNetCore.Http.TrackingEntry.RequestInformation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | The headers | [optional] [default to Map<String, List<String>>]
**contentLength** | **Long** | The actual length of the body, which may be larger than the data recorded in Finbourne.Insights.WebApi.Dtos.Request.Body (e.g. if actual Body is large, or not convertible to a string) | [optional] [default to Long]
**contentType** | **String** | The content type | [optional] [default to String]
**body** | **String** | The recorded content. | [optional] [default to String]
**bodyWasTruncated** | **Boolean** | Determines if the recorded body was truncated. | [optional] [default to Boolean]
**method** | **String** | Method called by the request | [optional] [default to String]
**url** | **String** | URL of the request | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.insights.model.Request;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, List<String>> Headers = new Map<String, List<String>>();
@jakarta.annotation.Nullable Long ContentLength = new Long("100.00");
@jakarta.annotation.Nullable String ContentType = "example ContentType";
@jakarta.annotation.Nullable String Body = "example Body";
Boolean BodyWasTruncated = true;
@jakarta.annotation.Nullable String Method = "example Method";
@jakarta.annotation.Nullable String Url = "example Url";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Request requestInstance = new Request()
    .Headers(Headers)
    .ContentLength(ContentLength)
    .ContentType(ContentType)
    .Body(Body)
    .BodyWasTruncated(BodyWasTruncated)
    .Method(Method)
    .Url(Url)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
