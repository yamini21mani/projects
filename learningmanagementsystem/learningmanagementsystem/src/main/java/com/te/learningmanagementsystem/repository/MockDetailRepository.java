package com.te.learningmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.learningmanagementsystem.entity.Mock;
@Repository
public interface MockDetailRepository extends JpaRepository<Mock, Integer> {

}
