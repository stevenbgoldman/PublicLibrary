package PublicLibrary;

public class Branch
{

	private int branchNumber;        		// Branch Number must be uniqued
	private String branchName;        		// Name of branch
	private Book[] branchBooks;             // Array of books in the branch
	private Address uniqueId;               // Link to Addess class to get the address of the branch
								
 
	public Branch()
	{

	}

	public Branch(int uniquedId)
	{

	}

	public void AddBook(double book)
	{
		if (branchBooks.length == 0)
		{
			 branchBooks[0] = new Book();
		}
		else
		{
			for (int i = 1; i <= branchBooks.length - 1; i++)
			{
				branchBooks[i] = new Book();
		
			}
		}

	}
	

	public int getBranchNumber()
	{
		return branchNumber;
	}

	public void setBranchNumber(int branchNumber)
	{
		this.branchNumber = branchNumber;
	}

	public String getBranchName()
	{
		return branchName;
	}

	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}

	public Book[] getBranchBooks()
	{
		return branchBooks;
	}

	public void setBranchBooks(Book[] branchBooks)
	{
		this.branchBooks = branchBooks;
	}

	public Address getUniqueId()
	{
		return uniqueId;
	}

	public void setUniqueId(Address uniqueId)
	{
		this.uniqueId = uniqueId;
	}

}
