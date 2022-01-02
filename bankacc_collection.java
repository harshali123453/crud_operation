package com.learn.client;

import java.util.List;

import com.crud.service.bankservice;

import crud_second_pack.bankaccdao;
import crud_using_collection_details.BankAccount;

public class bankacc_collection {
	public static void main(String[] args) {
		bankaccdao b1=new bankaccdao();
		b1.addNewBankacc(new BankAccount(1,"A", 100000));
		b1.addNewBankacc(new BankAccount(1,"C", 900000));
		//b1.addNewBankacc(new BankAccount(1,"U", 500000));
		//b1.addNewBankacc(new BankAccount(1,"I", 400000));
		//b1.addNewBankacc(new BankAccount(1,"B", 200000));
		List<BankAccount> acclist=b1.showalldata();
		for(BankAccount act:acclist) {
			System.out.println(act.getActnumber()+" "+act.getCustomerName()+""+act.getActBalance());
		}
		//BankAccount temp=new BankAccount(1,"A",10000);

	}

}
