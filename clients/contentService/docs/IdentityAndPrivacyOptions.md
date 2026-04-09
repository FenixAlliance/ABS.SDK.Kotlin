
# IdentityAndPrivacyOptions

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **allowGuestOrders** | **kotlin.Boolean** |  |  [optional] |
| **allowGuestCartRecognition** | **kotlin.Boolean** |  |  [optional] |
| **allowRemoveDownloadAccessOnRequest** | **kotlin.Boolean** |  |  [optional] |
| **allowRemovePersonalDataFromOrdersOnRequest** | **kotlin.Boolean** |  |  [optional] |
| **allowRemovePersonalDataFromSubscriptionsOnRequest** | **kotlin.Boolean** |  |  [optional] |
| **storeCheckoutPrivacyPolicyNotice** | **kotlin.String** |  |  [optional] |
| **storeRegistrationPrivacyPolicyNotice** | **kotlin.String** |  |  [optional] |
| **defaultCustomerLocation** | [**inline**](#DefaultCustomerLocation) |  |  [optional] |
| **inactiveCartsRetentionPolicy** | [**StoreDataRetentionPolicy**](StoreDataRetentionPolicy.md) |  |  [optional] |
| **pendingOrdersRetentionPolicy** | [**StoreDataRetentionPolicy**](StoreDataRetentionPolicy.md) |  |  [optional] |
| **failedOrdersRetentionPolicy** | [**StoreDataRetentionPolicy**](StoreDataRetentionPolicy.md) |  |  [optional] |
| **cancelledOrdersRetentionPolicy** | [**StoreDataRetentionPolicy**](StoreDataRetentionPolicy.md) |  |  [optional] |
| **completedOrdersRetentionPolicy** | [**StoreDataRetentionPolicy**](StoreDataRetentionPolicy.md) |  |  [optional] |


<a id="DefaultCustomerLocation"></a>
## Enum: defaultCustomerLocation
| Name | Value |
| ---- | ----- |
| defaultCustomerLocation | None, Geolocate, StoreAddressBased, GeolocateWithCaching |



