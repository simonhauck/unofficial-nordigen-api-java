

# Account

The representation of a bank account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | The ID of this Account, used to refer to this account in other API calls. |  [readonly]
**created** | **OffsetDateTime** | The date &amp; time at which the account object was created. |  [readonly]
**lastAccessed** | **OffsetDateTime** | The date &amp; time at which the account object was last accessed. |  [readonly]
**iban** | **String** | The Account IBAN |  [readonly]
**aspspIdentifier** | **String** | The ASPSP associated with this account. |  [readonly]
**status** | [**AccountStatusEnum**](AccountStatusEnum.md) | The processing status of this account. |  [readonly]



