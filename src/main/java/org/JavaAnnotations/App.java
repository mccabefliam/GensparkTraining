package org.JavaAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // BeanFactory
        // ApplicationContext

        ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
           Person obj = (Student)context.getBean(Student.class);
           obj.getID();
           obj.getName();
           obj.getPhone();
           obj.getAddress();
    }
}
