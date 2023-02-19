package com.gym.managementsystem.repository;

import com.gym.managementsystem.model.MemberAttend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MemberAttendRepository extends JpaRepository<MemberAttend, Integer>, JpaSpecificationExecutor<MemberAttend> {
}
