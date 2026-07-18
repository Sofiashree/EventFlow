package com.event.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.event.eventmanagement.entity.Admin;
import com.event.eventmanagement.service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Admin Login
    @PostMapping("/login")
    public Admin login(@RequestBody Admin admin) {
        return adminService.loginAdmin(
                admin.getUsername(),
                admin.getPassword()
        );
    }
}
