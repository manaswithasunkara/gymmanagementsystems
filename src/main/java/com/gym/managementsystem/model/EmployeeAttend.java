package com.gym.managementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name = "gym_emp_attend")
public class EmployeeAttend {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendid", nullable = false)
    @JsonProperty("attendId")
    @JsonSerialize
    private int attendId;

    @Column(name = "empid")
    @JsonProperty("empId")
    private int empId;

    @Column(name = "ispresent")
    @JsonProperty("isPresent")
    private Boolean isPresent;


    @Column(name = "date")
    @JsonProperty("date")
    private String date;

}
