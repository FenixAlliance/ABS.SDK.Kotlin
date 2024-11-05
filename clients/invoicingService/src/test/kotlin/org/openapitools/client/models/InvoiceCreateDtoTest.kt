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

package org.openapitools.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.InvoiceCreateDto
import org.openapitools.client.models.InvoiceAdjustmentDto
import org.openapitools.client.models.InvoiceItemRecordDto
import org.openapitools.client.models.InvoiceReferenceDto

class InvoiceCreateDtoTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of InvoiceCreateDto
        //val modelInstance = InvoiceCreateDto()

        // to test the property `id`
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `timestamp`
        should("test timestamp") {
            // uncomment below to test the property
            //modelInstance.timestamp shouldBe ("TODO")
        }

        // to test the property `closed`
        should("test closed") {
            // uncomment below to test the property
            //modelInstance.closed shouldBe ("TODO")
        }

        // to test the property `title`
        should("test title") {
            // uncomment below to test the property
            //modelInstance.title shouldBe ("TODO")
        }

        // to test the property `userId`
        should("test userId") {
            // uncomment below to test the property
            //modelInstance.userId shouldBe ("TODO")
        }

        // to test the property `tenantId`
        should("test tenantId") {
            // uncomment below to test the property
            //modelInstance.tenantId shouldBe ("TODO")
        }

        // to test the property `priceListId`
        should("test priceListId") {
            // uncomment below to test the property
            //modelInstance.priceListId shouldBe ("TODO")
        }

        // to test the property `description`
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `enrollmentId`
        should("test enrollmentId") {
            // uncomment below to test the property
            //modelInstance.enrollmentId shouldBe ("TODO")
        }

        // to test the property `individualId`
        should("test individualId") {
            // uncomment below to test the property
            //modelInstance.individualId shouldBe ("TODO")
        }

        // to test the property `paymentTermId`
        should("test paymentTermId") {
            // uncomment below to test the property
            //modelInstance.paymentTermId shouldBe ("TODO")
        }

        // to test the property `organizationId`
        should("test organizationId") {
            // uncomment below to test the property
            //modelInstance.organizationId shouldBe ("TODO")
        }

        // to test the property `currencyId`
        should("test currencyId") {
            // uncomment below to test the property
            //modelInstance.currencyId shouldBe ("TODO")
        }

        // to test the property `forexRate`
        should("test forexRate") {
            // uncomment below to test the property
            //modelInstance.forexRate shouldBe ("TODO")
        }

        // to test the property `firstName`
        should("test firstName") {
            // uncomment below to test the property
            //modelInstance.firstName shouldBe ("TODO")
        }

        // to test the property `lastName`
        should("test lastName") {
            // uncomment below to test the property
            //modelInstance.lastName shouldBe ("TODO")
        }

        // to test the property `companyName`
        should("test companyName") {
            // uncomment below to test the property
            //modelInstance.companyName shouldBe ("TODO")
        }

        // to test the property `billingEmail`
        should("test billingEmail") {
            // uncomment below to test the property
            //modelInstance.billingEmail shouldBe ("TODO")
        }

        // to test the property `addressLine1`
        should("test addressLine1") {
            // uncomment below to test the property
            //modelInstance.addressLine1 shouldBe ("TODO")
        }

        // to test the property `addressLine2`
        should("test addressLine2") {
            // uncomment below to test the property
            //modelInstance.addressLine2 shouldBe ("TODO")
        }

        // to test the property `postalCode`
        should("test postalCode") {
            // uncomment below to test the property
            //modelInstance.postalCode shouldBe ("TODO")
        }

        // to test the property `countryId`
        should("test countryId") {
            // uncomment below to test the property
            //modelInstance.countryId shouldBe ("TODO")
        }

        // to test the property `stateId`
        should("test stateId") {
            // uncomment below to test the property
            //modelInstance.stateId shouldBe ("TODO")
        }

        // to test the property `cityId`
        should("test cityId") {
            // uncomment below to test the property
            //modelInstance.cityId shouldBe ("TODO")
        }

        // to test the property `paid`
        should("test paid") {
            // uncomment below to test the property
            //modelInstance.paid shouldBe ("TODO")
        }

        // to test the property `number`
        should("test number") {
            // uncomment below to test the property
            //modelInstance.number shouldBe ("TODO")
        }

        // to test the property `notes`
        should("test notes") {
            // uncomment below to test the property
            //modelInstance.notes shouldBe ("TODO")
        }

        // to test the property `customerNotes`
        should("test customerNotes") {
            // uncomment below to test the property
            //modelInstance.customerNotes shouldBe ("TODO")
        }

        // to test the property `orderId`
        should("test orderId") {
            // uncomment below to test the property
            //modelInstance.orderId shouldBe ("TODO")
        }

        // to test the property `enumeration`
        should("test enumeration") {
            // uncomment below to test the property
            //modelInstance.enumeration shouldBe ("TODO")
        }

        // to test the property `paymentModeId`
        should("test paymentModeId") {
            // uncomment below to test the property
            //modelInstance.paymentModeId shouldBe ("TODO")
        }

        // to test the property `receiverTenantId`
        should("test receiverTenantId") {
            // uncomment below to test the property
            //modelInstance.receiverTenantId shouldBe ("TODO")
        }

        // to test the property `enumerationRangeId`
        should("test enumerationRangeId") {
            // uncomment below to test the property
            //modelInstance.enumerationRangeId shouldBe ("TODO")
        }

        // to test the property `emisorBillingProfileId`
        should("test emisorBillingProfileId") {
            // uncomment below to test the property
            //modelInstance.emisorBillingProfileId shouldBe ("TODO")
        }

        // to test the property `receiverBillingProfileId`
        should("test receiverBillingProfileId") {
            // uncomment below to test the property
            //modelInstance.receiverBillingProfileId shouldBe ("TODO")
        }

        // to test the property `emisorWalletAccountId`
        should("test emisorWalletAccountId") {
            // uncomment below to test the property
            //modelInstance.emisorWalletAccountId shouldBe ("TODO")
        }

        // to test the property `receiverWalletAccountId`
        should("test receiverWalletAccountId") {
            // uncomment below to test the property
            //modelInstance.receiverWalletAccountId shouldBe ("TODO")
        }

        // to test the property `paymentDue`
        should("test paymentDue") {
            // uncomment below to test the property
            //modelInstance.paymentDue shouldBe ("TODO")
        }

        // to test the property `invoiceType`
        should("test invoiceType") {
            // uncomment below to test the property
            //modelInstance.invoiceType shouldBe ("TODO")
        }

        // to test the property `documentType`
        should("test documentType") {
            // uncomment below to test the property
            //modelInstance.documentType shouldBe ("TODO")
        }

        // to test the property `invoiceStatus`
        should("test invoiceStatus") {
            // uncomment below to test the property
            //modelInstance.invoiceStatus shouldBe ("TODO")
        }

        // to test the property `validFrom`
        should("test validFrom") {
            // uncomment below to test the property
            //modelInstance.validFrom shouldBe ("TODO")
        }

        // to test the property `validTo`
        should("test validTo") {
            // uncomment below to test the property
            //modelInstance.validTo shouldBe ("TODO")
        }

        // to test the property `invoiceReferences`
        should("test invoiceReferences") {
            // uncomment below to test the property
            //modelInstance.invoiceReferences shouldBe ("TODO")
        }

        // to test the property `invoiceItemRecords`
        should("test invoiceItemRecords") {
            // uncomment below to test the property
            //modelInstance.invoiceItemRecords shouldBe ("TODO")
        }

        // to test the property `invoiceAdjustments`
        should("test invoiceAdjustments") {
            // uncomment below to test the property
            //modelInstance.invoiceAdjustments shouldBe ("TODO")
        }

    }
}
