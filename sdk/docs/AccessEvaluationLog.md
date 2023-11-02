

# AccessEvaluationLog

Holds logged information about an access check performed on an API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **OffsetDateTime** | The timestamp of the access evaluation. |  |
|**application** | **String** | The name of the application that the request was made from. |  |
|**id** | **String** | The ID of the access evaluation. |  |
|**requestId** | **String** | The identifier of the request. |  [optional] |
|**sessionId** | **String** | The identifier of the session that the request was made in. |  [optional] |
|**user** | **String** | The user who made the request. |  |
|**userType** | **String** | The type of the user who made the request. |  [optional] |
|**duration** | **java.math.BigDecimal** | The duration of the access evaluation. |  |
|**result** | **String** | The result of the access evaluation. |  [optional] |
|**authoritativeRoleId** | **String** | The role that matched the access evaluation to provide a result. |  [optional] |
|**authoritativePolicyId** | **String** | The policy that matched the access evaluation to provide a result. |  [optional] |
|**authoritativeSelector** | **String** | The selector that matched the access evaluation to provide a result. |  [optional] |
|**resourceType** | **String** | The type of the resource that the access evaluation is for. |  [optional] |
|**action** | **String** | The action key of the access evaluation. |  [optional] |
|**resource** | **Map&lt;String, String&gt;** | The ID of the resource that the access evaluation is for. If the ResourceID could not be converted to a dictionary, it will return a single-value dictionary with the key \&quot;resourceId\&quot;. |  [optional] |
|**resourceFromEffectiveDate** | **String** | The From effective date of the resource. |  [optional] |
|**resourceToEffectiveDate** | **String** | The To effective date of the resource. |  [optional] |
|**resourceFromAsAt** | **String** | The From AsAt date of the resource. |  [optional] |
|**resourceToAsAt** | **String** | The To AsAt date of the resource. |  [optional] |
|**accessExecutionTime** | **String** | The execution time of the entitlement. |  [optional] |
|**accessAsAtTime** | **String** | The AsAt time of the entitlement. |  [optional] |
|**requiredLicencePolicyId** | **String** | ID of the required licence policy. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



