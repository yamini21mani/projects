package com.te.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.entity.EmployeeEntity;

@Repository
public interface EmsRepository extends JpaRepository<EmployeeEntity, String>{

}
