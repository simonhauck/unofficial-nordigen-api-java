package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import org.openapitools.client.model.AccountV2;
import java.util.UUID;
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
    void retrieveAccountBalancesTest() {
        UUID id = null;
        // Map<String, Object> response = api.retrieveAccountBalances(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Access account details.  Account details will be returned in Berlin Group PSD2 format.
     */
    @Test
    void retrieveAccountDetailsTest() {
        UUID id = null;
        // Map<String, Object> response = api.retrieveAccountDetails(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Access account metadata.  Information about the account record, such as the processing status and IBAN.  Account status is recalculated based on the error count in the latest req.
     */
    @Test
    void retrieveAccountMetadataTest() {
        UUID id = null;
        // AccountV2 response = api.retrieveAccountMetadata(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
     */
    @Test
    void retrieveAccountTransactionsTest() {
        UUID id = null;
        // Map<String, Object> response = api.retrieveAccountTransactions(id);

        // TODO: test validations
    }

    
}
