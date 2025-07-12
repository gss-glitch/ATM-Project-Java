package com.exponent.BankApplicaction.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Account {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountNo;

	private String userName;

	private long aadharCardNo;

	private String panCardNo;

	private long mobileNo;

	private int accountBalance;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getAadharCardNo() {
		return aadharCardNo;
	}

	public void setAadharCardNo(long aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", userName=" + userName + ", aadharCardNo=" + aadharCardNo
				+ ", panCardNo=" + panCardNo + ", mobileNo=" + mobileNo + ", accountBalance=" + accountBalance
				+ ", date=" + date + "]";
	}

}
