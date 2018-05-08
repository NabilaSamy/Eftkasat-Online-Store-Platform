package com.SWEProject.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.SWEProject.Entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
