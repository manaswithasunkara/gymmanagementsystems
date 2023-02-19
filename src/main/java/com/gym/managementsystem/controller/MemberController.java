package com.gym.managementsystem.controller;

import com.gym.managementsystem.model.Member;
import com.gym.managementsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class MemberController {

    private static Logger log = Logger.getLogger(MemberController.class.getName());


    @Autowired
    private MemberService service;

    @RequestMapping(value = "/members", method = RequestMethod.GET)
    public List<Member> list() {
        log.info("Admins Available, No of Records: " + service.listAll().size());
        return service.listAll();
    }

    @RequestMapping(value = "/members/{memberId}", method = RequestMethod.GET)
    public ResponseEntity<Member> get(@PathVariable Integer memberId) {
        try {
            log.info("Member id: " + memberId);
            Member person = service.get(memberId);
            return new ResponseEntity<>(person, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            log.log(Level.WARNING, "No Admin Available. With Member id: " + memberId);
            return new ResponseEntity<Member>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/members/add", method = RequestMethod.POST)
    public void add(@RequestBody Member member) {
        log.info("New Member Added");
        service.save(member);
    }

    @RequestMapping(value = "/members/{memberId}", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody Member member, @PathVariable Integer memberId) {
        try {
            service.save(member);
            log.info("Admin Updated with id: " + memberId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            log.log(Level.WARNING, "Admin Update Failed");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/members/{memberId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer memberId) {
        log.info("member Deleted with id: " + memberId);
        service.delete(memberId);
    }

}
