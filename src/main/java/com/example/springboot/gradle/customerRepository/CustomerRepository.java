package com.example.springboot.gradle.customerRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	List<Customer> findByFirstName(String FirstName);
	List<Customer> findAll();
	Customer findById(long id);
}