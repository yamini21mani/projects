package com.te.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.entity.TechnicalSkillsEntity;
@Repository
public interface TechnicalRepository extends JpaRepository<TechnicalSkillsEntity, Integer>{

}
