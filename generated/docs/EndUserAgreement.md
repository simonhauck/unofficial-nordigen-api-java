

# EndUserAgreement

Represents an end-user agreement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | The ID of this End User Agreement, used to refer to this end user agreement in other API calls. |  [readonly]
**created** | **OffsetDateTime** | The date &amp; time at which the end user agreement was created. |  [readonly]
**maxHistoricalDays** | **Integer** | Maximum number of days of transaction data to retrieve. |  [optional]
**accessValidForDays** | **Integer** | Number of days from acceptance that the access can be used. |  [readonly]
**accessScope** | **List&lt;String&gt;** | Array containing one or several values of [&#39;balances&#39;, &#39;details&#39;, &#39;transactions&#39;] |  [optional]
**accepted** | **OffsetDateTime** | The date &amp; time at which the end user accepted the agreement. |  [readonly]
**enduserId** | **String** | A unique ID that identifies this user in your system. For data protection purposes, it must be possible to identify your users using this value. Data protection related requests may quote this value to identify data subjects. | 
**aspspId** | **String** | an ASPSP ID for this EUA | 



