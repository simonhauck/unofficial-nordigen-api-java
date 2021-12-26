package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import org.openapitools.client.model.EndUserAgreement;
import org.openapitools.client.model.EnduserAcceptanceDetails;
import org.openapitools.client.model.PaginatedEndUserAgreementList;
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
        String id = null;
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
    void createEUAV2Test() {
        EndUserAgreement endUserAgreement = null;
        // EndUserAgreement response = api.createEUAV2(endUserAgreement);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Delete End User Agreement.
     */
    @Test
    void deleteEUAByIdV2Test() {
        String id = null;
        // Map<String, Object> response = api.deleteEUAByIdV2(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * API endpoints related to end-user agreements.
     */
    @Test
    void retrieveAllEUAsForAnEndUserV2Test() {
        Integer limit = null;
        Integer offset = null;
        // PaginatedEndUserAgreementList response = api.retrieveAllEUAsForAnEndUserV2(limit, offset);

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
    void retrieveAllEUAsForAnEndUserV2TestQueryMap() {
        AgreementsApi.RetrieveAllEUAsForAnEndUserV2QueryParams queryParams = new AgreementsApi.RetrieveAllEUAsForAnEndUserV2QueryParams()
            .limit(null)
            .offset(null);
        // PaginatedEndUserAgreementList response = api.retrieveAllEUAsForAnEndUserV2(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * API endpoints related to end-user agreements.
     */
    @Test
    void retrieveEUAByIdV2Test() {
        String id = null;
        // EndUserAgreement response = api.retrieveEUAByIdV2(id);

        // TODO: test validations
    }

    
}
