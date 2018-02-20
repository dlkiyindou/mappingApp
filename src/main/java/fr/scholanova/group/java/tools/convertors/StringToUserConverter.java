package fr.scholanova.group.java.tools.convertors;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.convert.support.GenericConversionService;

import fr.scholanova.group.java.entities.User;

public class StringToUserConverter implements Converter<String, User>{

	public User convert(String arg0) {
		// TODO Auto-generated method stub
		// User(id=null, firstName=Diego, lastName=Simeone)
		String id = "null", firstName = "Diego", lastName="Simeone";
		
		GenericConversionService cs = new DefaultConversionService();
		String _first = cs.convert(firstName, String.class);
		String _last = cs.convert(lastName, String.class);
		
		User user = new User();
		user.setFirstName(_first);
		user.setLastName(_last);
		
		return user;
	}

}
