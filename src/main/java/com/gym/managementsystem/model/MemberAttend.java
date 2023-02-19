//package com.gym.managementsystem.model;
//
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//import lombok.Data;
//
//import javax.persistence.*;
//
//@Entity(name = "gym_mem_attend")
//public class MemberAttend {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "AttentdId", nullable = false)
//    @JsonSerialize
//    private Integer empId;
//
//    @Column(name = "ispresent")
//    @JsonProperty("Present")
//    private String Present;
//
//
//    @Column(name = "date")
//    @JsonProperty("Date")
//    private String Date;
//
//    @Column(name = "gender")
//    @JsonProperty("Gender")
//    private String Gender;
//
//    @Column(name = "phone")
//    @JsonProperty("Phone")
//    private String Phone;
//
//    @Column(name = "empId")
//    @JsonProperty("EmpId")
//    private String EmpId;
//
//    @Column(name = "firstName")
//    @JsonProperty("Firstname")
//    private String Firstname;
//
//    @Column(name = "lastName")
//    @JsonProperty("Lastname")
//    private String Lastname;
//
//}