package fr.scholanova.group.java;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.scholanova.group.java.entities.User;
import fr.scholanova.group.java.services.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App 
{
	public static void main( String[] args )
	{

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");

		UserService userService = (UserService)ctx.getBean("userService");
		
		log.debug("userService", userService);

		User user = (User)ctx.getBean("user");
		user.setFirstName("John");
		user.setLastName("DOE");
		userService.save(user);

		Collection<User> users = userService.getByFirstName("John");
		
		System.out.println(users);

//		GenericConversionService cs = new DefaultConversionService();
//
//		try {
//			Boolean b = cs.convert("yes", Boolean.class);
//			System.out.println(b);
//			
//			Character c = cs.convert(12, Character.class);
//			
//			cs.addConverter(new StringToUserConverter());
//			
//			User user4 = cs.convert(user3.toString(), User.class);
//			
//			System.out.println(user4);
//		} catch (ConversionException e) {
//			System.out.println(e);
//		}
	}
}
