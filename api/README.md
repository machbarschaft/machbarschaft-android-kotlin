# jetzt.machbarschaft.android - Kotlin client library for Api Documentation

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://service-api-ng.nightly.staging.colivery.app*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminRestServiceApi* | [**updateUserAdminUsingPATCH**](docs/AdminRestServiceApi.md#updateuseradminusingpatch) | **PATCH** /v1/admin/users/{userId} | updateUserAdmin
*LocationRestServiceApi* | [**geoCodeAddressUsingGET**](docs/LocationRestServiceApi.md#geocodeaddressusingget) | **GET** /v1/location | geoCodeAddress
*OrderRestServiceApi* | [**abortOrderDeliveryUsingPATCH**](docs/OrderRestServiceApi.md#abortorderdeliveryusingpatch) | **PATCH** /v1/order/{orderId}/abort | abortOrderDelivery
*OrderRestServiceApi* | [**acceptOrderUsingPATCH**](docs/OrderRestServiceApi.md#acceptorderusingpatch) | **PATCH** /v1/order/{orderId}/accept | acceptOrder
*OrderRestServiceApi* | [**cancelOrderUsingPATCH**](docs/OrderRestServiceApi.md#cancelorderusingpatch) | **PATCH** /v1/order/{orderId}/cancel | cancelOrder
*OrderRestServiceApi* | [**createOrderUsingPOST**](docs/OrderRestServiceApi.md#createorderusingpost) | **POST** /v1/order | createOrder
*OrderRestServiceApi* | [**deliverOrderUsingPATCH**](docs/OrderRestServiceApi.md#deliverorderusingpatch) | **PATCH** /v1/order/{orderId}/deliver | deliverOrder
*OrderRestServiceApi* | [**searchOrdersInRangeUsingGET**](docs/OrderRestServiceApi.md#searchordersinrangeusingget) | **GET** /v1/order | searchOrdersInRange
*UserRestServiceApi* | [**createUserUsingPOST**](docs/UserRestServiceApi.md#createuserusingpost) | **POST** /v1/user | createUser
*UserRestServiceApi* | [**deleteOwnUserUsingDELETE**](docs/UserRestServiceApi.md#deleteownuserusingdelete) | **DELETE** /v1/user | deleteOwnUser
*UserRestServiceApi* | [**getDriverOrdersUsingGET**](docs/UserRestServiceApi.md#getdriverordersusingget) | **GET** /v1/user/orders-accepted | getDriverOrders
*UserRestServiceApi* | [**getOrdersForUserUsingGET**](docs/UserRestServiceApi.md#getordersforuserusingget) | **GET** /v1/user/orders | getOrdersForUser
*UserRestServiceApi* | [**getUserUsingGET**](docs/UserRestServiceApi.md#getuserusingget) | **GET** /v1/user | getUser
*UserRestServiceApi* | [**searchUserUsingGET**](docs/UserRestServiceApi.md#searchuserusingget) | **GET** /v1/user/search | searchUser
*UserRestServiceApi* | [**updateOwnUserUsingPUT**](docs/UserRestServiceApi.md#updateownuserusingput) | **PUT** /v1/user | updateOwnUser


<a name="documentation-for-models"></a>
## Documentation for Models

 - [jetzt.machbarschaft.android.api.model.AnonymizedUserResourceModel](docs/AnonymizedUserResourceModel.md)
 - [jetzt.machbarschaft.android.api.model.CreateOrderDtoModel](docs/CreateOrderDtoModel.md)
 - [jetzt.machbarschaft.android.api.model.CreateOrderItemDtoModel](docs/CreateOrderItemDtoModel.md)
 - [jetzt.machbarschaft.android.api.model.CreateUserDtoModel](docs/CreateUserDtoModel.md)
 - [jetzt.machbarschaft.android.api.model.FluxUserOrderAcceptedResponseModel](docs/FluxUserOrderAcceptedResponseModel.md)
 - [jetzt.machbarschaft.android.api.model.FluxUserOrderResponseModel](docs/FluxUserOrderResponseModel.md)
 - [jetzt.machbarschaft.android.api.model.FluxUserOrderSearchResponseModel](docs/FluxUserOrderSearchResponseModel.md)
 - [jetzt.machbarschaft.android.api.model.GeoPointResource1Model](docs/GeoPointResource1Model.md)
 - [jetzt.machbarschaft.android.api.model.GeoPointResourceModel](docs/GeoPointResourceModel.md)
 - [jetzt.machbarschaft.android.api.model.LocationResourceModel](docs/LocationResourceModel.md)
 - [jetzt.machbarschaft.android.api.model.OrderItemResourceModel](docs/OrderItemResourceModel.md)
 - [jetzt.machbarschaft.android.api.model.OrderResourceModel](docs/OrderResourceModel.md)
 - [jetzt.machbarschaft.android.api.model.PatchUserAdminDtoModel](docs/PatchUserAdminDtoModel.md)
 - [jetzt.machbarschaft.android.api.model.UpdateUserDtoModel](docs/UpdateUserDtoModel.md)
 - [jetzt.machbarschaft.android.api.model.UserOrderAcceptedResponseModel](docs/UserOrderAcceptedResponseModel.md)
 - [jetzt.machbarschaft.android.api.model.UserOrderResponseModel](docs/UserOrderResponseModel.md)
 - [jetzt.machbarschaft.android.api.model.UserOrderSearchResponseModel](docs/UserOrderSearchResponseModel.md)
 - [jetzt.machbarschaft.android.api.model.UserResourceModel](docs/UserResourceModel.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
