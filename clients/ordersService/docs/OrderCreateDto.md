
# OrderCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] [readonly] |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **priceListId** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **individualId** | **kotlin.String** |  |  [optional] |
| **paymentTermId** | **kotlin.String** |  |  [optional] |
| **organizationId** | **kotlin.String** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **firstName** | **kotlin.String** |  |  [optional] |
| **lastName** | **kotlin.String** |  |  [optional] |
| **companyName** | **kotlin.String** |  |  [optional] |
| **billingEmail** | **kotlin.String** |  |  [optional] |
| **addressLine1** | **kotlin.String** |  |  [optional] |
| **addressLine2** | **kotlin.String** |  |  [optional] |
| **postalCode** | **kotlin.String** |  |  [optional] |
| **countryId** | **kotlin.String** |  |  [optional] |
| **stateId** | **kotlin.String** |  |  [optional] |
| **cityId** | **kotlin.String** |  |  [optional] |
| **cartId** | **kotlin.String** |  |  [optional] |
| **quoteId** | **kotlin.String** |  |  [optional] |
| **walletId** | **kotlin.String** |  |  [optional] |
| **parentOrderId** | **kotlin.String** |  |  [optional] |
| **shippingMethodId** | **kotlin.String** |  |  [optional] |
| **billingLocationId** | **kotlin.String** |  |  [optional] |
| **customerNotes** | **kotlin.String** |  |  [optional] |
| **orderStatus** | [**inline**](#OrderStatus) |  |  [optional] |
| **quoteStatus** | [**inline**](#QuoteStatus) |  |  [optional] |
| **freightTerms** | [**inline**](#FreightTerms) |  |  [optional] |
| **receiverTenantId** | **kotlin.String** |  |  [optional] |
| **shippingLocationId** | **kotlin.String** |  |  [optional] |
| **qualifiedIdentifier** | **kotlin.String** |  |  [optional] |
| **totalTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalAmountInUsd** | **kotlin.Double** |  |  [optional] |
| **effectiveTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **effectiveFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |


<a id="OrderStatus"></a>
## Enum: orderStatus
| Name | Value |
| ---- | ----- |
| orderStatus | 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 |


<a id="QuoteStatus"></a>
## Enum: quoteStatus
| Name | Value |
| ---- | ----- |
| quoteStatus | 0, 1, 2, 3, 4 |


<a id="FreightTerms"></a>
## Enum: freightTerms
| Name | Value |
| ---- | ----- |
| freightTerms | 0, 1 |



