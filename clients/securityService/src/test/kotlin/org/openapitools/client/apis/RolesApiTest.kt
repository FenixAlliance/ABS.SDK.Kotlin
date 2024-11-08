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

import org.openapitools.client.apis.RolesApi
import org.openapitools.client.models.EmptyEnvelope
import org.openapitools.client.models.ErrorEnvelope
import org.openapitools.client.models.SecurityPermissionDtoListEnvelope
import org.openapitools.client.models.SecurityRoleCreateDto
import org.openapitools.client.models.SecurityRoleDtoListEnvelope
import org.openapitools.client.models.SecurityRoleUpdateDto
import org.openapitools.client.models.TenantEnrolmentDtoListEnvelope

class RolesApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RolesApi
        //val apiInstance = RolesApi()

        // to test apiV2SecurityServiceRolesGet
        should("test apiV2SecurityServiceRolesGet") {
            // uncomment below to test apiV2SecurityServiceRolesGet
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SecurityRoleDtoListEnvelope = apiInstance.apiV2SecurityServiceRolesGet(tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesPost
        should("test apiV2SecurityServiceRolesPost") {
            // uncomment below to test apiV2SecurityServiceRolesPost
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val securityRoleCreateDto : SecurityRoleCreateDto =  // SecurityRoleCreateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesPost(tenantId, apiVersion, xApiVersion, securityRoleCreateDto)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete
        should("test apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val applicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete(securityRoleId, applicationId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost
        should("test apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val applicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost(securityRoleId, applicationId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdDelete
        should("test apiV2SecurityServiceRolesSecurityRoleIdDelete") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdDelete
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdDelete(securityRoleId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete
        should("test apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val enrollmentId : kotlin.String = enrollmentId_example // kotlin.String | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete(securityRoleId, enrollmentId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost
        should("test apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val enrollmentId : kotlin.String = enrollmentId_example // kotlin.String | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost(securityRoleId, enrollmentId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet
        should("test apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : TenantEnrolmentDtoListEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet(securityRoleId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdGet
        should("test apiV2SecurityServiceRolesSecurityRoleIdGet") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdGet
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SecurityRoleDtoListEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdGet(securityRoleId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet
        should("test apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : SecurityPermissionDtoListEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet(securityRoleId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete
        should("test apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete(securityRoleId, securityPermissionId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost
        should("test apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost(securityRoleId, securityPermissionId, tenantId, apiVersion, xApiVersion)
            //result shouldBe ("TODO")
        }

        // to test apiV2SecurityServiceRolesSecurityRoleIdPut
        should("test apiV2SecurityServiceRolesSecurityRoleIdPut") {
            // uncomment below to test apiV2SecurityServiceRolesSecurityRoleIdPut
            //val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
            //val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
            //val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
            //val securityRoleUpdateDto : SecurityRoleUpdateDto =  // SecurityRoleUpdateDto | 
            //val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPut(securityRoleId, tenantId, apiVersion, xApiVersion, securityRoleUpdateDto)
            //result shouldBe ("TODO")
        }

    }
}
