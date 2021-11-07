# Unofficial Nordigen Api (Java)
[![Manual workflow](https://github.com/simonhauck/unofficial-nordigen-api-java/actions/workflows/manual.yml/badge.svg)](https://github.com/simonhauck/unofficial-nordigen-api-java/actions/workflows/manual.yml)
[![](https://jitpack.io/v/simonhauck/unofficial-nordigen-api-java.svg)](https://jitpack.io/#simonhauck/unofficial-nordigen-api-java)


This project provides a generated java api for
the [Nordigen](https://nordigen.com/en/account_information_documenation/api-documention/overview/) Banking Api which is
specified [here](https://ob.nordigen.com/api/swagger.json).

## Modification
The api.yaml is modified to resolve some short comings. 
- Path and UUID objects were replace to strings. Some default values were invalid which lead to exceptions
- Some methods returned void. In these cases now the raw string response is returned
- Enums don't include a description. This lead to parsing errors with enums


## Usage
1. This project is provided via `https://jitpack.io`. Add the registry to your `build.gradle`, `pom` or `build.gradle.kts`
Example `build.gradle`
````shell
repositories {
  ...
  maven { url 'https://jitpack.io' }
}
````
2. Add the dependecy
````shell
implementation 'com.github.simonhauck:unofficial-nordigen-api-java:2.0.0' 
````

## Basic Setup
With version 2.0 of the api the static api key was removed and users have to request now a dynamic token. The setup for this is slightly more complicated but below is an example in Kotlin and SpringBoot. I hope this gets you started :)

1. Create two api clients, one with and one without authentication. The authentication interceptor is implemented in step 3. 
````kotlin
class NordigenClientConfiguration {

    @Bean(name = ["NordigenWithAuth"])
    fun createNordigenClientWithAuth(
        @Value("\${nordigen.url}") url: String,
        nordigenApiKeyInterceptor: NordigenApiKeyInterceptor,
    ): ApiClient {
        return ApiClient().apply {
            basePath = url
            addAuthorization("NordigenToken", nordigenApiKeyInterceptor)
        }
    }

    @Bean(name = ["NordigenNoAuth"])
    fun createNordigenClientNoAuth(@Value("\${nordigen.url}") url: String): ApiClient {
        return ApiClient().apply { basePath = url }
    }
    
    // ...
 }
````

2. Create you required clients. The NordigenTokenApi client does not required authentication. All other clients require the authentication
````kotlin
class NordigenClientConfiguration {
    
    @Bean
    fun createNordigenAgreementsApi(@Qualifier("NordigenWithAuth") client: ApiClient): AgreementsApi {
        return client.buildClient(AgreementsApi::class.java)
    }

    @Bean
    fun createNordigenTokenApi(@Qualifier("NordigenNoAuth") client: ApiClient): TokenApi {
        return client.buildClient(TokenApi::class.java)
    }
    
    // ...
 }
````

3. Generate the code for the interceptor. Maybe its required to add the feign dependency for this explicitly in your build.gradle or pom file
````kotlin
@Component
class NordigenApiKeyInterceptor(
    private val nordigenTokenProvider: NordigenTokenProvider
) : RequestInterceptor {

    override fun apply(template: RequestTemplate) {
        val token = nordigenTokenProvider.getToken()
        template.header("Authorization", mutableListOf("Bearer $token"))
    }
}

@Component
class NordigenTokenProvider(
    private val nordigenTokenApi: TokenApi,

    @Value("\${nordigen.id}")
    private val nordigenSecretId: String,
    @Value("\${nordigen.key}")
    private val nordigenSecretKey: String,
) {
    fun getToken(): String {
        val body = JWTObtainPair().apply {
            secretId = nordigenSecretId
            secretKey = nordigenSecretKey
        }
        return nordigenTokenApi.jWTObtain(body).access
    }
}

````
4. Profit?! Now you can access the api
````kotlin

@Component
class ApiExample(private val agreementsApi: AgreementsApi) {

    fun endUserAgreementRequest(institutionId: String): EndUserAgreement {
        val endUserAgreementBody = getAgreementsBody(institutionId)
        return agreementsApi.createEUAV2(endUserAgreementBody)
    }
    
    private fun getAgreementsBody(institutionIdentifier: String): EndUserAgreement {
        return EndUserAgreement().apply {
            institutionId = institutionIdentifier
            accessScope = listOf("balances", "details", "transactions")
            accessValidForDays = 10
            maxHistoricalDays = 20
        }
    }
}

````

For more code see the informations in the generated [README](https://github.com/simonhauck/unofficial-nordigen-api-java/blob/master/generated/README.md)

## Generated code

The code for this project is generated with the [OpenApi Generator](https://github.com/OpenAPITools/openapi-generator).
The generated code is in the ``generated`` directory.

## Api Documentation

Please refer to
this [README](https://github.com/simonhauck/unofficial-nordigen-api-java/blob/master/generated/README.md)

