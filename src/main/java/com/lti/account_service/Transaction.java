package com.lti.account_service;

import java.util.LinkedList;
import java.util.List;

public class Transaction {
	List<Account> accounts = new LinkedList<Account>();

	public Transaction(List<Account> accounts) {
		super();
		this.accounts = accounts;
	}

	public Account findAccount(int accNo) {
		for (Account a : accounts) {
			if (a.getAccNo() == accNo) {
				return a;
			}
		}
		return null;
	}

	public double withdraw(int accNo, double amt) {
		Account acc = findAccount(accNo);
		double temp = acc.getBalance() - amt;
		return temp;
	}

	public double deposit(int accNo, double amt) {
		Account acc = findAccount(accNo);
		double temp = acc.getBalance() - amt;
		return temp;
	}

}