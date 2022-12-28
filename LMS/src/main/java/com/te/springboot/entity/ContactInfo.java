package com.te.springboot.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Component
@Table
@Entity
public class ContactInfo {
	@Id
	@NotNull
	@Size(min=10,max=10)
	private long contactNumber;
	private String contactType;


	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

}
