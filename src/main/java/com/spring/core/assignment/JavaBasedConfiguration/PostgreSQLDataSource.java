package com.spring.core.assignment.JavaBasedConfiguration;

public class PostgreSQLDataSource implements DataSource {
    @Override
    public String[] getEmail() {
        String[] emails = {"mohan90@gmil.com", "sundar0923@icloud.com"};
        return emails;
    }
}


