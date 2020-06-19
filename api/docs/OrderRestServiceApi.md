# OrderRestServiceApi

All URIs are relative to *http://service-api-ng.nightly.staging.colivery.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abortOrderDeliveryUsingPATCH**](OrderRestServiceApi.md#abortOrderDeliveryUsingPATCH) | **PATCH** /v1/order/{orderId}/abort | abortOrderDelivery
[**acceptOrderUsingPATCH**](OrderRestServiceApi.md#acceptOrderUsingPATCH) | **PATCH** /v1/order/{orderId}/accept | acceptOrder
[**cancelOrderUsingPATCH**](OrderRestServiceApi.md#cancelOrderUsingPATCH) | **PATCH** /v1/order/{orderId}/cancel | cancelOrder
[**createOrderUsingPOST**](OrderRestServiceApi.md#createOrderUsingPOST) | **POST** /v1/order | createOrder
[**deliverOrderUsingPATCH**](OrderRestServiceApi.md#deliverOrderUsingPATCH) | **PATCH** /v1/order/{orderId}/deliver | deliverOrder
[**searchOrdersInRangeUsingGET**](OrderRestServiceApi.md#searchOrdersInRangeUsingGET) | **GET** /v1/order | searchOrdersInRange


<a name="abortOrderDeliveryUsingPATCH"></a>
# **abortOrderDeliveryUsingPATCH**
> kotlin.Any abortOrderDeliveryUsingPATCH(orderId, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)

abortOrderDelivery

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = OrderRestServiceApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | orderId
val authenticated : kotlin.Boolean = true // kotlin.Boolean | 
val authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority : kotlin.String = authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority_example // kotlin.String | 
val credentials : kotlin.Any = Object // kotlin.Any | 
val details : kotlin.Any = Object // kotlin.Any | 
val principal : kotlin.Any = Object // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.abortOrderDeliveryUsingPATCH(orderId, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderRestServiceApi#abortOrderDeliveryUsingPATCH")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderRestServiceApi#abortOrderDeliveryUsingPATCH")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**java.util.UUID**](.md)| orderId |
 **authenticated** | **kotlin.Boolean**|  | [optional]
 **authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority** | **kotlin.String**|  | [optional]
 **credentials** | [**kotlin.Any**](.md)|  | [optional]
 **details** | [**kotlin.Any**](.md)|  | [optional]
 **principal** | [**kotlin.Any**](.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="acceptOrderUsingPATCH"></a>
# **acceptOrderUsingPATCH**
> kotlin.Any acceptOrderUsingPATCH(orderId, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)

acceptOrder

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = OrderRestServiceApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | orderId
val authenticated : kotlin.Boolean = true // kotlin.Boolean | 
val authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority : kotlin.String = authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority_example // kotlin.String | 
val credentials : kotlin.Any = Object // kotlin.Any | 
val details : kotlin.Any = Object // kotlin.Any | 
val principal : kotlin.Any = Object // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.acceptOrderUsingPATCH(orderId, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderRestServiceApi#acceptOrderUsingPATCH")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderRestServiceApi#acceptOrderUsingPATCH")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**java.util.UUID**](.md)| orderId |
 **authenticated** | **kotlin.Boolean**|  | [optional]
 **authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority** | **kotlin.String**|  | [optional]
 **credentials** | [**kotlin.Any**](.md)|  | [optional]
 **details** | [**kotlin.Any**](.md)|  | [optional]
 **principal** | [**kotlin.Any**](.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelOrderUsingPATCH"></a>
# **cancelOrderUsingPATCH**
> kotlin.Any cancelOrderUsingPATCH(orderId, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)

cancelOrder

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = OrderRestServiceApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | orderId
val authenticated : kotlin.Boolean = true // kotlin.Boolean | 
val authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority : kotlin.String = authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority_example // kotlin.String | 
val credentials : kotlin.Any = Object // kotlin.Any | 
val details : kotlin.Any = Object // kotlin.Any | 
val principal : kotlin.Any = Object // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.cancelOrderUsingPATCH(orderId, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderRestServiceApi#cancelOrderUsingPATCH")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderRestServiceApi#cancelOrderUsingPATCH")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**java.util.UUID**](.md)| orderId |
 **authenticated** | **kotlin.Boolean**|  | [optional]
 **authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority** | **kotlin.String**|  | [optional]
 **credentials** | [**kotlin.Any**](.md)|  | [optional]
 **details** | [**kotlin.Any**](.md)|  | [optional]
 **principal** | [**kotlin.Any**](.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderUsingPOST"></a>
# **createOrderUsingPOST**
> kotlin.Any createOrderUsingPOST(order, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)

createOrder

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = OrderRestServiceApi()
val order : CreateOrderDtoModel =  // CreateOrderDtoModel | order
val authenticated : kotlin.Boolean = true // kotlin.Boolean | 
val authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority : kotlin.String = authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority_example // kotlin.String | 
val credentials : kotlin.Any = Object // kotlin.Any | 
val details : kotlin.Any = Object // kotlin.Any | 
val principal : kotlin.Any = Object // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.createOrderUsingPOST(order, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderRestServiceApi#createOrderUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderRestServiceApi#createOrderUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**CreateOrderDtoModel**](CreateOrderDtoModel.md)| order |
 **authenticated** | **kotlin.Boolean**|  | [optional]
 **authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority** | **kotlin.String**|  | [optional]
 **credentials** | [**kotlin.Any**](.md)|  | [optional]
 **details** | [**kotlin.Any**](.md)|  | [optional]
 **principal** | [**kotlin.Any**](.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deliverOrderUsingPATCH"></a>
# **deliverOrderUsingPATCH**
> kotlin.Any deliverOrderUsingPATCH(orderId, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)

deliverOrder

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = OrderRestServiceApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | orderId
val authenticated : kotlin.Boolean = true // kotlin.Boolean | 
val authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority : kotlin.String = authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority_example // kotlin.String | 
val credentials : kotlin.Any = Object // kotlin.Any | 
val details : kotlin.Any = Object // kotlin.Any | 
val principal : kotlin.Any = Object // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.deliverOrderUsingPATCH(orderId, authenticated, authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority, credentials, details, principal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderRestServiceApi#deliverOrderUsingPATCH")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderRestServiceApi#deliverOrderUsingPATCH")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**java.util.UUID**](.md)| orderId |
 **authenticated** | **kotlin.Boolean**|  | [optional]
 **authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority** | **kotlin.String**|  | [optional]
 **credentials** | [**kotlin.Any**](.md)|  | [optional]
 **details** | [**kotlin.Any**](.md)|  | [optional]
 **principal** | [**kotlin.Any**](.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchOrdersInRangeUsingGET"></a>
# **searchOrdersInRangeUsingGET**
> FluxUserOrderSearchResponseModel searchOrdersInRangeUsingGET(latitude, longitude, range)

searchOrdersInRange

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = OrderRestServiceApi()
val latitude : kotlin.Double = 1.2 // kotlin.Double | latitude
val longitude : kotlin.Double = 1.2 // kotlin.Double | longitude
val range : kotlin.Int = 56 // kotlin.Int | range
try {
    val result : FluxUserOrderSearchResponseModel = apiInstance.searchOrdersInRangeUsingGET(latitude, longitude, range)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderRestServiceApi#searchOrdersInRangeUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderRestServiceApi#searchOrdersInRangeUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **kotlin.Double**| latitude |
 **longitude** | **kotlin.Double**| longitude |
 **range** | **kotlin.Int**| range |

### Return type

[**FluxUserOrderSearchResponseModel**](FluxUserOrderSearchResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

