package com.spring.core.StereotypeAnnotation;
import com.spring.core.StereotypeAnnotation.controller.DemoController;
import com.spring.core.StereotypeAnnotation.repository.DemoRepository;
import com.spring.core.StereotypeAnnotation.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        DemoController demoController = applicationContext.getBean(DemoController.class);
        System.out.println(demoController.hello());

        DemoService demoService = applicationContext.getBean(DemoService.class);
        System.out.println(demoService.hello());

        DemoRepository demoRepository = applicationContext.getBean(DemoRepository.class);
        System.out.println(demoRepository.hello());

    }
}


