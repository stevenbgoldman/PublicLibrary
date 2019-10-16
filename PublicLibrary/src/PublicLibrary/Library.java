package PublicLibrary;

import java.util.*;

public class Library
{

	private int[] branchNumber;              // Array of Branch Number(s) 
	private int[] customerNumber;            // Array of Customer Number(s)
	private double[] deweyDecimalNumbers;    // Array of Book(s) by Dewey Decimal Number
	private List<Book> collection;
	
	public Library()
	{
		collection = new ArrayList<Book>();
	}
	
	public void addBook(Book book)
	{
		collection.add(book);
	}
		
		
//Override(s)
	
	@Override
	public String toString()
	{	
		String total = "\n";
		for (int i = 0; i < collection.size(); i++)
		{
			Book b = collection.get(i);
			total = total + b.toString();
		}
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	

//Getters and Settlers
	public int[] getBranchNumber()
	{
		return branchNumber;
	}

	public void setBranchNumber(int[] branchNumber)
	{
		this.branchNumber = branchNumber;
	}

	public int [] getCustomerNumber()
	{
		return customerNumber;
	}

	public void setCustomerNumber(int [] customerNumber)
	{
		this.customerNumber = customerNumber;
	}

	public double [] getDeweyDecimalNumbers()
	{
		return deweyDecimalNumbers;
	}

	public void setDeweyDecimalNumbers(double [] deweyDecimalNumbers)
	{
		this.deweyDecimalNumbers = deweyDecimalNumbers;
	}

	public List<Book> getCollection()
	{
		return collection;
	}















	public void setCollection(List<Book> collection)
	{
		this.collection = collection;
	}
	
	
	
	
	
	
	
	
}
