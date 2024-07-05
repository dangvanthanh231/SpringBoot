package com.example.Customer.service;


import com.example.Customer.dto.AdminDto;
import com.example.Customer.model.Admin;

public interface AdminService {
    Admin save(AdminDto adminDto);

    Admin findByUsername(String username);
}
