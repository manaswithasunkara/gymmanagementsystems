package com.gym.managementsystem.repository;

import com.gym.managementsystem.model.EmployeeAttend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeAttendRepository extends JpaRepository<EmployeeAttend, Integer>, JpaSpecificationExecutor<EmployeeAttend> {
}
