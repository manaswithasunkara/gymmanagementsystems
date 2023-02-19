package com.gym.managementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.persistence.*;

@Data
@Entity
@Table(name = "gym_emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empid", nullable = false)
    @JsonProperty("empId")
    @JsonSerialize
    private int empId;

    @Column(name = "firstname")
    @JsonProperty("firstName")
    private String firstName;

    @Column(name = "lastname")
    @JsonProperty("lastName")
    private String lastName;


    @Column(name = "address")
    @JsonProperty("address")
    private String address;

    @Column(name = "gender")
    @JsonProperty("gender")
    private String gender;

    @Column(name = "dob")
    @JsonProperty("dob")
    private String dob;

    @Column(name = "phone")
    @JsonProperty("phone")
    private String phone;

    @Column(name = "ssn")
    @JsonProperty("ssn")
    private String ssn;

    @Column(name = "designation")
    @JsonProperty("designation")
    private String designation;

    @Column(name = "joindate")
    @JsonProperty("joinDate")
    private String joinDate;


}
