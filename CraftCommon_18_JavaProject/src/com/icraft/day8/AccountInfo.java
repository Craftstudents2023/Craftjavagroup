package com.icraft.day8;

public class AccountInfo {
	
	private String accountName;
	private Long accountNumber;
	private double accountDeposit;
	private double accountWithdraw;
	private double accountBalance;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountDeposit() {
		return accountDeposit;
	}
	public void setAccountDeposit(double accountDeposit) {
		if(accountDeposit >= 100) {
		this.accountDeposit = accountDeposit;
		}
		else {
		System.err.println("Invalid amount");
		}
	}
	public double getAccountWithdraw() {
		return accountWithdraw;
	}
	public void setAccountWithdraw(double accountWithdraw) {
		if(accountWithdraw >= 100) {
		this.accountWithdraw = accountWithdraw;
		}
		else {
			System.out.println("Invaild amount");
		}
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}
