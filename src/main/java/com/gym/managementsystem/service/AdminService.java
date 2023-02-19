package com.gym.managementsystem.service;

import java.util.List;
import javax.transaction.Transactional;

import com.gym.managementsystem.model.Admin;
import com.gym.managementsystem.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
@Transactional
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> listAll() {
        return adminRepository.findAll();
    }

    public void save(Admin admin){
        adminRepository.save(admin);
    }

    public Admin get(Integer adminId){
        return this.adminRepository.getReferenceById(adminId);
    }

    public void delete(Integer adminId){
        adminRepository.deleteById(adminId);
    }
}

