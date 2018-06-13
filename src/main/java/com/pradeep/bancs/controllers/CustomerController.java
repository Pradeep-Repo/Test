package com.pradeep.bancs.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.bancs.dao.CustomerDaoImpl;
import com.pradeep.bancs.entity.Customer;
import com.pradeep.bancs.services.CustomerService;
@RestController
public class CustomerController {
@Autowired
@Qualifier("customer_service")
private CustomerService customerservice;
private static final Logger logger = LoggerFactory
.getLogger(CustomerController.class);
@RequestMapping(value="/customer/create" , method = RequestMethod.POST)
public ResponseEntity<?> create(@RequestBody Customer cs)
{
	logger.info("Enetred Controller");
	int i = this.customerservice.create(cs);
	return new ResponseEntity<Integer>(i,
			HttpStatus.OK);
	
}

@RequestMapping(value="/customer/get/{id}" , method = RequestMethod.GET)
public ResponseEntity<?> get(@PathVariable("id") int id)
{
	logger.info("Enetred Controller");
	Customer cl = this.customerservice.get(id);
	return new ResponseEntity<Customer>(cl,
			HttpStatus.OK);
	
}
}
