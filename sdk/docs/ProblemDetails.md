# com.finbourne.insights.model.ProblemDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [optional] [default to String]
**title** | **String** |  | [optional] [default to String]
**status** | **Integer** |  | [optional] [default to Integer]
**detail** | **String** |  | [optional] [default to String]
**instance** | **String** |  | [optional] [default to String]

```java
import com.finbourne.insights.model.ProblemDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Title = "example Title";
@jakarta.annotation.Nullable Integer Status = new Integer("100.00");
@jakarta.annotation.Nullable String Detail = "example Detail";
@jakarta.annotation.Nullable String Instance = "example Instance";


ProblemDetails problemDetailsInstance = new ProblemDetails()
    .Type(Type)
    .Title(Title)
    .Status(Status)
    .Detail(Detail)
    .Instance(Instance);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
