package com.sample.configs;

import com.generic.core.base.config.BaseInitializerConfig;
import com.generic.logger.aspect.LoggerAspect;
import com.generic.logger.client.LoggerApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * The type Spi config.
 */
@Configuration
@Import({BaseInitializerConfig.class, LoggerAspect.class})
public class SampleConfig {
    @Value("${logger.serviceUri}")
    private String serviceUri;

    @Value("${constants.logging.uri}")
    private String loggingUri;


    /**
     * Init.
     */
//    @PostConstruct
    public void init() {
        LoggerApiClient.setLoggerUri(loggingUri);
        LoggerApiClient.setServiceUri(serviceUri);
    }

}
