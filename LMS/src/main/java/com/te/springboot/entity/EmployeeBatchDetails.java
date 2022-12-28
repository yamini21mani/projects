package com.te.springboot.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Component
@Table
public class EmployeeBatchDetails {
	private int sNo;
	@Id
	private String emp_batch_id;
	private String emp_batch_name;
	private String emp_mentor_name;
	private String emp_technologies;
	private String emp_start_date;
	private String emp_end_date;
	private String emp_status;
	private String emp_action;
	private String emp_batch_Strength;
	
	
	
	public String getEmp_batch_Strength() {
		return emp_batch_Strength;
	}

	public void setEmp_batch_Strength(String emp_batch_Strength) {
		this.emp_batch_Strength = emp_batch_Strength;
	}

	@OneToMany(targetEntity = EmployeeMockDetails.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="batchId",referencedColumnName = "emp_batch_id" )
	private List<EmployeeMockDetails> mockDetails;

	@OneToMany(targetEntity = EmployeeMockInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "batchId",referencedColumnName = "emp_batch_id")
	private List<EmployeeMockInfo> mockInfos;
	
	@OneToMany(targetEntity = MentorEntity.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "batchId",referencedColumnName = "emp_batch_id")
	private List<MentorEntity> mentorEntities;
	
	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getEmp_batch_id() {
		return emp_batch_id;
	}

	public void setEmp_batch_id(String emp_batch_id) {
		this.emp_batch_id = emp_batch_id;
	}

	public String getEmp_batch_name() {
		return emp_batch_name;
	}

	public void setEmp_batch_name(String emp_batch_name) {
		this.emp_batch_name = emp_batch_name;
	}

	public String getEmp_mentor_name() {
		return emp_mentor_name;
	}

	public void setEmp_mentor_name(String emp_mentor_name) {
		this.emp_mentor_name = emp_mentor_name;
	}

	public String getEmp_technologies() {
		return emp_technologies;
	}

	public void setEmp_technologies(String emp_technologies) {
		this.emp_technologies = emp_technologies;
	}

	public String getEmp_start_date() {
		return emp_start_date;
	}

	public void setEmp_start_date(String emp_start_date) {
		this.emp_start_date = emp_start_date;
	}

	public String getEmp_end_date() {
		return emp_end_date;
	}

	public void setEmp_end_date(String emp_end_date) {
		this.emp_end_date = emp_end_date;
	}

	public String getEmp_status() {
		return emp_status;
	}

	public void setEmp_status(String emp_status) {
		this.emp_status = emp_status;
	}

	public String getEmp_action() {
		return emp_action;
	}

	public void setEmp_action(String emp_action) {
		this.emp_action = emp_action;
	}
}
