package com.webservices.rest.banking.com.dhanam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiary")
public class Baneficiary implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "beneficiary_id")
	private Integer beneficiaryId;

	@Column(name = "beneficiary_account_number")
	private Integer beneficiaryAccountNumber;

	@Column(name = "ifsc_code")
	private String ifscCode;

	@Column(name = "short_name")
	private String shortName;

	@Column(name = "beneficiary_bank_name")
	private String beneficiaryBankName;

	
	public Integer getBeneficiaryId() {
		return beneficiaryId;
	}


	public void setBeneficiaryId(Integer beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}


	public Integer getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}


	public void setBeneficiaryAccountNumber(Integer beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}


	public String getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}


	public String getShortName() {
		return shortName;
	}


	public void setShortName(String shortName) {
		this.shortName = shortName;
	}


	public String getBeneficiaryBankName() {
		return beneficiaryBankName;
	}


	public void setBeneficiaryBankName(String beneficiaryBankName) {
		this.beneficiaryBankName = beneficiaryBankName;
	}


	@Override
	public String toString() {
		return "Baneficiary [beneficiaryId=" + beneficiaryId + ", beneficiaryAccountNumber=" + beneficiaryAccountNumber
				+ ", ifscCode=" + ifscCode + ", shortName=" + shortName + ", beneficiaryBankName=" + beneficiaryBankName
				+ "]";
	}

}
