package com.gym.managementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "gym_admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id", nullable = false)
    @JsonSerialize
    private Integer adminId;

    @Column(name = "admin_name")
    @JsonProperty("adminName")
    private String adminName;

    @Column(name = "phone_number")
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @Column(name = "email_id")
    @JsonProperty("emailId")
    private String emailId;

    @Column(name = "password")
    @JsonProperty("password")
    private String password;

}
