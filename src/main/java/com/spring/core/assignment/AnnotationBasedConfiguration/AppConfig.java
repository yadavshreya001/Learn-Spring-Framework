package com.spring.core.assignment.AnnotationBasedConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.spring.core.assignment.AnnotationBasedConfiguration")
public class AppConfig {
}



