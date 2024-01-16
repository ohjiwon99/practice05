package com.javaex.ex08;

public class Account {

	// 필드
	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(this.accountNo + "계좌가 개설되었습니다.");
	}

	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	// 필요한 메소드 작성
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 일반메소드

	public void deposit(int money) {
		balance = money + 1;
	}

	public void withdraw(int money) {
		balance = money - 1;
	}

	public void showBalance() {
		System.out.println(balance);
	}

}
