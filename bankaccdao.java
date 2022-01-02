package crud_second_pack;

import java.util.LinkedList;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import crud_exception.accountNotFountException;
import crud_using_collection_details.BankAccount;

public class bankaccdao implements bankacc_DAO{
	List<BankAccount> accountList=new LinkedList<>();

	@Override
	public void addNewBankacc(BankAccount bankaccount) {
		// TODO Auto-generated method stub
		accountList.add(bankaccount);
		
	}

	@Override
	public void removebankacc(BankAccount bankaccount)  {
		// TODO Auto-generated method stub
		/*before deleting the bankaccount object from list first we need to check 
		 * if it exist otherwise we need to raise an exception*/
		if(!accountList.contains(bankaccount))
		{
			try {
			throw new accountNotFountException(bankaccount.getActnumber());
		}catch(accountNotFountException e)
			{
			e.printStackTrace();
			}
		}
		
	accountList.remove(bankaccount)	;
	}

	@Override
	public void updatebankacc(BankAccount bankaccount) {
		// TODO Auto-generated method stub
		if(!accountList.contains(bankaccount))
		{
			try {
			throw new accountNotFountException(bankaccount.getActnumber());
		}catch(accountNotFountException e)
			{
			e.printStackTrace();
			}
		}
		int index=accountList.indexOf(bankaccount);
		accountList.set(index, bankaccount);
	}

	@Override
	public List<BankAccount> showalldata() {
		return accountList;
		// TODO Auto-generated method stub

		
		
	}
	

}
