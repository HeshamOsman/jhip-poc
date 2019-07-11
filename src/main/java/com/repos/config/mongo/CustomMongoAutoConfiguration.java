package com.repos.config.mongo;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mongodb.MongoClientOptions;
//@ConditionalOnProperty(name="uua.mongo.enabled", havingValue="true")
//@Profile("mongo")
@Lazy
@Configuration
public class CustomMongoAutoConfiguration extends MongoAutoConfiguration {

    public CustomMongoAutoConfiguration(
        MongoProperties properties,
        ObjectProvider<MongoClientOptions> options,
        Environment environment) {
        super(properties,options,environment);
    }
}