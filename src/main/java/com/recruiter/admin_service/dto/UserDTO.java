package com.recruiter.admin_service.dto;

import java.time.LocalDateTime;

public class UserDTO {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private boolean status;
    private boolean subscription;
    private String idImageUrl;
    private LocalDateTime registrationDate;
}