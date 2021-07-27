package com.example.API;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigClass extends Configuration {

    public String DefaultValue;

    @JsonProperty
    public String getValue() {
        return DefaultValue;
    }

    @JsonProperty
    public void setValue(String value1) {
        this.DefaultValue = value1;
    }
}
