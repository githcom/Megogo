package com.megogo.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "classpath:config.properties"
})
public interface TestConfig extends Config {

    @Key("hostUrl")
    String hostUrl();

}
