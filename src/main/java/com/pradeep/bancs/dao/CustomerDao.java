package com.pradeep.bancs.dao;

import com.pradeep.bancs.entity.Customer;

public interface CustomerDao {
public int create(Customer cs);
public Customer get(int id);
}
