package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import org.openapitools.client.model.AccountV2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
class AccountsApiTest {

    private AccountsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(AccountsApi.class);
    }

    
    /**
     * 
     *
     * Access account balances.  Balances will be returned in Berlin Group PSD2 format.
     */
    @Test
    void retrieveAccountBalancesV22Test() {
        String id = null;
        // Map<String, Object> response = api.retrieveAccountBalancesV22(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Access account details.  Account details will be returned in Berlin Group PSD2 format.
     */
    @Test
    void retrieveAccountDetailsV22Test() {
        String id = null;
        // Map<String, Object> response = api.retrieveAccountDetailsV22(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Access account metadata.  Information about the account record, such as the processing status and IBAN.  Account status is recalculated based on the error count in the latest req.
     */
    @Test
    void retrieveAccountMetadataTest() {
        String id = null;
        // AccountV2 response = api.retrieveAccountMetadata(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
     */
    @Test
    void retrieveAccountTransactionsV22Test() {
        String id = null;
        String dateFrom = null;
        String dateTo = null;
        // Map<String, Object> response = api.retrieveAccountTransactionsV22(id, dateFrom, dateTo);

        // TODO: test validations
    }

    /**
     * 
     *
     * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void retrieveAccountTransactionsV22TestQueryMap() {
        String id = null;
        AccountsApi.RetrieveAccountTransactionsV22QueryParams queryParams = new AccountsApi.RetrieveAccountTransactionsV22QueryParams()
            .dateFrom(null)
            .dateTo(null);
        // Map<String, Object> response = api.retrieveAccountTransactionsV22(id, queryParams);

    // TODO: test validations
    }
    
}
