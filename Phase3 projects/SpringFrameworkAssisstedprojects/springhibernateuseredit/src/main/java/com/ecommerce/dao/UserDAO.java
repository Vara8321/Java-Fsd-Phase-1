package com.ecommerce.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.entity.UserEntity;

@Repository
@Transactional
public class UserDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
		public List<UserEntity> getAllUsers() {
		
		Query query = this.sessionFactory.getCurrentSession().createQuery("from UserEntity");
		
		return query.list();
	}
}
