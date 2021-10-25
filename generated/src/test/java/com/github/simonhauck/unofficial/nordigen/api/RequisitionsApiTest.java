package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import org.openapitools.client.model.PaginatedRequisitionV2List;
import org.openapitools.client.model.RequisitionV2;
import org.openapitools.client.model.SpectacularRequisitionV2;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RequisitionsApi
 */
class RequisitionsApiTest {

    private RequisitionsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(RequisitionsApi.class);
    }

    
    /**
     * 
     *
     * Delete Requisition and all End User Agreements.
     */
    @Test
    void deleteRequisitionByIdV2Test() {
        UUID id = null;
        // api.deleteRequisitionByIdV2(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * API endpoints related to requisitions.
     */
    @Test
    void requisitionByIdTest() {
        UUID id = null;
        // RequisitionV2 response = api.requisitionById(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * API endpoints related to requisitions.
     */
    @Test
    void requisitionCreatedTest() {
        RequisitionV2 requisitionV2 = null;
        // SpectacularRequisitionV2 response = api.requisitionCreated(requisitionV2);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * API endpoints related to requisitions.
     */
    @Test
    void retrieveAllRequisitionsTest() {
        Integer limit = null;
        Integer offset = null;
        // PaginatedRequisitionV2List response = api.retrieveAllRequisitions(limit, offset);

        // TODO: test validations
    }

    /**
     * 
     *
     * API endpoints related to requisitions.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void retrieveAllRequisitionsTestQueryMap() {
        RequisitionsApi.RetrieveAllRequisitionsQueryParams queryParams = new RequisitionsApi.RetrieveAllRequisitionsQueryParams()
            .limit(null)
            .offset(null);
        // PaginatedRequisitionV2List response = api.retrieveAllRequisitions(queryParams);

    // TODO: test validations
    }
    
}
