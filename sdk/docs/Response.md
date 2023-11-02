

# Response

DTO of Finbourne.AspNetCore.Http.TrackingEntry.ResponseInformation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**headers** | **Map&lt;String, List&lt;String&gt;&gt;** | The headers |  [optional] |
|**contentLength** | **Long** | The actual length of the body, which may be larger than the data recorded in Finbourne.Insights.WebApi.Dtos.Response.Body  (e.g. if actual Body is large, or not convertible to a string) |  [optional] |
|**contentType** | **String** | The content type |  [optional] |
|**body** | **String** | The recorded content. |  [optional] |
|**bodyWasTruncated** | **Boolean** | Determines if the recorded body was truncated. |  [optional] |
|**statusCode** | **Integer** | Http Status Code of the request. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



