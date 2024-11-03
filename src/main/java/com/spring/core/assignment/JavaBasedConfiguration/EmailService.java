package com.spring.core.assignment.JavaBasedConfiguration;

public class EmailService {
    private DataSource dataSource;

    public EmailService(DataSource dataSource){
        this.dataSource = dataSource;
    }
    void sendEmail(){
       String[] emails =  dataSource.getEmail();
       for(String email: emails){
           System.out.println(email);
       }
    }
}

