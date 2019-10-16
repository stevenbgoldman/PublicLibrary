package PublicLibrary;

public class Book
{

	
	private String author;                    // Author name
	private int isbn;                         // ISBN is a unique id used by libraries at least in the USA
	private String title;                     // Title of book
	private int branchLocation;               // Where is the book located physically which branch

//Constructors

	public Book()
	{

	}

	public Book(String author, int isbn, String title, int branchlocation)
	{
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.branchLocation = branchlocation;

	}

//Override

	@Override
	public String toString()
	{
		return "\nTitle: " + title + 
			   "\nAuthor: " + author +
		       "\nISBN: " + isbn + 
			   "\nBranch Location: " + branchLocation + 
			   "\n";
	}

	
	
	
	
	
//Setters and Getters

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public int getIsbn()
	{
		return isbn;
	}

	public void setIsbn(int isbn)
	{
		this.isbn = isbn;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getBranchLocation()
	{
		return branchLocation;
	}

	public void setBranchLocation(int branchLocation)
	{
		this.branchLocation = branchLocation;
	}


}