package com.gym.managementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "gym_mem")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mem_id", nullable = false)
    @JsonSerialize
    private Integer memberId;

    @Column(name = "firstname")
    @JsonProperty("firstName")
    private String firstName;

    @Column(name = "lastname")
    @JsonProperty("lastName")
    private String lastName;

    @Column(name = "gender")
    @JsonProperty("gender")
    private String gender;

    @Column(name = "email")
    @JsonProperty("email")
    private String email;

    @Column(name = "phone")
    @JsonProperty("phone")
    private String phone;

    @Column(name = "address")
    @JsonProperty("address")
    private String address;

    @Column(name = "workouts")
    @JsonProperty("workouts")
    private String workouts;

    @Column(name = "status")
    @JsonProperty("status")
    private String status;

}
