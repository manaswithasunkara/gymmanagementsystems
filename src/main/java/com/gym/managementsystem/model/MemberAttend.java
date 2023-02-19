package com.gym.managementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gym_mem_attend")
public class MemberAttend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendid", nullable = false)
    @JsonProperty("attendId")
    @JsonSerialize
    private int attendId;

    @Column(name = "memid", nullable = false)
    @JsonProperty("memId")
    private int memId;

    @Column(name = "ispresent")
    @JsonProperty("isPresent")
    private Boolean isPresent;


    @Column(name = "date")
    @JsonProperty("date")
    private String date;

}
