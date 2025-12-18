# com.finbourne.insights.model.AccessEvaluationLog
Holds logged information about an access check performed on an API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the access evaluation. | [default to OffsetDateTime]
**application** | **String** | The name of the application that the request was made from. | [default to String]
**id** | **String** | The ID of the access evaluation. | [default to String]
**requestId** | **String** | The identifier of the request. | [optional] [default to String]
**sessionId** | **String** | The identifier of the session that the request was made in. | [optional] [default to String]
**user** | **String** | The user who made the request. | [default to String]
**userType** | **String** | The type of the user who made the request. | [optional] [default to String]
**duration** | **java.math.BigDecimal** | The duration of the access evaluation. | [default to java.math.BigDecimal]
**result** | **String** | The result of the access evaluation. | [optional] [default to String]
**authoritativeRoleId** | **String** | The role that matched the access evaluation to provide a result. | [optional] [default to String]
**authoritativePolicyId** | **String** | The policy that matched the access evaluation to provide a result. | [optional] [default to String]
**authoritativeSelector** | **String** | The selector that matched the access evaluation to provide a result. | [optional] [default to String]
**resourceType** | **String** | The type of the resource that the access evaluation is for. | [optional] [default to String]
**action** | **String** | The action key of the access evaluation. | [optional] [default to String]
**resource** | **Map&lt;String, String&gt;** | The ID of the resource that the access evaluation is for. If the ResourceID could not be converted to a dictionary, it will return a single-value dictionary with the key \&quot;resourceId\&quot;. | [optional] [default to Map<String, String>]
**resourceFromEffectiveDate** | **String** | The From effective date of the resource. | [optional] [default to String]
**resourceToEffectiveDate** | **String** | The To effective date of the resource. | [optional] [default to String]
**resourceFromAsAt** | **String** | The From AsAt date of the resource. | [optional] [default to String]
**resourceToAsAt** | **String** | The To AsAt date of the resource. | [optional] [default to String]
**accessExecutionTime** | **String** | The execution time of the entitlement. | [optional] [default to String]
**accessAsAtTime** | **String** | The AsAt time of the entitlement. | [optional] [default to String]
**requiredLicencePolicyId** | **String** | ID of the required licence policy. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.insights.model.AccessEvaluationLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Timestamp = OffsetDateTime.now();
String Application = "example Application";
String Id = "example Id";
@jakarta.annotation.Nullable String RequestId = "example RequestId";
@jakarta.annotation.Nullable String SessionId = "example SessionId";
String User = "example User";
@jakarta.annotation.Nullable String UserType = "example UserType";
java.math.BigDecimal Duration = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Result = "example Result";
@jakarta.annotation.Nullable String AuthoritativeRoleId = "example AuthoritativeRoleId";
@jakarta.annotation.Nullable String AuthoritativePolicyId = "example AuthoritativePolicyId";
@jakarta.annotation.Nullable String AuthoritativeSelector = "example AuthoritativeSelector";
@jakarta.annotation.Nullable String ResourceType = "example ResourceType";
@jakarta.annotation.Nullable String Action = "example Action";
@jakarta.annotation.Nullable Map<String, String> Resource = new Map<String, String>();
@jakarta.annotation.Nullable String ResourceFromEffectiveDate = "example ResourceFromEffectiveDate";
@jakarta.annotation.Nullable String ResourceToEffectiveDate = "example ResourceToEffectiveDate";
@jakarta.annotation.Nullable String ResourceFromAsAt = "example ResourceFromAsAt";
@jakarta.annotation.Nullable String ResourceToAsAt = "example ResourceToAsAt";
@jakarta.annotation.Nullable String AccessExecutionTime = "example AccessExecutionTime";
@jakarta.annotation.Nullable String AccessAsAtTime = "example AccessAsAtTime";
@jakarta.annotation.Nullable String RequiredLicencePolicyId = "example RequiredLicencePolicyId";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AccessEvaluationLog accessEvaluationLogInstance = new AccessEvaluationLog()
    .Timestamp(Timestamp)
    .Application(Application)
    .Id(Id)
    .RequestId(RequestId)
    .SessionId(SessionId)
    .User(User)
    .UserType(UserType)
    .Duration(Duration)
    .Result(Result)
    .AuthoritativeRoleId(AuthoritativeRoleId)
    .AuthoritativePolicyId(AuthoritativePolicyId)
    .AuthoritativeSelector(AuthoritativeSelector)
    .ResourceType(ResourceType)
    .Action(Action)
    .Resource(Resource)
    .ResourceFromEffectiveDate(ResourceFromEffectiveDate)
    .ResourceToEffectiveDate(ResourceToEffectiveDate)
    .ResourceFromAsAt(ResourceFromAsAt)
    .ResourceToAsAt(ResourceToAsAt)
    .AccessExecutionTime(AccessExecutionTime)
    .AccessAsAtTime(AccessAsAtTime)
    .RequiredLicencePolicyId(RequiredLicencePolicyId)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
