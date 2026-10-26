# com.finbourne.insights.model.AvailableValue
A value known to be valid for a queryable log field, which a UI can offer when filtering on that field.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The value. | [default to String]
**context** | **String** | Optional context qualifying the value. For the Operation field this is the comma-separated names of the applications that publish the operation. | [optional] [default to String]

```java
import com.finbourne.insights.model.AvailableValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Value = "example Value";
@jakarta.annotation.Nullable String Context = "example Context";


AvailableValue availableValueInstance = new AvailableValue()
    .Value(Value)
    .Context(Context);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
