package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import org.openapitools.client.model.JWTObtainPair;
import org.openapitools.client.model.JWTRefresh;
import org.openapitools.client.model.SpectacularJWTObtain;
import org.openapitools.client.model.SpectacularJWTRefresh;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokenApi
 */
class TokenApiTest {

    private TokenApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(TokenApi.class);
    }

    
    /**
     * 
     *
     * Obtain JWT pair
     */
    @Test
    void jWTObtainTest() {
        JWTObtainPair jwTObtainPair = null;
        // SpectacularJWTObtain response = api.jWTObtain(jwTObtainPair);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * Refresh access token
     */
    @Test
    void jWTRefreshTest() {
        JWTRefresh jwTRefresh = null;
        // SpectacularJWTRefresh response = api.jWTRefresh(jwTRefresh);

        // TODO: test validations
    }

    
}
