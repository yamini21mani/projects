package com.te.springboot.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Component
@Entity
//@NoArgsConstructor

public class SecondaryInfo {
	@Id
	@Column(unique = true)
	@NotBlank(message="PAN number shouldn't be blank")
	private String panNo;
	@NotBlank(message="AADHAR number shouldn't be blank")
	private long aadharNo;
	@NotBlank
	private String fatherName;
	@NotBlank
	private String motherName;
	private String spouseNmae;
	private String passportNo;
	@NotBlank
	private String maritalStatus;
	private int empId;

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSpouseNmae() {
		return spouseNmae;
	}

	public void setSpouseNmae(String spouseNmae) {
		this.spouseNmae = spouseNmae;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

//	public SecondaryInfo(String panNo, long aadharNo, String fatherName, String motherName, String spouseNmae,
//			String passportNo, String maritalStatus, int empId) {
//		super();
//		this.panNo = panNo;
//		this.aadharNo = aadharNo;
//		this.fatherName = fatherName;
//		this.motherName = motherName;
//		this.spouseNmae = spouseNmae;
//		this.passportNo = passportNo;
//		this.maritalStatus = maritalStatus;
//		this.empId = empId;
//	}
}
