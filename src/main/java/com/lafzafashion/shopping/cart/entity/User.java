package com.lafzafashion.shopping.cart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class User {
    @Id
    private String userId="";
    private String password="";
//    private String firstName;
//    private String lastName;
//    private LocalDate dateOfBirth;
}
