package com.gym.managementsystem.service;

import java.util.List;
import javax.transaction.Transactional;

import com.gym.managementsystem.model.EmployeeAttend;
import com.gym.managementsystem.repository.EmployeeAttendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
@Transactional
public class EmployeeAttendService {

    @Autowired
    private EmployeeAttendRepository employeeattendRepository;

    public List<EmployeeAttend> listAll() {
        return employeeattendRepository.findAll();
    }

    public void save(EmployeeAttend employee){
        employeeattendRepository.save(employee);
    }

    public EmployeeAttend get(Integer empId){
        return this.employeeattendRepository.getReferenceById(empId);
    }

    public void delete(Integer empId){
        employeeattendRepository.deleteById(empId);
    }
}