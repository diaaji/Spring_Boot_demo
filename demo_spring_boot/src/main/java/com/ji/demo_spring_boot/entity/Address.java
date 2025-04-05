package com.ji.demo_spring_boot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")

public class Address {
    @Id
    private int id;

    @Column (name = "adress_line1")
    private String addressLine1;

    @Column (name = "adress_line2")
    private String addressLine2;

    private String city;
    private String country;
    private String PostalCode;

    @ManyToOne
    @JoinColumn(name = "contactId", referencedColumnName = "id")
    private Contact contactId;
}
