package fr.scholanova.group.java;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.scholanova.group.java.entities.User;
import fr.scholanova.group.java.enums.GenderEnum;
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

		Calendar cal = Calendar.getInstance();
		
		cal.set(1960, 11, 15);
		User father = new User();
		father.setFirstName("William");
		father.setLastName("DOE");
		father.setGender(GenderEnum.MALE);
		father.setBirthDay(cal.getTime());
		userService.save(father);
		
		cal.set(1966, 1, 30);
		User mother = new User();
		mother.setFirstName("Kate");
		mother.setLastName("DOE");
		mother.setGender(GenderEnum.FEMALE);
		mother.setBirthDay(cal.getTime());
		userService.save(mother);
		
		cal.set(1990, 8, 15);
		User user = new User();
		user.setFirstName("John");
		user.setLastName("DOE");
		user.setGender(GenderEnum.MALE);
		user.setBirthDay(cal.getTime());
		user.setMother(mother);
		user.setFather(father);
		
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
