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

import org.openapitools.client.apis.ExchangeVApi
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.ExchangeRateEnvelope

class ExchangeVApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ExchangeVApi
        //val apiInstance = ExchangeVApi()

        // to test apiV3ForexServiceExchangeHistoryGet
        should("test apiV3ForexServiceExchangeHistoryGet") {
            // uncomment below to test apiV3ForexServiceExchangeHistoryGet
            //val amount : kotlin.Double = 1.2 // kotlin.Double | 
            //val sourceCurrencyId : kotlin.String = sourceCurrencyId_example // kotlin.String | 
            //val targetCurrencyId : kotlin.String = targetCurrencyId_example // kotlin.String | 
            //val date : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
            //val result : ExchangeRateEnvelope = apiInstance.apiV3ForexServiceExchangeHistoryGet(amount, sourceCurrencyId, targetCurrencyId, date)
            //result shouldBe ("TODO")
        }

        // to test apiV3ForexServiceExchangeLatestGet
        should("test apiV3ForexServiceExchangeLatestGet") {
            // uncomment below to test apiV3ForexServiceExchangeLatestGet
            //val amount : kotlin.Double = 1.2 // kotlin.Double | 
            //val sourceCurrencyId : kotlin.String = sourceCurrencyId_example // kotlin.String | 
            //val targetCurrencyId : kotlin.String = targetCurrencyId_example // kotlin.String | 
            //val result : ExchangeRateEnvelope = apiInstance.apiV3ForexServiceExchangeLatestGet(amount, sourceCurrencyId, targetCurrencyId)
            //result shouldBe ("TODO")
        }

    }
}