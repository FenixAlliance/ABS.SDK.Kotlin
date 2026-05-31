
# IEdmEntityType

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **typeKind** | [**inline**](#TypeKind) |  |  [optional] [readonly] |
| **name** | **kotlin.String** |  |  [optional] [readonly] |
| **isAbstract** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **isOpen** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **baseType** | [**IEdmStructuredType**](IEdmStructuredType.md) |  |  [optional] |
| **declaredProperties** | [**kotlin.collections.List&lt;IEdmProperty&gt;**](IEdmProperty.md) |  |  [optional] [readonly] |
| **schemaElementKind** | [**inline**](#SchemaElementKind) |  |  [optional] [readonly] |
| **namespace** | **kotlin.String** |  |  [optional] [readonly] |
| **declaredKey** | [**kotlin.collections.List&lt;IEdmStructuralProperty&gt;**](IEdmStructuralProperty.md) |  |  [optional] [readonly] |
| **hasStream** | **kotlin.Boolean** |  |  [optional] [readonly] |


<a id="TypeKind"></a>
## Enum: typeKind
| Name | Value |
| ---- | ----- |
| typeKind | None, Primitive, Entity, Complex, Collection, EntityReference, Enum, TypeDefinition, Untyped, Path |


<a id="SchemaElementKind"></a>
## Enum: schemaElementKind
| Name | Value |
| ---- | ----- |
| schemaElementKind | None, TypeDefinition, Term, Action, EntityContainer, Function |



