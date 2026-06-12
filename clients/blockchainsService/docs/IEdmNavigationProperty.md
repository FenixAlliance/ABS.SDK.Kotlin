
# IEdmNavigationProperty

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** |  |  [optional] [readonly] |
| **propertyKind** | [**inline**](#PropertyKind) |  |  [optional] [readonly] |
| **type** | [**IEdmTypeReference**](IEdmTypeReference.md) |  |  [optional] |
| **declaringType** | [**IEdmStructuredType**](IEdmStructuredType.md) |  |  [optional] |
| **partner** | [**IEdmNavigationProperty**](IEdmNavigationProperty.md) |  |  [optional] |
| **onDelete** | [**inline**](#OnDelete) |  |  [optional] [readonly] |
| **containsTarget** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **referentialConstraint** | [**IEdmReferentialConstraint**](IEdmReferentialConstraint.md) |  |  [optional] |


<a id="PropertyKind"></a>
## Enum: propertyKind
| Name | Value |
| ---- | ----- |
| propertyKind | None, Structural, Navigation |


<a id="OnDelete"></a>
## Enum: onDelete
| Name | Value |
| ---- | ----- |
| onDelete | None, Cascade |



