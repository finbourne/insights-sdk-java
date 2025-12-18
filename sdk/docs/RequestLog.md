# com.finbourne.insights.model.RequestLog
Holds logged information about a request performed on an API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the request. | [default to OffsetDateTime]
**application** | **String** | The name of the application that the request was made to. | [default to String]
**id** | **String** | The identifier of the request. | [default to String]
**sessionId** | **String** | The identifier of the session that the request was made in. | [optional] [default to String]
**verb** | **String** | The HTTP verb of the request. | [default to String]
**url** | **String** | The URL of the request. | [default to String]
**domain** | **String** | The domain of the request. | [optional] [default to String]
**user** | **String** | The user who made the request. | [default to String]
**userType** | **String** | The type of the user who made the request. | [optional] [default to String]
**operation** | **String** | The API operation invoked by the request. | [optional] [default to String]
**outcome** | **String** | The outcome of the request: Completed, Errored or Failed. | [default to String]
**duration** | **java.math.BigDecimal** | The duration of the request in milliseconds. | [default to java.math.BigDecimal]
**httpStatusCode** | **Integer** | The status code of the request. | [default to Integer]
**errorCode** | **String** | Error code, if the request had a failure or error. | [optional] [default to String]
**sdkLanguage** | **String** | The language of the SDK used. | [optional] [default to String]
**sdkVersion** | **String** | The version of the SDK used. | [optional] [default to String]
**sourceApplication** | **String** | The name of the application that made the request. | [optional] [default to String]
**correlationId** | **List&lt;String&gt;** | The chain of requestIds preceding this request | [optional] [default to List<String>]
**impersonatingUser** | **String** | The impersonating user. Only present if the request is an impersonated one | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.insights.model.RequestLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Timestamp = OffsetDateTime.now();
String Application = "example Application";
String Id = "example Id";
@jakarta.annotation.Nullable String SessionId = "example SessionId";
String Verb = "example Verb";
String Url = "example Url";
@jakarta.annotation.Nullable String Domain = "example Domain";
String User = "example User";
@jakarta.annotation.Nullable String UserType = "example UserType";
@jakarta.annotation.Nullable String Operation = "example Operation";
String Outcome = "example Outcome";
java.math.BigDecimal Duration = new java.math.BigDecimal("100.00");
Integer HttpStatusCode = new Integer("100.00");
@jakarta.annotation.Nullable String ErrorCode = "example ErrorCode";
@jakarta.annotation.Nullable String SdkLanguage = "example SdkLanguage";
@jakarta.annotation.Nullable String SdkVersion = "example SdkVersion";
@jakarta.annotation.Nullable String SourceApplication = "example SourceApplication";
@jakarta.annotation.Nullable List<String> CorrelationId = new List<String>();
@jakarta.annotation.Nullable String ImpersonatingUser = "example ImpersonatingUser";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RequestLog requestLogInstance = new RequestLog()
    .Timestamp(Timestamp)
    .Application(Application)
    .Id(Id)
    .SessionId(SessionId)
    .Verb(Verb)
    .Url(Url)
    .Domain(Domain)
    .User(User)
    .UserType(UserType)
    .Operation(Operation)
    .Outcome(Outcome)
    .Duration(Duration)
    .HttpStatusCode(HttpStatusCode)
    .ErrorCode(ErrorCode)
    .SdkLanguage(SdkLanguage)
    .SdkVersion(SdkVersion)
    .SourceApplication(SourceApplication)
    .CorrelationId(CorrelationId)
    .ImpersonatingUser(ImpersonatingUser)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
