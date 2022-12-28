package com.te.springboot.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Component
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeMockDetailsDto {
	private Integer sNo;
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

	public Integer getsNo() {
		return sNo;
	}

	public void setSno(Integer sNo) {
		this.sNo = sNo;
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
