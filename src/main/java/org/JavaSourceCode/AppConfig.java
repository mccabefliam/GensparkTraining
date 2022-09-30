package org.JavaSourceCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.JavaSourceCode")
public class AppConfig {

//    @Bean
//    public Student getStudent(){
//        return new Student(12, "Liam McCabe", getPhone(), getAddress());
//    }


    @Bean
    public Phone number(){
        return new Phone("111-555-9999");
    }
    @Bean
    public Phone number2(){
        return new Phone("222-555-9999");
    }
    @Bean
    public Phone number3(){
        return new Phone("333-555-9999");
    }

    @Bean
    public Address getAddress(){
        return new Address("Atlanta", "Georgia", "USA", "30305");
    }
    @Bean
    @Autowired
    public Student getStudent(List<Phone> ph, Address add){
        return new Student(12,  "Liam McCabe", ph, add);
    }
}
