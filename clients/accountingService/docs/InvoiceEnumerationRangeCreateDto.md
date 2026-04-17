
# InvoiceEnumerationRangeCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **validFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **validTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **prefix** | **kotlin.String** |  |  [optional] |
| **suffix** | **kotlin.String** |  |  [optional] |
| **identifier** | **kotlin.String** |  |  [optional] |
| **qualifiedName** | **kotlin.String** |  |  [optional] |
| **currentNumeration** | **kotlin.Long** |  |  [optional] |
| **numerationFrom** | **kotlin.Long** |  |  [optional] |
| **numerationTo** | **kotlin.Long** |  |  [optional] |
| **fiscalAuthorityId** | **kotlin.String** |  |  [optional] |
| **documentType** | [**inline**](#DocumentType) |  |  [optional] |


<a id="DocumentType"></a>
## Enum: documentType
| Name | Value |
| ---- | ----- |
| documentType | Standard, DebitNote, CreditNote |



