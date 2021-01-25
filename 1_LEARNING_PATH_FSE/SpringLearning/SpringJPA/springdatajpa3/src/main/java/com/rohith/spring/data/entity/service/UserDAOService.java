package com.rohith.spring.data.entity.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.rohith.spring.data.entity.User;

@Repository
@Transactional // each method will be involved in a transaction
public class UserDAOService {
	@PersistenceContext
	private EntityManager entityManager;

	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
