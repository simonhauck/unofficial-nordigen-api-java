package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import org.threeten.bp.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PremiumApi
 */
class PremiumApiTest {

    private PremiumApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PremiumApi.class);
    }

    
    /**
     * 
     *
     * Access account premium balances.
     */
    @Test
    void retrieveAccountBalancesV2Test() {
        String id = null;
        // api.retrieveAccountBalancesV2(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Access account premium details.
     */
    @Test
    void retrieveAccountDetailsV2Test() {
        String id = null;
        String country = null;
        // api.retrieveAccountDetailsV2(id, country);

        // TODO: test validations
    }

    /**
     * 
     *
     * Access account premium details.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void retrieveAccountDetailsV2TestQueryMap() {
        String id = null;
        PremiumApi.RetrieveAccountDetailsV2QueryParams queryParams = new PremiumApi.RetrieveAccountDetailsV2QueryParams()
            .country(null);
        // api.retrieveAccountDetailsV2(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * Access account premium transactions.
     */
    @Test
    void retrieveAccountTransactionsV2Test() {
        String id = null;
        String country = null;
        LocalDate dateFrom = null;
        LocalDate dateTo = null;
        // api.retrieveAccountTransactionsV2(id, country, dateFrom, dateTo);

        // TODO: test validations
    }

    /**
     * 
     *
     * Access account premium transactions.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void retrieveAccountTransactionsV2TestQueryMap() {
        String id = null;
        PremiumApi.RetrieveAccountTransactionsV2QueryParams queryParams = new PremiumApi.RetrieveAccountTransactionsV2QueryParams()
            .country(null)
            .dateFrom(null)
            .dateTo(null);
        // api.retrieveAccountTransactionsV2(id, queryParams);

    // TODO: test validations
    }
    
}
