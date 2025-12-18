# com.finbourne.insights.model.VendorLog
Holds logged information about a request made to an external vendor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of a log entry. | [default to String]
**provider** | **String** | The provider or service name. | [default to String]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of when the log was generated. | [default to OffsetDateTime]
**type** | **String** | Type of log. Possible values: HttpResponse. | [default to String]
**destinationUrl** | **String** | The destination URL of the task. | [default to String]
**operation** | **String** | The operation performed. Possible values: Evaluate. | [default to String]
**outcome** | **String** | The outcome of the operation. Possible values: Success, Failure. | [default to String]
**duration** | **java.math.BigDecimal** | The duration of the operation in ms. | [default to java.math.BigDecimal]
**httpStatusCode** | **Integer** | The status code of the operation. | [default to Integer]
**userId** | **String** | The user that made the request to LUSID. | [default to String]
**requestId** | **String** | The ID of the request to LUSID. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.insights.model.VendorLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String Provider = "example Provider";
OffsetDateTime Timestamp = OffsetDateTime.now();
String Type = "example Type";
String DestinationUrl = "example DestinationUrl";
String Operation = "example Operation";
String Outcome = "example Outcome";
java.math.BigDecimal Duration = new java.math.BigDecimal("100.00");
Integer HttpStatusCode = new Integer("100.00");
String UserId = "example UserId";
String RequestId = "example RequestId";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


VendorLog vendorLogInstance = new VendorLog()
    .Id(Id)
    .Provider(Provider)
    .Timestamp(Timestamp)
    .Type(Type)
    .DestinationUrl(DestinationUrl)
    .Operation(Operation)
    .Outcome(Outcome)
    .Duration(Duration)
    .HttpStatusCode(HttpStatusCode)
    .UserId(UserId)
    .RequestId(RequestId)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
