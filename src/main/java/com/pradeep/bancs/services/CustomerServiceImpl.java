package com.pradeep.bancs.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pradeep.bancs.entity.Customer;
import com.pradeep.bancs.dao.CustomerDao;
import com.pradeep.bancs.dao.CustomerDaoImpl;

@Service("customer_service")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	@Qualifier("customer_dao")
	private CustomerDao customerdao;
	private static final Logger logger = LoggerFactory
			.getLogger(CustomerServiceImpl.class);
	@Override
	@Transactional
	public int create(Customer cs) {
		// TODO Auto-generated method stub
		
		logger.info("enetred Service");
		return this.customerdao.create(cs);
		// return null;
	}

	
	@Override
	@Transactional
	public Customer get(int id)
	{
		logger.info("enetred Service");
		return this.customerdao.get(id);
	}
	
	public List<Customer> getAll()
	{
		List<Customer> clist = this.customerdao.getAll();
		return clist;
	}

}
