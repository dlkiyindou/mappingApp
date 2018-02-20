package fr.scholanova.group.java.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.scholanova.group.java.entities.User;
import lombok.Getter;
import lombok.Setter;

@Repository
@Setter
@Getter
public class UserDaoImpl implements UserDao {
	@PersistenceContext
    private EntityManager entityManager;

	/**
	 * {@inheritDoc}
	 */
	public void save(User user) {
		entityManager.persist(user);
	}

	/**
	 * {@inheritDoc}
	 */
	public void delete(User user) {
		entityManager.remove(user);
	}

	/**
	 * {@inheritDoc}
	 */
	public User read(Integer id) {
		return entityManager.find(User.class, id);
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<User> findByFirstName(String first) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
