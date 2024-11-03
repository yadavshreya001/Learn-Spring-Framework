package com.spring.core.assignment.AnnotationBasedConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    private DataSource dataSource;

    @Autowired
    public EmailService( DataSource dataSource){
        this.dataSource = dataSource;
    }

    void sendEmail(){
       String[] emails =  dataSource.getEmail();
       for(String email: emails){
           System.out.println(email);
       }
    }
}


