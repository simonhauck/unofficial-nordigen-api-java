# Unofficial Nordigen Api (Java)
[![Manual workflow](https://github.com/simonhauck/unofficial-nordigen-api-java/actions/workflows/manual.yml/badge.svg)](https://github.com/simonhauck/unofficial-nordigen-api-java/actions/workflows/manual.yml)
[![](https://jitpack.io/v/simonhauck/unofficial-nordigen-api-java.svg)](https://jitpack.io/#simonhauck/unofficial-nordigen-api-java)


This project provides a generated java api for
the [Nordigen](https://nordigen.com/en/account_information_documenation/api-documention/overview/) Banking Api which is
specified [here](https://ob.nordigen.com/api/swagger.json).

Important note:
The json is sligtly modified. Some endpoints did not contain a reponse object, which led to Void return types. To prevent this, the response of those endpoints is modified to return a string instead which must be interpreted manually.

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
implementation 'com.github.simonhauck:unofficial-nordigen-api-java:1.7.1' 
````

3. And here is a basic example in kotlin. For more code see the informations in the generated [README](https://github.com/simonhauck/unofficial-nordigen-api-java/blob/master/generated/README.md)
````kotlin
    val client = ApiClient("tokenAuth", "Token yourToken")
    client.basePath = "https://ob.nordigen.com"

    val buildClient = client.buildClient(AspspsApi::class.java)

    val aspsps = buildClient.retrieveAllSupportedASPSPSInAGivenCountry("")
````

## Generated code

The code for this project is generated with the [OpenApi Generator](https://github.com/OpenAPITools/openapi-generator).
The generated code is in the ``generated`` directory.

## Api Documentation

Please refer to
this [README](https://github.com/simonhauck/unofficial-nordigen-api-java/blob/master/generated/README.md)

