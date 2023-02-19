package com.gym.managementsystem.controller;

import com.gym.managementsystem.model.EmployeeAttend;
import com.gym.managementsystem.service.EmployeeAttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class EmployeeAttendController {

    private static Logger log = Logger.getLogger(EmployeeAttendController.class.getName());


    @Autowired
    private EmployeeAttendService service;

    @RequestMapping(value = "/employees/attend", method = RequestMethod.GET)
    public List<EmployeeAttend> list() {
        log.info("Employees Available, No of Records: " + service.listAll().size());
        return service.listAll();
    }

    @RequestMapping(value = "/employees/attend/{attentdId}", method = RequestMethod.GET)
    public ResponseEntity<EmployeeAttend> get(@PathVariable Integer attendId) {
        try {
            log.info("Employees id: " + attendId);
            EmployeeAttend person1 = service.get(attendId);
            return new ResponseEntity<>(person1, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            log.log(Level.WARNING, "No Admin Available. With Member id: " + attendId);
            return new ResponseEntity<EmployeeAttend>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/employees/attend/add", method = RequestMethod.POST)
    public void add(@RequestBody EmployeeAttend employeeattend) {
        log.info("New employee status");
        service.save(employeeattend);
    }

    @RequestMapping(value = "/employees/attend/{attentdId}", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody EmployeeAttend employeeattend, @PathVariable Integer attendId) {
        try {
            service.save(employeeattend);
            log.info("employee Updated with id: " + attendId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            log.log(Level.WARNING, "employee Update Failed");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/employees/attend/{attentdId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer attendId) {
        log.info("employee Deleted with id: " + attendId);
        service.delete(attendId);
    }

}

