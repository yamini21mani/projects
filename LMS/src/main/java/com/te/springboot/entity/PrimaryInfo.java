package com.te.springboot.entity;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Component
@Table
public class PrimaryInfo {
	@Id
	@NotNull(message = "Invalid EmployeeId")
	private String empId;
	@NotNull(message = "Employee Name shouldn't be blank")
	private String empName;
	@NotBlank
	private String empPass;
	@NotBlank
	private String doj;
	@NotBlank
	private String dob;
	@Email
	private String emailId;
	@NotBlank
	private String bloodGroup;
	@NotNull
	private String designation;
	@NotBlank
	private String gender;
	@NotBlank
	private String nationality;
	@NotNull
	private String employeeStatus;
	private int attendance;
	

	public String getEmpPass() {
		return empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public String getEmpId() {
		return empId;
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

	public String getDoj() {
		return doj;
	}

	public String setDoj(String doj) {
		return this.doj = doj;
	}

	public String getDob() {
		return dob;
	}

	public String setDob(String dob) {
		return this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	@OneToOne(targetEntity = SecondaryInfo.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "empId",  referencedColumnName = "empId")
	private SecondaryInfo secondaryInfo;

	@OneToOne(targetEntity = EmployeeBankDetails.class, cascade = CascadeType.ALL)
	private EmployeeBankDetails bankDetails;

	@OneToMany(targetEntity = Experience_Info_Entity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "exp_empId", referencedColumnName = "empId")
	private List<Experience_Info_Entity> info_Entities;

	@OneToMany(targetEntity = AddressInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "Add_empId", referencedColumnName = "empId")
	private List<AddressInfo> addressInfos;

	@OneToMany(targetEntity = ContactInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "Contact_empId", referencedColumnName = "empId")
	private List<ContactInfo> contactInfos;

	@OneToMany(targetEntity = EducationDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "edu_empId", referencedColumnName = "empId")
	private List<EducationDetails> educationDetails;

	@OneToMany(targetEntity = TechnicalSkillsEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "tech_empId", referencedColumnName = "empId")
	private List<TechnicalSkillsEntity> skillsEntities;
	
	@OneToMany(targetEntity = EmployeeBatchDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "empId", referencedColumnName = "empId")
	private List<EmployeeBatchDetails> batchDetails;
}
