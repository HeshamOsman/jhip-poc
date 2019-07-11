package com.repos.config.mongo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

//@Profile("mongo")
//@ConditionalOnProperty(name="uua.mongo.enabled", havingValue="true")
@Configuration
@Lazy
@EnableConfigurationProperties(MongoProperties.class)
public class CustomMongoDataAutoConfiguration extends MongoDataAutoConfiguration {

    public CustomMongoDataAutoConfiguration(
        ApplicationContext applicationContext,
        MongoProperties properties) {
        super(properties);
    }

}