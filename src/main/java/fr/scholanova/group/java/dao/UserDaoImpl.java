package fr.scholanova.group.java.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserDaoImpl implements UserDao {
	@PersistenceContext
    private EntityManager entityManager;

}
