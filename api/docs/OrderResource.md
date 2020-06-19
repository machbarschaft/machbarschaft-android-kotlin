
# OrderResourceModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**items** | [**kotlin.Array&lt;OrderItemResourceModel&gt;**](OrderItemResourceModel.md) |  | 
**source** | [**inline**](#SourceEnum) |  | 
**status** | [**inline**](#StatusEnum) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**hint** | **kotlin.String** |  |  [optional]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**maxPrice** | **kotlin.Int** |  |  [optional]


<a name="SourceEnum"></a>
## Enum: source
Name | Value
---- | -----
source | HOTLINE, APP


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | TO_BE_DELIVERED, DELIVERED, CONSUMER_CANCELLED, ACCEPTED



