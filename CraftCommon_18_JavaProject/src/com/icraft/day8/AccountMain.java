package com.icraft.day8;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountInfo acc = new AccountInfo();
		
		acc.setAccountName("James");
		acc.setAccountNumber(1234567890l);
		acc.setAccountDeposit(2000);
		acc.setAccountWithdraw(200);
		acc.setAccountBalance(4000);
		
		double actualBalance = acc.getAccountBalance()+acc.getAccountDeposit()-acc.getAccountWithdraw();
		
		System.out.println("Account Name: " + acc.getAccountName());
		System.out.println("Account Number: " + acc.getAccountNumber());
		System.out.println("Account Deposit: " + acc.getAccountDeposit());
		System.out.println("Account WithDraw: " + acc.getAccountWithdraw());
		System.out.println("Account Balance: " + acc.getAccountBalance());
		System.out.println("Account Final Balance: " + actualBalance);
	}

}
