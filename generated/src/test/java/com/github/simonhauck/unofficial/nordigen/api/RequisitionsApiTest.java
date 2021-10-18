package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import org.openapitools.client.model.PaginatedRequisitionList;
import org.openapitools.client.model.Requisition;
import org.openapitools.client.model.RequisitionLinkParams;
import org.openapitools.client.model.RequisitionLinks;
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
     * API endpoints related to requisitions.
     */
    @Test
    void createANewRequisitionTest() {
        Requisition requisition = null;
        // Requisition response = api.createANewRequisition(requisition);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Get links for user redirection.
     */
    @Test
    void createASPSPAuthorizationLinkTest() {
        UUID id = null;
        RequisitionLinkParams requisitionLinkParams = null;
        // RequisitionLinks response = api.createASPSPAuthorizationLink(id, requisitionLinkParams);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Delete Requisition and all End User Agreements.
     */
    @Test
    void deleteRequisitionTest() {
        UUID id = null;
        // api.deleteRequisition(id);

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
        // Requisition response = api.requisitionById(id);

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
        // PaginatedRequisitionList response = api.retrieveAllRequisitions(limit, offset);

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
        // PaginatedRequisitionList response = api.retrieveAllRequisitions(queryParams);

    // TODO: test validations
    }
    
}
