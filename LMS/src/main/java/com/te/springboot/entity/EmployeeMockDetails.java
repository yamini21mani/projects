package com.te.springboot.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Component
@Table
@Entity
public class EmployeeMockDetails {
	@Id
	private Integer sno;
	private String mockno;
	private String technology;
	private String panel;
	private String dateAndTime;
	private String mockRating;
	

	public String getMockRating() {
		return mockRating;
	}

	public void setMockRating(String mockRating) {
		this.mockRating = mockRating;
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getMockno() {
		return mockno;
	}

	public void setMockno(String mockno) {
		this.mockno = mockno;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

}
