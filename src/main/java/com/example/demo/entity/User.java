package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "register_date")
    private LocalDateTime registerDate;

    @Column(name = "last_login_date")
    private LocalDateTime lastLoginDate;

    // Getters and Setters
}