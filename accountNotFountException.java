package crud_exception;

public class accountNotFountException extends Exception{
	private int accountNumber;

	public accountNotFountException() {
		super();
	}

	public accountNotFountException(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "accountNotFountException [accountNumber=" + accountNumber + "]";
	}
	

}
