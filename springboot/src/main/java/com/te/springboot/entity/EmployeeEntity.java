package com.te.springboot.entity;

import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Data;

@Entity
@Table
@Component
public class EmployeeEntity {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String empId;
	private String empName;
	private String empEmail;
	private String empPass;

	
	public String getEmpId() {
		return empId;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empPass="
				+ empPass + "]";
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPass() {
		return empPass;
	}
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}
}
