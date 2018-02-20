package fr.scholanova.group.java.services;

import org.springframework.beans.factory.annotation.Autowired;

import fr.scholanova.group.java.dao.UserDao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
}
