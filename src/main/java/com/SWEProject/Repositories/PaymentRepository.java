package com.SWEProject.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.SWEProject.Entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer>{

}