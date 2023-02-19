package com.gym.managementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gym_admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminid", nullable = false)
    @JsonProperty("adminId")
    @JsonSerialize
    private int adminId;

    @Column(name = "empid")
    @JsonProperty("empId")
    private int empId;

    @Column(name = "firstname")
    @JsonProperty("firstName")
    private String firstName;

    @Column(name = "lastname")
    @JsonProperty("lastName")
    private String lastName;

    @Column(name = "phonenumber")
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @Column(name = "emailid")
    @JsonProperty("emailId")
    private String emailId;

    @Column(name = "password")
    @JsonProperty("password")
    private String password;

}
