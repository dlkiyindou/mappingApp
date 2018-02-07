package fr.scholanova.group.java.tools.aspects;

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
	public void printTime() {
		System.out.println("User.setFirstName aspecté");
	}
}
