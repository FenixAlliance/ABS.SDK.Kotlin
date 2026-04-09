
# AssetUpdateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **assetType** | [**inline**](#AssetType) |  |  [optional] |
| **assetOwner** | [**inline**](#AssetOwner) |  |  [optional] |
| **calculateDepreciation** | **kotlin.Boolean** |  |  [optional] |
| **allowMonthlyDepreciation** | **kotlin.Boolean** |  |  [optional] |
| **openingDepreciation** | **kotlin.Double** |  |  [optional] |
| **purchaseDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **purchasePrice** | **kotlin.Double** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **currencyCode** | **kotlin.String** |  |  [optional] |
| **itemId** | **kotlin.String** |  |  [optional] |
| **assetCategoryId** | **kotlin.String** |  |  [optional] |
| **purchaseInvoiceId** | **kotlin.String** |  |  [optional] |
| **purchaseReceiptId** | **kotlin.String** |  |  [optional] |
| **assetLocationId** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **organizationDepartmentId** | **kotlin.String** |  |  [optional] |


<a id="AssetType"></a>
## Enum: assetType
| Name | Value |
| ---- | ----- |
| assetType | Fixed, Stock |


<a id="AssetOwner"></a>
## Enum: assetOwner
| Name | Value |
| ---- | ----- |
| assetOwner | Business, Organization, Contact, Supplier |



