package com.example.Admin.service;


import com.example.Admin.dto.AdminDto;
import com.example.Admin.model.Admin;

import java.util.Optional;

public interface AdminService {
    Admin save(AdminDto adminDto);

    Admin findByUsername(String username);
}
