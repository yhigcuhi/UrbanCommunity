package com.example.springboot.gradle.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot.gradle.customerRepository.Customer;
import com.example.springboot.gradle.customerRepository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository repository;

	@RequestMapping("/search/{id}")
	public String search(@PathVariable long id){
		String customer = "";
		customer = repository.findById(id).getFirstName();
		return customer;
	}
	
	@GetMapping("/findall")
	public List<Customer> findAll(){

		List<Customer> customers = repository.findAll();

		return customers;
	}

}