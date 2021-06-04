package com.todolist.todolist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfiguration extends AbstractCouchbaseConfiguration {
    @Override
    public String getConnectionString() {
        return "couchbase://127.0.0.1";
    }

    @Override
    public String getUserName() {
        return "todousr";
    }

    @Override
    public String getPassword() {
        return "199137";
    }

    @Override
    public String getBucketName() {
        return "todo";
    }
}
