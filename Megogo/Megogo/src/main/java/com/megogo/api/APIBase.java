package com.megogo.api;

import com.megogo.config.TestConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import org.aeonbits.owner.ConfigCache;

public class APIBase {
    protected static final TestConfig CONFIG = ConfigCache.getOrCreate(TestConfig.class);
    private final String BASE_URI = CONFIG.hostUrl();

    protected RequestSpecBuilder basicRequestSpecBuilder() {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ErrorLoggingFilter())
                .setRelaxedHTTPSValidation()
                .setBaseUri(BASE_URI)
                .addHeader("Content-Type", ContentType.JSON.toString());
    }
}
