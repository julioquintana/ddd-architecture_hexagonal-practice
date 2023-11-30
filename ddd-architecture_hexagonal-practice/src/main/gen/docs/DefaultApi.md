# DefaultApi

All URIs are relative to *https://ddd_architecture_hexagonal_practice*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**saveUser**](DefaultApi.md#saveUser) | **POST** /users | POST users |


<a name="saveUser"></a>
# **saveUser**
> UserDto saveUser(userDto)

POST users

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ddd_architecture_hexagonal_practice");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UserDto userDto = new UserDto(); // UserDto | 
    try {
      UserDto result = apiInstance.saveUser(userDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#saveUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userDto** | [**UserDto**](UserDto.md)|  | |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

