//package com.gym.managementsystem.service;
//
//import java.util.List;
//import javax.transaction.Transactional;
//
//import com.gym.managementsystem.model.MemberAttend;
//import com.gym.managementsystem.repository.MemberAttendRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.awt.*;
//import java.util.List;
//
//@Service
//@Transactional
//public class MemberAttendService {
//
//    @Autowired
//    private MemberAttendRepository memberattendRepository;
//
//    public List<MemberAttend> listAll() {
//        return memberattendRepository.findAll();
//    }
//
//    public void save(MemberAttend member){
//        memberattendRepository.save(member);
//    }
//
//    public MemberAttend get(Integer empId){
//        return this.memberattendRepository.getReferenceById(empId);
//    }
//
//    public void delete(Integer empId){
//        memberattendRepository.deleteById(empId);
//    }
//}