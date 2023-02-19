package com.gym.managementsystem.controller;

import com.gym.managementsystem.model.Admin;
import com.gym.managementsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class AdminController {

    private static Logger log = Logger.getLogger(AdminController.class.getName());


    @Autowired
    private AdminService service;

    @RequestMapping(value = "/admins", method = RequestMethod.GET)
    public List<Admin> list() {
        log.info("Admins Available, No of Records: " + service.listAll().size());
        return service.listAll();
    }

    @RequestMapping(value = "/admins/{adminId}", method = RequestMethod.GET)
    public ResponseEntity<Admin> get(@PathVariable Integer adminId) {
        try {
            log.info("Admin id: " + adminId);
            Admin product = service.get(adminId);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            log.log(Level.WARNING, "No Admin Available. With Admin id: " + adminId);
            return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/admins/add", method = RequestMethod.POST)
    public void add(@RequestBody Admin admin) {
        log.info("New Admin Added");
        service.save(admin);
    }

    @RequestMapping(value = "/admins/{adminId}", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody Admin admin, @PathVariable Integer adminId) {
        try {
            service.save(admin);
            log.info("Admin Updated with id: " + adminId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            log.log(Level.WARNING, "Admin Update Failed");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/admins/{adminId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer adminId) {
        log.info("Admin Deleted with id: " + adminId);
        service.delete(adminId);
    }

}
