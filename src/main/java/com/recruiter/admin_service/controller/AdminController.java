package com.recruiter.admin_service.controller;

import com.recruiter.admin_service.dto.JobDTO;
import com.recruiter.admin_service.dto.UserDTO;
import com.recruiter.admin_service.feign.AuthClient;
import com.recruiter.admin_service.feign.JobClient;
import com.recruiter.admin_service.model.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    private final AuthClient authClient;
    private final JobClient jobClient;

    public AdminController(AuthClient authClient, JobClient jobClient) {
        this.authClient = authClient;
        this.jobClient = jobClient;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> getAllUsers(@RequestParam Role role) {
        ResponseEntity<List<UserDTO>> response = authClient.getAllUsers(role);
        return response;
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<JobDTO>> getAllJobs() {
        ResponseEntity<List<JobDTO>> response = jobClient.getAllJobs();
        return response;
    }

    @PutMapping("/activate/{id}")
    public ResponseEntity<String> activateUserStatus(@PathVariable Integer id) {
        authClient.activateUser(id);
        return ResponseEntity.ok("User status Changed");
    }

}
