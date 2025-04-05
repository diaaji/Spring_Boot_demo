package com.ji.demo_spring_boot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "contacts")

public class Contact {

    @Id
    private int id;

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    private String email;

    @Column (name = "phone_number")
    private String phone;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User username;

    @OneToMany (mappedBy = "id", cascade = CascadeType.ALL)
    private List<Address> addresses;
}
