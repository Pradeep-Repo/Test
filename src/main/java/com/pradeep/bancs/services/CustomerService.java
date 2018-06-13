package com.pradeep.bancs.services;

import com.pradeep.bancs.entity.Customer;

public interface CustomerService {
public int create(Customer cs);
public Customer get(int id);
}
