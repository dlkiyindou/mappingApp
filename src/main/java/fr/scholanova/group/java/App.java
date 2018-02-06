package fr.scholanova.group.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.scholanova.group.java.entities.User;

public class App 
{
    public static void main( String[] args )
    {
        User user = new User();
        user.setFirstName("Javier");
        user.setLastName("Pastore");
        
        System.out.println(user);
        
        System.out.println(System.getProperty("java.class.path"));
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
        
        System.out.println(ctx.getApplicationName());
        User user3 = (User)ctx.getBean(User.class);
        user3.setFirstName("Diego");
        user3.setLastName("Simeone");
        
        System.out.println(user3);
    }
}
