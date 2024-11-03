package com.spring.core.assignment.AnnotationBasedConfiguration;
import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource {
    @Override
    public String[] getEmail() {
        String[] emails = {"shreya12@gmail.com", "ram23@gmail.com", "shyam231@icloud.com"};
        return emails;
    }
}


