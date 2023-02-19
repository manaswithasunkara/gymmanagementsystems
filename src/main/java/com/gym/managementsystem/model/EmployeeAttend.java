package com.gym.managementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;

@Entity(name = "gym_emp_attend")
public class EmployeeAttend {

    @ManyToOne(fetch=FetchType.LAZY)
    private Employee employee;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attend_id", nullable = false)
    @JsonSerialize
    private Integer attendId;

    @Column(name = "is_present")
    @JsonProperty("isPresent")
    private String isPresent;


    @Column(name = "date")
    @JsonProperty("date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "employee_emp_id", referencedColumnName = "emp_id")
    private Employee empId;

    public Employee getEmpId() {
        return empId;
    }

    public void setEmpId(Employee empId) {
        this.empId = empId;
    }
}
