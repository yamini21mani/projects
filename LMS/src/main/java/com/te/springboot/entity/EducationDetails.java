package com.te.springboot.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
@Component
@Table
@Entity
public class EducationDetails {
	@Id
	private int sNo;
	@NotBlank
	private String educationType;
	@NotNull
	private String percentage;
	@NotBlank
	private String instituteName;
	@NotBlank
	private String state;
	@NotBlank
	private String yearOfPassing;
	@NotBlank
	private String universityName;
	@NotBlank
	private String specialization;

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

//	public int getEducationDetailsId() {
//		return educationDetailsId;
//	}
//
//	public void setEducationDetailsId(int educationDetailsId) {
//		this.educationDetailsId = educationDetailsId;
//	}

	public String getEducationType() {
		return educationType;
	}

	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
