package org.XML;

import org.springframework.context.ApplicationContext;
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

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
           Person obj = (Person)context.getBean("Person");
           obj.getID();
           obj.getName();
           obj.getPhone();
           obj.getAddress();
    }
}
