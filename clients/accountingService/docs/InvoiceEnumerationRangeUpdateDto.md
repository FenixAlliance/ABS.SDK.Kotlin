
# InvoiceEnumerationRangeUpdateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **prefix** | **kotlin.String** |  |  [optional] |
| **suffix** | **kotlin.String** |  |  [optional] |
| **identifier** | **kotlin.String** |  |  [optional] |
| **qualifiedName** | **kotlin.String** |  |  [optional] |
| **currentNumeration** | **kotlin.Long** |  |  [optional] |
| **numerationFrom** | **kotlin.Long** |  |  [optional] |
| **numerationTo** | **kotlin.Long** |  |  [optional] |
| **validFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **validTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **fiscalAuthorityId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **documentType** | [**inline**](#DocumentType) |  |  [optional] |


<a id="DocumentType"></a>
## Enum: documentType
| Name | Value |
| ---- | ----- |
| documentType | Standard, DebitNote, CreditNote |



