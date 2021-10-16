

# Requisition

RequisitionSerializer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [readonly]
**created** | **OffsetDateTime** | The date &amp; time at which the requisition was created. |  [readonly]
**redirect** | **URI** | redirect URL to your application after end-user authorization with ASPSP | 
**status** | [**RequisitionStatusEnum**](RequisitionStatusEnum.md) | status of this requisition |  [readonly]
**agreements** | **List&lt;UUID&gt;** | array of EUAs associated with this requisition |  [optional]
**accounts** | **List&lt;UUID&gt;** | array of account IDs retrieved within a scope of this requisition |  [readonly]
**reference** | **String** | additional ID to identify the end user | 
**enduserId** | **String** | end-user id in client&#39;s system, usually a UUID | 
**userLanguage** | **String** | user language for the views |  [optional]



