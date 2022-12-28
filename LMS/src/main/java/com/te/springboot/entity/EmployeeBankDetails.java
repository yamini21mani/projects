package com.te.springboot.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Component
@Entity
@Table
public class EmployeeBankDetails {
	@Id
	private String panNo;
	@NotBlank(message="Accountno shouldn't be blank")
	private long accountNo;
	@NotNull
	private String bankName;
	private String accountType;
	@NotBlank(message="IFSC code shouldn't be blank")
	private String ifscCode;
	private String branch;
	private String state;

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
