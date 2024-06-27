package com.recruiter.admin_service.feign;

import com.recruiter.admin_service.dto.JobDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "JOBS-SERVICE")
public interface JobClient {
    @GetMapping("/api/v1/jobs/getAllJobs")
    ResponseEntity<List<JobDTO>> getAllJobs();
}
