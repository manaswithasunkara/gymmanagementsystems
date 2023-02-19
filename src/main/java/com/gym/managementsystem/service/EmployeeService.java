package com.gym.managementsystem.service;

import java.util.List;
import javax.transaction.Transactional;

import com.gym.managementsystem.model.Employee;
import com.gym.managementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee get(Integer empId){
        return this.employeeRepository.getReferenceById(empId);
    }

    public void delete(Integer empId){
        employeeRepository.deleteById(empId);
    }
}

