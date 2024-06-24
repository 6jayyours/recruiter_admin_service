package com.recruiter.admin_service.feign;

import com.recruiter.admin_service.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "AUTH-SERVICE")
public interface AuthClinet {
    @GetMapping("/api/v1/user/users")
    public ResponseEntity<List<UserDTO>> getAllUsers();
}
