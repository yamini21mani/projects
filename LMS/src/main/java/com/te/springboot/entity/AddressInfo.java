package com.te.springboot.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
@Component
public class AddressInfo {
	@Id
	@NotBlank
	private int sNo;
	@NotBlank
	private String street;
	@NotNull
	private String city;
	@NotNull
	private String state;
	@NotBlank(message="pincode shouldn't be blank")
	private Integer pincode;
	private String doorNo;
	private String locality;
	private String addressType;
	private String landMark;
	@ManyToOne
	private PrimaryInfo primaryInfo;
	

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

}
