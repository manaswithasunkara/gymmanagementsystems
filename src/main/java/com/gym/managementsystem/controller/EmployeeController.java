package com.gym.managementsystem.controller;

import com.gym.managementsystem.model.Employee;
import com.gym.managementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class EmployeeController {

    private static Logger log = Logger.getLogger(EmployeeController.class.getName());


    @Autowired
    private EmployeeService service;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> list() {
        log.info("employees Available, No of Records: " + service.listAll().size());
        return service.listAll();
    }

    @RequestMapping(value = "/employees/{empId}", method = RequestMethod.GET)
    public ResponseEntity<Employee> get(@PathVariable Integer empId) {
        try {
            log.info("employee id: " + empId);
            Employee person1 = service.get(empId);
            return new ResponseEntity<>(person1, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            log.log(Level.WARNING, "No Admin Available. With Member id: " + empId);
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/employees/add", method = RequestMethod.POST)
    public void add(@RequestBody Employee employee) {
        log.info("New employee Added");
        service.save(employee);
    }

    @RequestMapping(value = "/employees/{empId}", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody Employee employee, @PathVariable Integer empId) {
        try {
            service.save(employee);
            log.info("employee Updated with id: " + empId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            log.log(Level.WARNING, "employee Update Failed");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/employees/{empId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer empId) {
        log.info("employee Deleted with id: " + empId);
        service.delete(empId);
    }

}
