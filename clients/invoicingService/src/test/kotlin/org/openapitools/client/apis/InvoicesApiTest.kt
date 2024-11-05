/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.InvoicesApi
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.ExtendedInvoiceDtoListEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.InvoiceAdjustmentCreateDto
import org.openapitools.client.models.InvoiceAdjustmentDtoEnvelope
import org.openapitools.client.models.InvoiceAdjustmentDtoListEnvelope
import org.openapitools.client.models.InvoiceAdjustmentUpdateDto
import org.openapitools.client.models.InvoiceCreateDto
import org.openapitools.client.models.InvoiceDtoEnvelope
import org.openapitools.client.models.InvoiceDtoListEnvelope
import org.openapitools.client.models.InvoiceLineAppliedTaxCreateDto
import org.openapitools.client.models.InvoiceLineAppliedTaxDtoListEnvelope
import org.openapitools.client.models.InvoiceLineAppliedTaxUpdateDto
import org.openapitools.client.models.InvoiceLineCreateDto
import org.openapitools.client.models.InvoiceLineDtoEnvelope
import org.openapitools.client.models.InvoiceLineDtoListEnvelope
import org.openapitools.client.models.InvoiceLineUpdateDto
import org.openapitools.client.models.InvoiceReferenceCreateDto
import org.openapitools.client.models.InvoiceReferenceDtoEnvelope
import org.openapitools.client.models.InvoiceReferenceDtoListEnvelope
import org.openapitools.client.models.InvoiceReferenceUpdateDto
import org.openapitools.client.models.InvoiceUpdateDto
import org.openapitools.client.models.MoneyEnvelope

class InvoicesApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of InvoicesApi
        //val apiInstance = InvoicesApi()

        // to test apiV2InvoicingServiceInvoicesCountGet
        should("test apiV2InvoicingServiceInvoicesCountGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesCountGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesCountGet(tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesDiscountsAggregatePost
        should("test apiV2InvoicingServiceInvoicesDiscountsAggregatePost") {
            // uncomment below to test apiV2InvoicingServiceInvoicesDiscountsAggregatePost
            //val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
            //val currencyId : kotlin.String = currencyId_example // kotlin.String | 
            //val result : MoneyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesDiscountsAggregatePost(javaUtilUUID, currencyId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesExtendedCountGet
        should("test apiV2InvoicingServiceInvoicesExtendedCountGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesExtendedCountGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesExtendedCountGet(tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesExtendedGet
        should("test apiV2InvoicingServiceInvoicesExtendedGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesExtendedGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : ExtendedInvoiceDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesExtendedGet(tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesGet
        should("test apiV2InvoicingServiceInvoicesGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesGet(tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost
        should("test apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost") {
            // uncomment below to test apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost
            //val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
            //val currencyId : kotlin.String = currencyId_example // kotlin.String | 
            //val result : MoneyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost(javaUtilUUID, currencyId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet(invoiceId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceAdjustmentDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet(invoiceId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete
        should("test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceAdjustmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete(invoiceId, invoiceAdjustmentId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceAdjustmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceAdjustmentDtoEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet(invoiceId, invoiceAdjustmentId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut
        should("test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceAdjustmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceAdjustmentUpdateDto : InvoiceAdjustmentUpdateDto =  // InvoiceAdjustmentUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut(invoiceId, invoiceAdjustmentId, tenantId, invoiceAdjustmentUpdateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost
        should("test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceAdjustmentCreateDto : InvoiceAdjustmentCreateDto =  // InvoiceAdjustmentCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost(invoiceId, tenantId, invoiceAdjustmentCreateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut
        should("test apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut(invoiceId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdDelete
        should("test apiV2InvoicingServiceInvoicesInvoiceIdDelete") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdDelete
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdDelete(invoiceId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceDtoEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet(invoiceId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet(invoiceId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceLineDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesGet(invoiceId, tenantId, itemId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut(invoiceId, invoiceLineId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete(invoiceId, invoiceLineId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceLineDtoEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet(invoiceId, invoiceLineId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineUpdateDto : InvoiceLineUpdateDto =  // InvoiceLineUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut(invoiceId, invoiceLineId, tenantId, invoiceLineUpdateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet(invoiceId, invoiceLineId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceLineAppliedTaxDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet(invoiceId, invoiceLineId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineTaxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete(invoiceId, invoiceLineId, invoiceLineTaxId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineTaxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineAppliedTaxUpdateDto : InvoiceLineAppliedTaxUpdateDto =  // InvoiceLineAppliedTaxUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut(invoiceId, invoiceLineId, invoiceLineTaxId, tenantId, invoiceLineAppliedTaxUpdateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineAppliedTaxCreateDto : InvoiceLineAppliedTaxCreateDto =  // InvoiceLineAppliedTaxCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost(invoiceId, invoiceLineId, tenantId, invoiceLineAppliedTaxCreateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdLinesPost
        should("test apiV2InvoicingServiceInvoicesInvoiceIdLinesPost") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdLinesPost
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceLineCreateDto : InvoiceLineCreateDto =  // InvoiceLineCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesPost(invoiceId, tenantId, invoiceLineCreateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet(invoiceId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet(invoiceId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdPut
        should("test apiV2InvoicingServiceInvoicesInvoiceIdPut") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdPut
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceUpdateDto : InvoiceUpdateDto =  // InvoiceUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdPut(invoiceId, tenantId, invoiceUpdateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet(invoiceId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceReferenceDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet(invoiceId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete
        should("test apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceReferenceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete(invoiceId, invoiceReferenceId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet
        should("test apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceReferenceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceReferenceDtoEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet(invoiceId, invoiceReferenceId, tenantId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut
        should("test apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceReferenceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceReferenceUpdateDto : InvoiceReferenceUpdateDto =  // InvoiceReferenceUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut(invoiceId, invoiceReferenceId, tenantId, invoiceReferenceUpdateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost
        should("test apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost") {
            // uncomment below to test apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceReferenceCreateDto : InvoiceReferenceCreateDto =  // InvoiceReferenceCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost(invoiceId, tenantId, invoiceReferenceCreateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesPost
        should("test apiV2InvoicingServiceInvoicesPost") {
            // uncomment below to test apiV2InvoicingServiceInvoicesPost
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val invoiceCreateDto : InvoiceCreateDto =  // InvoiceCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesPost(tenantId, invoiceCreateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesTaxBasesAggregatePost
        should("test apiV2InvoicingServiceInvoicesTaxBasesAggregatePost") {
            // uncomment below to test apiV2InvoicingServiceInvoicesTaxBasesAggregatePost
            //val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
            //val currencyId : kotlin.String = currencyId_example // kotlin.String | 
            //val result : MoneyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesTaxBasesAggregatePost(javaUtilUUID, currencyId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesTaxesAggregatePost
        should("test apiV2InvoicingServiceInvoicesTaxesAggregatePost") {
            // uncomment below to test apiV2InvoicingServiceInvoicesTaxesAggregatePost
            //val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
            //val currencyId : kotlin.String = currencyId_example // kotlin.String | 
            //val result : MoneyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesTaxesAggregatePost(javaUtilUUID, currencyId)
            //result shouldBe ("TODO")
        }

        // to test apiV2InvoicingServiceInvoicesTotalsAggregatePost
        should("test apiV2InvoicingServiceInvoicesTotalsAggregatePost") {
            // uncomment below to test apiV2InvoicingServiceInvoicesTotalsAggregatePost
            //val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
            //val currencyId : kotlin.String = currencyId_example // kotlin.String | 
            //val result : MoneyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesTotalsAggregatePost(javaUtilUUID, currencyId)
            //result shouldBe ("TODO")
        }

        // to test getInvoiceAsync
        should("test getInvoiceAsync") {
            // uncomment below to test getInvoiceAsync
            //val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : InvoiceDtoEnvelope = apiInstance.getInvoiceAsync(invoiceId, tenantId)
            //result shouldBe ("TODO")
        }

    }
}