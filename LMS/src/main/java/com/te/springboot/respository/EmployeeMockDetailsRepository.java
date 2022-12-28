package com.te.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.springboot.entity.EmployeeMockDetails;

public interface EmployeeMockDetailsRepository extends JpaRepository<EmployeeMockDetails, Integer>{

}
