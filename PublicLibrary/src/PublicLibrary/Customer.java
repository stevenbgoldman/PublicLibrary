package PublicLibrary;

import java.util.*;

public class Customer
{

	private int customerNumber;
	private String firstName;
	private String lastName;
	private String customerEmail1;
	private int[] isbnCheckedout;
	private Date createdDate;
	private boolean typeCustomer;

	public int getCustomerNumber()
	{
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public int[] getIsbnCheckedout()
	{
		return isbnCheckedout;
	}

	public void setIsbnCheckedout(int[] isbnCheckedout)
	{
		this.isbnCheckedout = isbnCheckedout;
	}

	public String getCustomerEmail1()
	{
		return customerEmail1;
	}

	public void setCustomerEmail1(String customerEmail1)
	{
		this.customerEmail1 = customerEmail1;
	}

	public Date getCreatedDate()
	{
		return createdDate;
	}

	public void setCreatedDate(Date createdDate)
	{
		this.createdDate = createdDate;
	}

	public boolean isTypeCustomer()
	{
		return typeCustomer;
	}

	public void setTypeCustomer(boolean typeCustomer)
	{
		this.typeCustomer = typeCustomer;
	}

}
