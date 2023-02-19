package com.gym.managementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "gym_mem")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memid", nullable = false)
    @JsonProperty("memId")
    @JsonSerialize
    private Integer memId;

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

    @Column(name = "emailid")
    @JsonProperty("emailId")
    private String emailId;

    @Column(name = "phone")
    @JsonProperty("phone")
    private String phone;

    @Column(name = "workouts")
    @JsonProperty("workouts")
    private String workouts;

    @Column(name = "status")
    @JsonProperty("status")
    private String status;

}
