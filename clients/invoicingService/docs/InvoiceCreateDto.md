
# InvoiceCreateDto

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
| **paid** | **kotlin.Boolean** |  |  [optional] |
| **number** | **kotlin.Int** |  |  [optional] |
| **notes** | **kotlin.String** |  |  [optional] |
| **customerNotes** | **kotlin.String** |  |  [optional] |
| **orderId** | **kotlin.String** |  |  [optional] |
| **enumeration** | **kotlin.String** |  |  [optional] |
| **paymentModeId** | **kotlin.String** |  |  [optional] |
| **receiverTenantId** | **kotlin.String** |  |  [optional] |
| **enumerationRangeId** | **kotlin.String** |  |  [optional] |
| **emisorBillingProfileId** | **kotlin.String** |  |  [optional] |
| **receiverBillingProfileId** | **kotlin.String** |  |  [optional] |
| **emisorWalletAccountId** | **kotlin.String** |  |  [optional] |
| **receiverWalletAccountId** | **kotlin.String** |  |  [optional] |
| **paymentDue** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **invoiceType** | [**inline**](#InvoiceType) |  |  [optional] |
| **documentType** | [**inline**](#DocumentType) |  |  [optional] |
| **invoiceStatus** | [**inline**](#InvoiceStatus) |  |  [optional] |
| **validFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **validTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **invoiceReferences** | [**kotlin.collections.List&lt;InvoiceReferenceDto&gt;**](InvoiceReferenceDto.md) |  |  [optional] |
| **invoiceItemRecords** | [**kotlin.collections.List&lt;InvoiceItemRecordDto&gt;**](InvoiceItemRecordDto.md) |  |  [optional] |
| **invoiceAdjustments** | [**kotlin.collections.List&lt;InvoiceAdjustmentDto&gt;**](InvoiceAdjustmentDto.md) |  |  [optional] |


<a id="InvoiceType"></a>
## Enum: invoiceType
| Name | Value |
| ---- | ----- |
| invoiceType | 0, 1 |


<a id="DocumentType"></a>
## Enum: documentType
| Name | Value |
| ---- | ----- |
| documentType | 0, 1, 2 |


<a id="InvoiceStatus"></a>
## Enum: invoiceStatus
| Name | Value |
| ---- | ----- |
| invoiceStatus | 0, 1, 2, 3, 4 |


