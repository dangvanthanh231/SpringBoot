package com.example.Customer.service;


import com.example.Customer.dto.CustomerDto;
import com.example.Customer.model.Customer;

public interface CustomerService {
    Customer save(CustomerDto customerDto);

    Customer findByUsername(String username);

    Customer update(CustomerDto customerDto);

    Customer changePass(CustomerDto customerDto);

    CustomerDto getCustomer(String username);
}
