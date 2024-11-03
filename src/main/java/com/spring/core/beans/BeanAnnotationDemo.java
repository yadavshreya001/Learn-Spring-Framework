package com.spring.core.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student{
    private Address address;

    public  Student(Address address){
        this.address = address;
    }
    public void print(){
        System.out.println("Student class method is called...");
        address.print();
    }
}



class Address{
    public void print(){
        System.out.println("Address class method is called...");
    }
}

@Configuration
class AppConfig{

    @Bean
    public Address address(){
        return new Address();
    }
    //If we want to change the name of the bean manually and provide multiple bean names
    @Bean(name = {"studentBean" , "studentDemo"})
    public Student student(){
        return new Student(new Address());
    }
}


public class BeanAnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // getting all default bean names
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : beanNames){
            System.out.println(beanName);
        }

        //Retrieve the spring bean from application context by using bean name
        Student student = (Student) applicationContext.getBean("studentBean");
        student.print();

        //Retrieve the spring bean from application context by using class name
//        Student student = applicationContext.getBean(Student.class);
//        student.print();

//        Address address = applicationContext.getBean(Address.class);
//        address.print();
    }
}

