

# RequestLog

Holds logged information about a request performed on an API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **OffsetDateTime** | The timestamp of the request. |  |
|**application** | **String** | The name of the application that the request was made to. |  |
|**id** | **String** | The identifier of the request. |  |
|**sessionId** | **String** | The identifier of the session that the request was made in. |  [optional] |
|**verb** | **String** | The HTTP verb of the request. |  |
|**url** | **String** | The URL of the request. |  |
|**domain** | **String** | The domain of the request. |  [optional] |
|**user** | **String** | The user who made the request. |  |
|**userType** | **String** | The type of the user who made the request. |  [optional] |
|**operation** | **String** | The API operation invoked by the request. |  [optional] |
|**outcome** | **String** | The outcome of the request: Success, Failure or Error. |  |
|**duration** | **java.math.BigDecimal** | The duration of the request in milliseconds. |  |
|**httpStatusCode** | **Integer** | The status code of the request. |  |
|**errorCode** | **String** | Error code, if the request had a failure or error. |  [optional] |
|**sdkLanguage** | **String** | The language of the SDK used. |  [optional] |
|**sdkVersion** | **String** | The version of the SDK used. |  [optional] |
|**sourceApplication** | **String** | The name of the application that made the request. |  [optional] |
|**correlationId** | **List&lt;String&gt;** | The chain of requestIds preceding this request |  [optional] |
|**impersonatingUser** | **String** | The impersonating user. Only present if the request is an impersonated one |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


