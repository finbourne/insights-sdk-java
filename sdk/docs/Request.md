

# Request

DTO of Finbourne.AspNetCore.Http.TrackingEntry.RequestInformation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**headers** | **Map&lt;String, List&lt;String&gt;&gt;** | The headers |  [optional] |
|**contentLength** | **Long** | The actual length of the body, which may be larger than the data recorded in Finbourne.Insights.WebApi.Dtos.Request.Body  (e.g. if actual Body is large, or not convertible to a string) |  [optional] |
|**contentType** | **String** | The content type |  [optional] |
|**body** | **String** | The recorded content. |  [optional] |
|**bodyWasTruncated** | **Boolean** | Determines if the recorded body was truncated. |  [optional] |
|**method** | **String** | Method called by the request |  [optional] |
|**url** | **String** | URL of the request |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


