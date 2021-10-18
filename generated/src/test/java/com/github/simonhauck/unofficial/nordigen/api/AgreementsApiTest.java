package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import org.openapitools.client.model.EndUserAgreement;
import org.openapitools.client.model.EnduserAcceptanceDetails;
import org.openapitools.client.model.PaginatedEndUserAgreementList;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AgreementsApi
 */
class AgreementsApiTest {

    private AgreementsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(AgreementsApi.class);
    }

    
    /**
     * 
     *
     * Accept an end-user agreement via the API.
     */
    @Test
    void acceptEUATest() {
        UUID id = null;
        EnduserAcceptanceDetails enduserAcceptanceDetails = null;
        // EndUserAgreement response = api.acceptEUA(id, enduserAcceptanceDetails);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * API endpoints related to end-user agreements.
     */
    @Test
    void createEUATest() {
        EndUserAgreement endUserAgreement = null;
        // EndUserAgreement response = api.createEUA(endUserAgreement);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Delete End User Agreement.
     */
    @Test
    void deleteEUAByIdTest() {
        UUID id = null;
        // api.deleteEUAById(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * API endpoints related to end-user agreements.
     */
    @Test
    void retrieveAllEUAsForAnEndUserTest() {
        String enduserId = null;
        Integer limit = null;
        Integer offset = null;
        // PaginatedEndUserAgreementList response = api.retrieveAllEUAsForAnEndUser(enduserId, limit, offset);

        // TODO: test validations
    }

    /**
     * 
     *
     * API endpoints related to end-user agreements.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void retrieveAllEUAsForAnEndUserTestQueryMap() {
        AgreementsApi.RetrieveAllEUAsForAnEndUserQueryParams queryParams = new AgreementsApi.RetrieveAllEUAsForAnEndUserQueryParams()
            .enduserId(null)
            .limit(null)
            .offset(null);
        // PaginatedEndUserAgreementList response = api.retrieveAllEUAsForAnEndUser(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * API endpoints related to end-user agreements.
     */
    @Test
    void retrieveEUAByIdTest() {
        UUID id = null;
        // EndUserAgreement response = api.retrieveEUAById(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Show the text of the end-user agreement.
     */
    @Test
    void retrieveEUATextTest() {
        UUID id = null;
        // String response = api.retrieveEUAText(id);

        // TODO: test validations
    }

    
}
