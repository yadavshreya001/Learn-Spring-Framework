package com.spring.core.assignment.AnnotationBasedConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDataSource implements DataSource {
    @Override
    public String[] getEmail() {
        String[] emails = {"mohan90@gmil.com", "sundar0923@icloud.com"};
        return emails;
    }
}


