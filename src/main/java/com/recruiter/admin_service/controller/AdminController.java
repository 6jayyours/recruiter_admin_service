package com.recruiter.admin_service.controller;

import com.recruiter.admin_service.dto.UserDTO;
import com.recruiter.admin_service.feign.AuthClient;
import com.recruiter.admin_service.model.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    private final AuthClient authClient;

    public AdminController(AuthClient authClient) {
        this.authClient = authClient;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> getAllUsers(@RequestParam Role role) {
        ResponseEntity<List<UserDTO>> response = authClient.getAllUsers(role);
        System.out.println(response);
        return response;
    }
}
