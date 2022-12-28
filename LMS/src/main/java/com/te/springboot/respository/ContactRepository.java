package com.te.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.entity.ContactInfo;
@Repository
public interface ContactRepository extends JpaRepository<ContactInfo, Long>{

}
