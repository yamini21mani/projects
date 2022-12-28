package com.te.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.entity.EmployeeBatchDetails;
@Repository
public interface EmployeeBatchDetailsRepository extends JpaRepository<EmployeeBatchDetails, String> {

}
