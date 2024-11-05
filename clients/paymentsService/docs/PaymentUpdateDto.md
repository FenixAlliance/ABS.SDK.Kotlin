
# PaymentUpdateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **invoiceId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **emisorWalletId** | **kotlin.String** |  |  [optional] |
| **receiverWalletId** | **kotlin.String** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **totalCost** | **kotlin.Double** |  |  [optional] |
| **totalTaxes** | **kotlin.Double** |  |  [optional] |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **&#x60;data&#x60;** | **kotlin.String** |  |  [optional] |
| **dataLabel** | **kotlin.String** |  |  [optional] |
| **data1** | **kotlin.String** |  |  [optional] |
| **data1Label** | **kotlin.String** |  |  [optional] |
| **response** | **kotlin.String** |  |  [optional] |
| **authorization** | **kotlin.String** |  |  [optional] |
| **referenceCode** | **kotlin.String** |  |  [optional] |
| **correlationCode** | **kotlin.String** |  |  [optional] |
| **lastUpdated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **onBehalfOf** | [**inline**](#OnBehalfOf) |  |  [optional] |
| **paymentType** | [**inline**](#PaymentType) |  |  [optional] |
| **paymentStatus** | [**inline**](#PaymentStatus) |  |  [optional] |
| **baseCost** | **kotlin.Double** |  |  [optional] |
| **signature** | **kotlin.String** |  |  [optional] |
| **signatureMismatch** | **kotlin.Boolean** |  |  [optional] |
| **isExternal** | **kotlin.Boolean** |  |  [optional] |
| **markedForRevision** | **kotlin.Boolean** |  |  [optional] |
| **forexRatesSnapshot** | **kotlin.String** |  |  [optional] |
| **officialId** | **kotlin.String** |  |  [optional] |
| **officialIdExpeditionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **fiscalIdentificationTypeId** | **kotlin.String** |  |  [optional] |
| **billingAddress** | **kotlin.String** |  |  [optional] |
| **phone** | **kotlin.String** |  |  [optional] |
| **cellphone** | **kotlin.String** |  |  [optional] |
| **department** | **kotlin.String** |  |  [optional] |
| **city** | **kotlin.String** |  |  [optional] |
| **countryId** | **kotlin.String** |  |  [optional] |
| **locationId** | **kotlin.String** |  |  [optional] |
| **entitlementId** | **kotlin.String** |  |  [optional] |
| **antiFraudScore** | **kotlin.Double** |  |  [optional] |
| **callRecordURL** | **kotlin.String** |  |  [optional] |
| **called** | **kotlin.Boolean** |  |  [optional] |
| **verified** | **kotlin.Boolean** |  |  [optional] |
| **payerPictureTimestamp** | **kotlin.String** |  |  [optional] |
| **payerPicture** | **kotlin.String** |  |  [optional] |
| **identificationPictureTimestamp** | **kotlin.String** |  |  [optional] |
| **identificationPicture** | **kotlin.String** |  |  [optional] |
| **identificationBackPicture** | **kotlin.String** |  |  [optional] |
| **identificationBackPictureTimestamp** | **kotlin.String** |  |  [optional] |
| **ipLookupId** | **kotlin.String** |  |  [optional] |
| **orderId** | **kotlin.String** |  |  [optional] |
| **accountingEntryId** | **kotlin.String** |  |  [optional] |
| **paymentGatewayId** | **kotlin.String** |  |  [optional] |
| **bankAccountId** | **kotlin.String** |  |  [optional] |
| **enrolmentId** | **kotlin.String** |  |  [optional] |
| **bankId** | **kotlin.String** |  |  [optional] |
| **paymentTokenId** | **kotlin.String** |  |  [optional] |
| **emisorWalletAccountId** | **kotlin.String** |  |  [optional] |
| **receiverWalletAccountId** | **kotlin.String** |  |  [optional] |


<a id="OnBehalfOf"></a>
## Enum: onBehalfOf
| Name | Value |
| ---- | ----- |
| onBehalfOf | 0, 1, 2, 3 |


<a id="PaymentType"></a>
## Enum: paymentType
| Name | Value |
| ---- | ----- |
| paymentType | 0, 1, 2 |


<a id="PaymentStatus"></a>
## Enum: paymentStatus
| Name | Value |
| ---- | ----- |
| paymentStatus | 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 |



