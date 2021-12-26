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
 * API tests for InstitutionsApi
 */
class InstitutionsApiTest {

    private InstitutionsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(InstitutionsApi.class);
    }

    
    /**
     * 
     *
     * List all available institutions
     */
    @Test
    void retrieveAllSupportedInstitutionsInAGivenCountryTest() {
        String country = null;
        // List<Aspsp> response = api.retrieveAllSupportedInstitutionsInAGivenCountry(country);

        // TODO: test validations
    }

    /**
     * 
     *
     * List all available institutions
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void retrieveAllSupportedInstitutionsInAGivenCountryTestQueryMap() {
        InstitutionsApi.RetrieveAllSupportedInstitutionsInAGivenCountryQueryParams queryParams = new InstitutionsApi.RetrieveAllSupportedInstitutionsInAGivenCountryQueryParams()
            .country(null);
        // List<Aspsp> response = api.retrieveAllSupportedInstitutionsInAGivenCountry(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * Get details about a specific Institution
     */
    @Test
    void retrieveInstitutionTest() {
        String id = null;
        // Aspsp response = api.retrieveInstitution(id);

        // TODO: test validations
    }

    
}
