package com.te.springboot.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Component
@Entity
public class EmployeeMockInfo {
	@Id
	private String mockId;
	private String mockType;
	private String mockTakenBy;
	private Integer praticalMock;
	private Integer theoriticalMock;
	private String overAllFeedBack;
	private String detailsFeddBack;
	
	
	

	

	public String getMockId() {
		return mockId;
	}

	public void setMockId(String mockId) {
		this.mockId = mockId;
	}

	public String getMockType() {
		return mockType;
	}

	public void setMockType(String mockType) {
		this.mockType = mockType;
	}

	public String getMockTakenBy() {
		return mockTakenBy;
	}

	public void setMockTakenBy(String mockTakenBy) {
		this.mockTakenBy = mockTakenBy;
	}

	public Integer getPraticalMock() {
		return praticalMock;
	}

	public void setPraticalMock(Integer praticalMock) {
		this.praticalMock = praticalMock;
	}

	public Integer getTheoriticalMock() {
		return theoriticalMock;
	}

	public void setTheoriticalMock(Integer theoriticalMock) {
		this.theoriticalMock = theoriticalMock;
	}

	public String getOverAllFeedBack() {
		return overAllFeedBack;
	}

	public void setOverAllFeedBack(String overAllFeedBack) {
		this.overAllFeedBack = overAllFeedBack;
	}

	public String getDetailsFeddBack() {
		return detailsFeddBack;
	}

	public void setDetailsFeddBack(String detailsFeddBack) {
		this.detailsFeddBack = detailsFeddBack;
	}

//	public EmployeeBatchDetails getBatchDetails1() {
//		return batchDetails1;
//	}
//
//	public void setBatchDetails1(EmployeeBatchDetails batchDetails1) {
//		this.batchDetails1 = batchDetails1;
//	}
	
}
