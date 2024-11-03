package com.spring.core.AnnotationBasedConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.spring.core.AnnotationBasedConfiguration")
public class AppConfig {

}
