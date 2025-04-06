package com.ji.demo_spring_boot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")


public class User {
    @Id
    private String username;

    private String password;
    private String email;

    private String token;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    @Column(name = "expire_at", nullable = false)
    private LocalDateTime expireAt;

    @OneToMany (mappedBy = "username", cascade = CascadeType.ALL)
    private List<Contact> contacts;
}
