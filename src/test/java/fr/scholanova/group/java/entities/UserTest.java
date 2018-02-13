package fr.scholanova.group.java.entities;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.*;

public class UserTest {
	@Test
	public void testId() {
		User user = new User();
		ReflectionTestUtils.setField(user, "id", new Integer(10));
		assertEquals(new Integer(10), user.getId());
	}
}
