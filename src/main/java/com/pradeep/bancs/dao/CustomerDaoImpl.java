package com.pradeep.bancs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.pradeep.bancs.entity.Customer;

@Repository("customer_dao")
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	private static final Logger logger = LoggerFactory
			.getLogger(CustomerDaoImpl.class);

	@Override
	public int create(Customer cs) {
		// TODO Auto-generated method stub
		logger.info("enetred Dao");
		Session session = this.sessionFactory.getCurrentSession();
		logger.info("session",session);
		Customer cm = new Customer();
		//cm.setCif_no(1);
		cm.setGaurdian_cif(12345);
		cm.setMinor(true);
		cm.setMother_name("suman");
		session.persist(cm);
		logger.info("exit Dao");
		return (1);
		// return null;
	}
	
	@Override
	public Customer get(int id)
	{
		logger.info("enetred Dao");
		Session session = this.sessionFactory.getCurrentSession();
		Customer u = (Customer) session.load(Customer.class, new Integer(id)); // Select * operation with where clause
		//u.setPassword("*"); //hiding password dont do this will update the db 
		logger.info("User loaded successfully, User details="+u);
		return u;
	}

}
