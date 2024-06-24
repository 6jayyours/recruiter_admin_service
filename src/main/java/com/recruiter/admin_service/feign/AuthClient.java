package com.recruiter.admin_service.feign;

import com.recruiter.admin_service.dto.UserDTO;
import com.recruiter.admin_service.model.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(name = "AUTH-SERVICE")
public interface AuthClient {

    @GetMapping("/api/v1/user/users")
    ResponseEntity<List<UserDTO>> getAllUsers(@RequestParam Role role);



}
