# com.finbourne.insights.model.VendorRequest
Details of a request made to a vendor service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the log. | [default to String]
**request** | **String** | The body of the request. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.insights.model.VendorRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String Request = "example Request";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


VendorRequest vendorRequestInstance = new VendorRequest()
    .Id(Id)
    .Request(Request)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
