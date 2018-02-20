package fr.scholanova.group.java.services;

import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.scholanova.group.java.entities.User;

@Transactional
@Service
public interface UserService {
	/**
	 * 
	 * @param user
	 */
	public void save(User user);

	/**
	 * 
	 * @param firstName
	 * @return
	 */
	public Collection<User> getByFirstName(String firstName);
}
