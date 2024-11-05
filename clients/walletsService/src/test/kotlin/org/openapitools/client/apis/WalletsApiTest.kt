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

import org.openapitools.client.apis.WalletsApi
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.ExtendedOrderDtoListEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.InvoiceDtoListEnvelope
import org.openapitools.client.models.LocationCreateDto
import org.openapitools.client.models.LocationDtoEnvelope
import org.openapitools.client.models.LocationDtoListEnvelope
import org.openapitools.client.models.LocationUpdateDto
import org.openapitools.client.models.OrderDtoListEnvelope
import org.openapitools.client.models.PaymentDtoListEnvelope
import org.openapitools.client.models.WalletDtoEnvelope

class WalletsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WalletsApi
        //val apiInstance = WalletsApi()

        // to test createWalletLocationAsync
        should("test createWalletLocationAsync") {
            // uncomment below to test createWalletLocationAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val locationCreateDto : LocationCreateDto =  // LocationCreateDto | 
            //val result : EmptyEnvelope = apiInstance.createWalletLocationAsync(walletId, apiVersion, xApiVersion, locationCreateDto)
            //result shouldBe ("TODO")
        }

        // to test deleteWalletLocationAsync
        should("test deleteWalletLocationAsync") {
            // uncomment below to test deleteWalletLocationAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.deleteWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getIncomingPaymentsAsync
        should("test getIncomingPaymentsAsync") {
            // uncomment below to test getIncomingPaymentsAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : PaymentDtoListEnvelope = apiInstance.getIncomingPaymentsAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getIncomingPaymentsCountAsync
        should("test getIncomingPaymentsCountAsync") {
            // uncomment below to test getIncomingPaymentsCountAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.getIncomingPaymentsCountAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getIncomingWalletInvoicesAsync
        should("test getIncomingWalletInvoicesAsync") {
            // uncomment below to test getIncomingWalletInvoicesAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : InvoiceDtoListEnvelope = apiInstance.getIncomingWalletInvoicesAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getIncomingWalletInvoicesCountAsync
        should("test getIncomingWalletInvoicesCountAsync") {
            // uncomment below to test getIncomingWalletInvoicesCountAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.getIncomingWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getOutgoingPaymentsAsync
        should("test getOutgoingPaymentsAsync") {
            // uncomment below to test getOutgoingPaymentsAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : PaymentDtoListEnvelope = apiInstance.getOutgoingPaymentsAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getOutgoingPaymentsCountAsync
        should("test getOutgoingPaymentsCountAsync") {
            // uncomment below to test getOutgoingPaymentsCountAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.getOutgoingPaymentsCountAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getOutgoingWalletInvoicesAsync
        should("test getOutgoingWalletInvoicesAsync") {
            // uncomment below to test getOutgoingWalletInvoicesAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : InvoiceDtoListEnvelope = apiInstance.getOutgoingWalletInvoicesAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getOutgoingWalletInvoicesCountAsync
        should("test getOutgoingWalletInvoicesCountAsync") {
            // uncomment below to test getOutgoingWalletInvoicesCountAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.getOutgoingWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletDetailsAsync
        should("test getWalletDetailsAsync") {
            // uncomment below to test getWalletDetailsAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : WalletDtoEnvelope = apiInstance.getWalletDetailsAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletExtendedOrdersAsync
        should("test getWalletExtendedOrdersAsync") {
            // uncomment below to test getWalletExtendedOrdersAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : ExtendedOrderDtoListEnvelope = apiInstance.getWalletExtendedOrdersAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletInvoicesAsync
        should("test getWalletInvoicesAsync") {
            // uncomment below to test getWalletInvoicesAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : InvoiceDtoListEnvelope = apiInstance.getWalletInvoicesAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletInvoicesCountAsync
        should("test getWalletInvoicesCountAsync") {
            // uncomment below to test getWalletInvoicesCountAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.getWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletLocationAsync
        should("test getWalletLocationAsync") {
            // uncomment below to test getWalletLocationAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : LocationDtoEnvelope = apiInstance.getWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletLocationsAsync
        should("test getWalletLocationsAsync") {
            // uncomment below to test getWalletLocationsAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : LocationDtoListEnvelope = apiInstance.getWalletLocationsAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletLocationsCountAsync
        should("test getWalletLocationsCountAsync") {
            // uncomment below to test getWalletLocationsCountAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.getWalletLocationsCountAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletOrdersAsync
        should("test getWalletOrdersAsync") {
            // uncomment below to test getWalletOrdersAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : OrderDtoListEnvelope = apiInstance.getWalletOrdersAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletOrdersCountAsync
        should("test getWalletOrdersCountAsync") {
            // uncomment below to test getWalletOrdersCountAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.getWalletOrdersCountAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletPaymentsAsync
        should("test getWalletPaymentsAsync") {
            // uncomment below to test getWalletPaymentsAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : PaymentDtoListEnvelope = apiInstance.getWalletPaymentsAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getWalletPaymentsCountAsync
        should("test getWalletPaymentsCountAsync") {
            // uncomment below to test getWalletPaymentsCountAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.getWalletPaymentsCountAsync(walletId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test updateWalletLocationAsync
        should("test updateWalletLocationAsync") {
            // uncomment below to test updateWalletLocationAsync
            //val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val locationUpdateDto : LocationUpdateDto =  // LocationUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.updateWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion, locationUpdateDto)
            //result shouldBe ("TODO")
        }

    }
}