package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import org.openapitools.client.model.Aspsp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AspspsApi
 */
class AspspsApiTest {

    private AspspsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(AspspsApi.class);
    }

    
    /**
     * 
     *
     * List all ASPSPs available.
     */
    @Test
    void retrieveAllSupportedASPSPSInAGivenCountryTest() {
        String country = null;
        // List<Aspsp> response = api.retrieveAllSupportedASPSPSInAGivenCountry(country);

        // TODO: test validations
    }

    /**
     * 
     *
     * List all ASPSPs available.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void retrieveAllSupportedASPSPSInAGivenCountryTestQueryMap() {
        AspspsApi.RetrieveAllSupportedASPSPSInAGivenCountryQueryParams queryParams = new AspspsApi.RetrieveAllSupportedASPSPSInAGivenCountryQueryParams()
            .country(null);
        // List<Aspsp> response = api.retrieveAllSupportedASPSPSInAGivenCountry(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * Get details about a specific ASPSP.
     */
    @Test
    void retrieveDetailsAboutSpecificASPSPTest() {
        String id = null;
        // Aspsp response = api.retrieveDetailsAboutSpecificASPSP(id);

        // TODO: test validations
    }

    
}
