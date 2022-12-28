package com.te.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.entity.PrimaryInfo;
@Repository
public interface EmployeeRespository extends JpaRepository<PrimaryInfo, String> {

}
