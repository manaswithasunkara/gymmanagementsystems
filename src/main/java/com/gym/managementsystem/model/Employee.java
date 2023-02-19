package com.gym.managementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "gym_emp")
public class Employee {

//    @OneToMany(
//            mappedBy = "post",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private EmployeeAttend employeeAttend;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id", nullable = false)
    @JsonSerialize
    private Integer empId;

    @Column(name = "first_name")
    @JsonProperty("firstName")
    private String firstName;

    @Column(name = "last_name")
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

    @Column(name = "mobile")
    @JsonProperty("mobile")
    private String mobile;

    @Column(name = "ssn")
    @JsonProperty("ssn")
    private String ssn;

    @Column(name = "designation")
    @JsonProperty("designation")
    private String designation;

    @Column(name = "join_date")
    @JsonProperty("joinDate")
    private String joinDate;

}
