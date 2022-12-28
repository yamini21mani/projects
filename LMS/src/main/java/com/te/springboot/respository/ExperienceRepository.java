package com.te.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.entity.Experience_Info_Entity;
@Repository
public interface ExperienceRepository extends JpaRepository<Experience_Info_Entity, Integer>{

}
