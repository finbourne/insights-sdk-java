# com.finbourne.insights.model.AuditData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** |  | [default to String]
**category** | **String** |  | [default to String]
**userId** | **String** |  | [optional] [default to String]
**message** | **String** |  | [optional] [default to String]
**resource** | [**Resource**](Resource.md) |  | [optional] [default to Resource]
**detailsType** | **String** |  | [optional] [default to String]
**details** | **Object** |  | [optional] [default to Object]

```java
import com.finbourne.insights.model.AuditData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Action = "example Action";
String Category = "example Category";
@jakarta.annotation.Nullable String UserId = "example UserId";
@jakarta.annotation.Nullable String Message = "example Message";
Resource Resource = new Resource();
@jakarta.annotation.Nullable String DetailsType = "example DetailsType";
@jakarta.annotation.Nullable Object 

AuditData auditDataInstance = new AuditData()
    .Action(Action)
    .Category(Category)
    .UserId(UserId)
    .Message(Message)
    .Resource(Resource)
    .DetailsType(DetailsType)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
