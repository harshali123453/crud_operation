package crud_using_collection_details;

import java.util.Objects;

public class BankAccount {
private int actnumber;
private String customerName;
private int actBalance;
public BankAccount(int actnumber, String customerName, int actBalance) {
	super();
	this.actnumber = actnumber;
	this.customerName = customerName;
	this.actBalance = actBalance;
}
public int getActnumber() {
	return actnumber;
}
public void setActnumber(int actnumber) {
	this.actnumber = actnumber;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getActBalance() {
	return actBalance;
}
public void setActBalance(int actBalance) {
	this.actBalance = actBalance;
}
@Override
public int hashCode() {
	return Objects.hash(actBalance, actnumber, customerName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BankAccount other = (BankAccount) obj;
	return actBalance == other.actBalance && actnumber == other.actnumber
			&& Objects.equals(customerName, other.customerName);
}

	
	
	
}
