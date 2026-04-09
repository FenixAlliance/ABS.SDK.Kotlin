
# AssetDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **businessName** | **kotlin.String** |  |  [optional] |
| **businessProfileRecordId** | **kotlin.String** |  |  [optional] |
| **name** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **assetClass** | [**inline**](#AssetClass) |  |  [optional] |
| **assetOwner** | [**inline**](#AssetOwner) |  |  [optional] |
| **isExistingAsset** | **kotlin.Boolean** |  |  [optional] |
| **calculateDepreciation** | **kotlin.Boolean** |  |  [optional] |
| **allowMonthlyDepreciation** | **kotlin.Boolean** |  |  [optional] |
| **openingDepreciation** | **kotlin.Double** |  |  [optional] |
| **purchaseDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **purchasePrice** | **kotlin.Double** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **currencyCode** | **kotlin.String** |  |  [optional] |
| **itemId** | **kotlin.String** |  |  [optional] |
| **itemName** | **kotlin.String** |  |  [optional] |
| **assetCategoryId** | **kotlin.String** |  |  [optional] |
| **assetCategoryName** | **kotlin.String** |  |  [optional] |
| **purchaseInvoiceId** | **kotlin.String** |  |  [optional] |
| **purchaseInvoiceNumber** | **kotlin.String** |  |  [optional] |
| **assetLocationId** | **kotlin.String** |  |  [optional] |
| **assetLocationName** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **contactName** | **kotlin.String** |  |  [optional] |
| **organizationDepartmentId** | **kotlin.String** |  |  [optional] |
| **organizationDepartmentName** | **kotlin.String** |  |  [optional] |
| **purchaseReceiptId** | **kotlin.String** |  |  [optional] |


<a id="AssetClass"></a>
## Enum: assetClass
| Name | Value |
| ---- | ----- |
| assetClass | Fixed, Stock |


<a id="AssetOwner"></a>
## Enum: assetOwner
| Name | Value |
| ---- | ----- |
| assetOwner | Business, Organization, Contact, Supplier |



