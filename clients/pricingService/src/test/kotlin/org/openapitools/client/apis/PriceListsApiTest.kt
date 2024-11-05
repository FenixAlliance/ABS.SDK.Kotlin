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

import org.openapitools.client.apis.PriceListsApi
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.Int32Envelope
import org.openapitools.client.models.ItemPriceCreateDto
import org.openapitools.client.models.ItemPriceDtoEnvelope
import org.openapitools.client.models.ItemPriceDtoListEnvelope
import org.openapitools.client.models.ItemPriceUpdateDto
import org.openapitools.client.models.PriceListCreateDto
import org.openapitools.client.models.PriceListDtoEnvelope
import org.openapitools.client.models.PriceListDtoListEnvelope
import org.openapitools.client.models.PriceListUpdateDto

class PriceListsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of PriceListsApi
        //val apiInstance = PriceListsApi()

        // to test apiV2PricingServicePriceListsCountGet
        should("test apiV2PricingServicePriceListsCountGet") {
            // uncomment below to test apiV2PricingServicePriceListsCountGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : Int32Envelope = apiInstance.apiV2PricingServicePriceListsCountGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2PricingServicePriceListsGet
        should("test apiV2PricingServicePriceListsGet") {
            // uncomment below to test apiV2PricingServicePriceListsGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : PriceListDtoListEnvelope = apiInstance.apiV2PricingServicePriceListsGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2PricingServicePriceListsPost
        should("test apiV2PricingServicePriceListsPost") {
            // uncomment below to test apiV2PricingServicePriceListsPost
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val priceListCreateDto : PriceListCreateDto =  // PriceListCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPost(tenantId, apiVersion, xApiVersion, priceListCreateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2PricingServicePriceListsPriceListIdDelete
        should("test apiV2PricingServicePriceListsPriceListIdDelete") {
            // uncomment below to test apiV2PricingServicePriceListsPriceListIdDelete
            //val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPriceListIdDelete(priceListId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2PricingServicePriceListsPriceListIdPricesPost
        should("test apiV2PricingServicePriceListsPriceListIdPricesPost") {
            // uncomment below to test apiV2PricingServicePriceListsPriceListIdPricesPost
            //val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val itemPriceCreateDto : ItemPriceCreateDto =  // ItemPriceCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPriceListIdPricesPost(priceListId, tenantId, apiVersion, xApiVersion, itemPriceCreateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete
        should("test apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete") {
            // uncomment below to test apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete
            //val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val priceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete(priceListId, priceId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut
        should("test apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut") {
            // uncomment below to test apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut
            //val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val priceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val itemPriceUpdateDto : ItemPriceUpdateDto =  // ItemPriceUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut(priceListId, priceId, tenantId, apiVersion, xApiVersion, itemPriceUpdateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2PricingServicePriceListsPriceListIdPut
        should("test apiV2PricingServicePriceListsPriceListIdPut") {
            // uncomment below to test apiV2PricingServicePriceListsPriceListIdPut
            //val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val priceListUpdateDto : PriceListUpdateDto =  // PriceListUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPriceListIdPut(priceListId, tenantId, apiVersion, xApiVersion, priceListUpdateDto)
            //result shouldBe ("TODO")
        }

        // to test getPriceListAsync
        should("test getPriceListAsync") {
            // uncomment below to test getPriceListAsync
            //val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : PriceListDtoEnvelope = apiInstance.getPriceListAsync(priceListId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getPriceListPriceAsync
        should("test getPriceListPriceAsync") {
            // uncomment below to test getPriceListPriceAsync
            //val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val priceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : ItemPriceDtoEnvelope = apiInstance.getPriceListPriceAsync(priceListId, priceId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test getPriceListPricesAsync
        should("test getPriceListPricesAsync") {
            // uncomment below to test getPriceListPricesAsync
            //val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : ItemPriceDtoListEnvelope = apiInstance.getPriceListPricesAsync(priceListId, tenantId, itemId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

    }
}