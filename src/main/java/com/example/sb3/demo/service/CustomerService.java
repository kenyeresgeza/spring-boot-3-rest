package com.example.sb3.demo.service;

import com.example.sb3.demo.model.Customer;
import com.example.sb3.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public void addCustomer(Customer customer) {



        customerRepository.save(customer);
    }
}
