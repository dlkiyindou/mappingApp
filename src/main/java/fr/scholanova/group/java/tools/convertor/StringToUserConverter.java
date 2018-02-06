package fr.scholanova.group.java.tools.convertor;

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
		Integer _id = null; //cs.convert(id, Integer.class);
		String _first = cs.convert(firstName, String.class);
		String _last = cs.convert(lastName, String.class);
		
		return new User(_id, _first, _last);
	}

}
