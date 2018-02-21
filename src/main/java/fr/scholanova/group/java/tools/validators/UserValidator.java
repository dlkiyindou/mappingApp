package fr.scholanova.group.java.tools.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import fr.scholanova.group.java.entities.User;

public class UserValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		
	}

}
