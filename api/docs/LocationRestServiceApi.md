# LocationRestServiceApi

All URIs are relative to *http://service-api-ng.nightly.staging.colivery.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**geoCodeAddressUsingGET**](LocationRestServiceApi.md#geoCodeAddressUsingGET) | **GET** /v1/location | geoCodeAddress


<a name="geoCodeAddressUsingGET"></a>
# **geoCodeAddressUsingGET**
> kotlin.Any geoCodeAddressUsingGET(countryCode, zipCode)

geoCodeAddress

### Example
```kotlin
// Import classes:
//import jetzt.machbarschaft.android.infrastructure.*
//import jetzt.machbarschaft.android.api.model.*

val apiInstance = LocationRestServiceApi()
val countryCode : kotlin.String = countryCode_example // kotlin.String | countryCode
val zipCode : kotlin.String = zipCode_example // kotlin.String | zipCode
try {
    val result : kotlin.Any = apiInstance.geoCodeAddressUsingGET(countryCode, zipCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationRestServiceApi#geoCodeAddressUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationRestServiceApi#geoCodeAddressUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **kotlin.String**| countryCode | [enum: UNDEFINED, AC, AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS, AT, AU, AW, AX, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BQ, BR, BS, BT, BU, BV, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CP, CR, CS, CU, CV, CW, CX, CY, CZ, DE, DG, DJ, DK, DM, DO, DZ, EA, EC, EE, EG, EH, ER, ES, ET, EU, EZ, FI, FJ, FK, FM, FO, FR, FX, GA, GB, GD, GE, GF, GG, GH, GI, GL, GM, GN, GP, GQ, GR, GS, GT, GU, GW, GY, HK, HM, HN, HR, HT, HU, IC, ID, IE, IL, IM, IN, IO, IQ, IR, IS, IT, JE, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MQ, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NF, NG, NI, NL, NO, NP, NR, NT, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PS, PT, PW, PY, QA, RE, RO, RS, RU, RW, SA, SB, SC, SD, SE, SF, SG, SH, SI, SJ, SK, SL, SM, SN, SO, SR, SS, ST, SU, SV, SX, SY, SZ, TA, TC, TD, TF, TG, TH, TJ, TK, TL, TM, TN, TO, TP, TR, TT, TV, TW, TZ, UA, UG, UK, UM, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, XK, YE, YT, YU, ZA, ZM, ZR, ZW]
 **zipCode** | **kotlin.String**| zipCode |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

