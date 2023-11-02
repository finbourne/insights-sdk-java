

# VendorLog

Holds logged information about a request made to an external vendor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier of a log entry. |  |
|**provider** | **String** | The provider or service name. |  |
|**timestamp** | **OffsetDateTime** | Timestamp of when the log was generated. |  |
|**type** | **String** | Type of log. Possible values: HttpResponse. |  |
|**destinationUrl** | **String** | The destination URL of the task. |  |
|**operation** | **String** | The operation performed. Possible values: Evaluate. |  |
|**outcome** | **String** | The outcome of the operation. Possible values: Success, Failure. |  |
|**duration** | **java.math.BigDecimal** | The duration of the operation in ms. |  |
|**httpStatusCode** | **Integer** | The status code of the operation. |  |
|**userId** | **String** | The user that made the request to LUSID. |  |
|**requestId** | **String** | The ID of the request to LUSID. |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



