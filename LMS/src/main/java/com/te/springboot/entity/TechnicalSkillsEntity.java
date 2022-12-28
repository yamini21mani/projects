package com.te.springboot.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
@Component
public class TechnicalSkillsEntity {
	@Id
	private int sNo;
	@Column(name = "Skill Type", nullable = false)
	private String skillType;
	@Column(name = "Skill Rating")
	private String skillRating;
	@Column(name = "Years of Experience(over skill)")
	private String yearOfExperience;


	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getSkillType() {
		return skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

	public String getSkillRating() {
		return skillRating;
	}

	public void setSkillRating(String skillRating) {
		this.skillRating = skillRating;
	}

	public String getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(String yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	

}
