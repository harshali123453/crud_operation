package com.crud.service;

import java.util.List;

import crud_exception.accountNotFountException;
import crud_using_collection_details.BankAccount;


public interface bankaccountservice {
	
		public abstract void addNewBankacc(BankAccount bankaccount);
	public abstract void removebankacc(BankAccount bankaccount) throws accountNotFountException;
	public abstract void updatebankacc(BankAccount bankaccount);
	public abstract List<BankAccount> showalldata();


}
