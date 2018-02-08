package fr.scholanova.group.java;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.scholanova.group.java.entities.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App 
{
	public static void main( String[] args )
	{
		User user = new User();
		user.setFirstName("Javier");
		user.setLastName("Pastore");

		log.debug("Print User", user);

		log.warn(System.getProperty("java.class.path"));

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");

		System.out.println(ctx.getApplicationName());
		User user3 = (User)ctx.getBean(User.class);
		user3.setFirstName("Diego");
		user3.setLastName("Simeone");
		System.out.println(user3);
		
//		AspectExample ap = (AspectExample)ctx.getBean("aspectJExemple");


		DataSource datasource = (DataSource)ctx.getBean("dataSource");
		System.out.println(datasource);


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
