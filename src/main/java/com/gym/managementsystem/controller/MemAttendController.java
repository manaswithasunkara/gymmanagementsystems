//package com.gym.managementsystem.controller;
//
//import com.gym.managementsystem.model.MemberAttend;
//import com.gym.managementsystem.service.MemberAttendService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//@RestController
//public class MemAttendController {
//
//    private static Logger log = Logger.getLogger(MemAttendController.class.getName());
//
//
//    @Autowired
//    private MemberAttendService service;
//
//    @RequestMapping(value = "/memberattends", method = RequestMethod.GET)
//    public List<MemberAttend> list() {
//        log.info("employees Available, No of Records: " + service.listAll().size());
//        return service.listAll();
//    }
//
//    @RequestMapping(value = "/memberattends/{attentdId}", method = RequestMethod.GET)
//    public ResponseEntity<MemberAttend> get(@PathVariable Integer attendId) {
//        try {
//            log.info("employee id: " + attendId);
//            MemberAttend person11 = service.get(attendId);
//            return new ResponseEntity<>(person11, HttpStatus.OK);
//        } catch (NoSuchElementException e) {
//            log.log(Level.WARNING, "No Admin Available. With Member id: " + attendId);
//            return new ResponseEntity<MemberAttend>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @RequestMapping(value = "/employeeattends/add", method = RequestMethod.POST)
//    public void add(@RequestBody MemberAttend employeeattend) {
//        log.info("New employee Added");
//        service.save(employeeattend);
//    }
//
//    @RequestMapping(value = "/employees/{attentdId}", method = RequestMethod.PUT)
//    public ResponseEntity<?> update(@RequestBody MemberAttend memberattend, @PathVariable Integer attendId) {
//        try {
//            service.save(memberattend);
//            log.info("employee Updated with id: " + attendId);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (NoSuchElementException e) {
//            log.log(Level.WARNING, "employee Update Failed");
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @RequestMapping(value = "/memberattends/{attentdId}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable Integer attendId) {
//        log.info("employee Deleted with id: " + attendId);
//        service.delete(attendId);
//    }
//
//}
//
