package com.te.springboot.dto;

import org.springframework.stereotype.Component;

@Component
public class ContactDto {
private long contactNumber;

public long getContactNumber() {
	return contactNumber;
}

public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
}
