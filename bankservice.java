package com.crud.service;

import java.util.List;

import crud_exception.accountNotFountException;
import crud_second_pack.bankacc_DAO;
import crud_second_pack.bankaccdao;
import crud_using_collection_details.BankAccount;

public class bankservice implements bankaccountservice{
bankacc_DAO dao=new bankaccdao();
	@Override
	public void addNewBankacc(BankAccount bankaccount) {
		// TODO Auto-generated method stub
		dao.addNewBankacc(bankaccount);
	}

	@Override
	public void removebankacc(BankAccount bankaccount) throws accountNotFountException {
		// TODO Auto-generated method stub
		dao.removebankacc(bankaccount);
	}

	@Override
	public void updatebankacc(BankAccount bankaccount) {
		// TODO Auto-generated method stub
dao.updatebankacc(bankaccount);		
	}

	@Override
	public List<BankAccount> showalldata() {
		// TODO Auto-generated method stub
	
		return dao.showalldata();
	}
	
	

}
