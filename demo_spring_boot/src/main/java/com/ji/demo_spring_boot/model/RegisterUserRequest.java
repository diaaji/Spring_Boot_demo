package com.ji.demo_spring_boot.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class RegisterUserRequest {
    @NotBlank
    @Size (max = 100)
    private String username;

    @NotBlank
    @Size(min = 8, max = 100)
    private String password;


    @Email
    @NotBlank
    @Size (max = 100)
    private String email;

    @NotBlank
    @Size (max = 100)
    private String firstName;   // ✅ Tambah ini
    private String lastName;


    // Add any other fields you need for registration
}
