package com.example.Admin.service;


import com.example.Admin.dto.CustomerDto;
import com.example.Admin.model.Customer;

public interface CustomerService {
    Customer save(CustomerDto customerDto);

    Customer findByUsername(String username);

    Customer update(CustomerDto customerDto);

    Customer changePass(CustomerDto customerDto);

    CustomerDto getCustomer(String username);
}
