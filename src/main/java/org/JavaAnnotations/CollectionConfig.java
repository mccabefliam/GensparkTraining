package org.JavaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
@Configuration
public class CollectionConfig {

    @Bean
    public Student getStudent(){
        return new Student(12, "Liam McCabe", getPhone(), getAddress());
    }

    @Bean
    public ArrayList<Phone> getPhone(){
        return new ArrayList<Phone>(Arrays.asList(number(), number2(), number3()));
    }
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
    public String number4() {
        return ("444-555-9999");
    }

    @Bean
    public Address getAddress(){
        return new Address("Atlanta", "Georgia", "USA", "30305");
    }

}
