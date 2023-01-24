package com.mohsen.dockerdockecompose;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author Omid Aghaei
 * Date: 2020.0516
 * Time: 7:52 PM
 */
@Configuration
@PropertySources({
    @PropertySource("classpath:application-${spring.profiles.active}.properties"),
    @PropertySource("classpath:application-job.properties")
})
@ConfigurationProperties("loan.batch")
public class BatchPropertyHolder {

}
