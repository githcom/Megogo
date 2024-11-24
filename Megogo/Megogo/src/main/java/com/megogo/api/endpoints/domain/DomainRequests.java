package com.megogo.api.endpoints.domain;

import com.megogo.api.APIBase;
import com.megogo.api.endpoints.domain.models.DomainResponse;
import io.restassured.builder.RequestSpecBuilder;

import static com.megogo.api.HttpMethodsRequests.get;

public class DomainRequests extends APIBase {

    private static final String ENDPOINT = "/{domainNumber}.ua.pool.ntp.org";

    private RequestSpecBuilder requestSpecBuilder() {
        return basicRequestSpecBuilder().setBasePath(ENDPOINT);
    }

    public DomainResponse getDomain(String domainNumber) {
        var requestSpecBuilder = requestSpecBuilder()
                .addPathParam("domainNumber", domainNumber);
        var response = get(requestSpecBuilder);
        return response.as(DomainResponse.class);
    }
}
