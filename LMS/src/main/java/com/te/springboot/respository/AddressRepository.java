package com.te.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.entity.AddressInfo;
@Repository
public interface AddressRepository extends JpaRepository<AddressInfo, Integer>{

}
