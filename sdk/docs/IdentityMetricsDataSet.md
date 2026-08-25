# com.finbourne.insights.model.IdentityMetricsDataSet
Identity population and activity counts for the domain, pivoted from the latest tranche the identity metrics provider collected.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this data set. Always &#x60;IdentityMetrics&#x60;, matching the corresponding Finbourne.Insights.WebApi.Dtos.Metrics.MetricDataSet value and Finbourne.Insights.WebApi.Dtos.Metrics.MetricsResponse property. | [default to String]
**collectedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the tranche these values were collected in, in UTC, or null if no tranche was returned. | [optional] [default to OffsetDateTime]
**personalUsers** | **Long** | The number of personal (human) users in the domain, or null if not reported. | [optional] [default to Long]
**serviceUsers** | **Long** | The number of service users in the domain, or null if not reported. | [optional] [default to Long]
**neverLoggedIn** | **Long** | The number of users that have never logged in, or null if not reported. | [optional] [default to Long]
**ignored** | **Long** | The number of users excluded from the other counts, or null if not reported. | [optional] [default to Long]
**accountLocked** | **Long** | The number of users whose account is locked, or null if not reported. | [optional] [default to Long]
**suspendedPwReset** | **Long** | The number of users suspended pending a password reset, or null if not reported. | [optional] [default to Long]
**createdLast24Hours** | **Long** | The number of users created in the last 24 hours, or null if not reported. | [optional] [default to Long]
**createdLast7Days** | **Long** | The number of users created in the last 7 days, or null if not reported. | [optional] [default to Long]
**createdLast30Days** | **Long** | The number of users created in the last 30 days, or null if not reported. | [optional] [default to Long]
**activeLast24Hours** | **Long** | The number of users active in the last 24 hours, or null if not reported. | [optional] [default to Long]
**activeLast7Days** | **Long** | The number of users active in the last 7 days, or null if not reported. | [optional] [default to Long]
**activeLast30Days** | **Long** | The number of users active in the last 30 days, or null if not reported. | [optional] [default to Long]

```java
import com.finbourne.insights.model.IdentityMetricsDataSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable OffsetDateTime CollectedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable Long PersonalUsers = new Long("100.00");
@jakarta.annotation.Nullable Long ServiceUsers = new Long("100.00");
@jakarta.annotation.Nullable Long NeverLoggedIn = new Long("100.00");
@jakarta.annotation.Nullable Long Ignored = new Long("100.00");
@jakarta.annotation.Nullable Long AccountLocked = new Long("100.00");
@jakarta.annotation.Nullable Long SuspendedPwReset = new Long("100.00");
@jakarta.annotation.Nullable Long CreatedLast24Hours = new Long("100.00");
@jakarta.annotation.Nullable Long CreatedLast7Days = new Long("100.00");
@jakarta.annotation.Nullable Long CreatedLast30Days = new Long("100.00");
@jakarta.annotation.Nullable Long ActiveLast24Hours = new Long("100.00");
@jakarta.annotation.Nullable Long ActiveLast7Days = new Long("100.00");
@jakarta.annotation.Nullable Long ActiveLast30Days = new Long("100.00");


IdentityMetricsDataSet identityMetricsDataSetInstance = new IdentityMetricsDataSet()
    .Name(Name)
    .CollectedAt(CollectedAt)
    .PersonalUsers(PersonalUsers)
    .ServiceUsers(ServiceUsers)
    .NeverLoggedIn(NeverLoggedIn)
    .Ignored(Ignored)
    .AccountLocked(AccountLocked)
    .SuspendedPwReset(SuspendedPwReset)
    .CreatedLast24Hours(CreatedLast24Hours)
    .CreatedLast7Days(CreatedLast7Days)
    .CreatedLast30Days(CreatedLast30Days)
    .ActiveLast24Hours(ActiveLast24Hours)
    .ActiveLast7Days(ActiveLast7Days)
    .ActiveLast30Days(ActiveLast30Days);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
