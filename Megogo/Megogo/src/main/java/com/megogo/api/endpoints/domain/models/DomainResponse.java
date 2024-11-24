package com.megogo.api.endpoints.domain.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DomainResponse {

    @JsonProperty("query")
    private String query;

    @JsonProperty("status")
    private String status;

    @JsonProperty("country")
    private String country;

    @JsonProperty("countryCode")
    private String countryCode;

    @JsonProperty("region")
    private String region;

    @JsonProperty("regionName")
    private String regionName;

    @JsonProperty("city")
    private String city;

    @JsonProperty("zip")
    private String zip;

    @JsonProperty("lat")
    private String lat;

    @JsonProperty("lon")
    private String lon;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("isp")
    private String isp;

    @JsonProperty("org")
    private String org;

    @JsonProperty("as")
    private String as;
}
