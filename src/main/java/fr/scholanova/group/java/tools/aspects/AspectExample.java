package fr.scholanova.group.java.tools.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectExample {
	@Pointcut("execution(* read*(.))")
	public void aspectjLoadTimeWeavingExample(){
		// TODO : code
	}
	
	@Before("execution(* fr.scholanova.group.java.entities.User.setFirstName(..))")
	public void printBefore() {
		// Do something
	}
	
	@After("execution(* fr.scholanova.group.java.entities.User.setFirstName(..))")
	public void printAfter() {
		// Do something
	}
	
	@After("execution(* fr.scholanova.group.java.entities.User.setLastName(..))")
	public void printAfter2() {
		// Do something
	}
}
