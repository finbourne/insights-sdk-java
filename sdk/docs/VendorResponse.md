# com.finbourne.insights.model.VendorResponse
Details of a response to a request made to a vendor service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the log. | [default to String]
**response** | **String** | The body of the response. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.insights.model.VendorResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String Response = "example Response";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


VendorResponse vendorResponseInstance = new VendorResponse()
    .Id(Id)
    .Response(Response)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
