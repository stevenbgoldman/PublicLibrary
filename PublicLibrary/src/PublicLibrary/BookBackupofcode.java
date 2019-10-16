package PublicLibrary;

public class BookBackupofcode
{

	private String deweyDecimalNumber;        // Unique Id for books in the branch
	private String author;                    // Author name
	private int isbn;                         // ISBN is a unique id used by libraries at least in the USA
	private String title;                     // Title of book
	private int numberOfPages;                // Count of pages in the book
	private String shortDescription;          // 100 characters or less
	private String description;               // full description very large String
	private String bookGenre;                 // Type of book Fiction, Non-Fiction, ....
	private int branchLocation;               // Where is the book located physically which branch
	private String bookStatus;                // is book checked out, check in, lost, damaged, .....
	

//Constructors

	public BookBackupofcode()
	{

	}

	public BookBackupofcode(String author, int isbn, String title)
	{

	}

	public BookBackupofcode(String deweyDecimalNumber, double value)
	{

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

	public int getNumberOfPages()
	{
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getShortDescription()
	{
		return shortDescription;
	}

	public void setShortDescription(String shortDescription)
	{
		this.shortDescription = shortDescription;
	}

	public String getBookGenre()
	{
		return bookGenre;
	}

	public void setBookGenre(String bookGenre)
	{
		this.bookGenre = bookGenre;
	}


	public int getBranchLocation()
	{
		return branchLocation;
	}

	public void setBranchLocation(int branchLocation)
	{
		this.branchLocation = branchLocation;
	}

	public String getBookStatus()
	{
		return bookStatus;
	}

	public void setBookStatus(String bookStatus)
	{
		this.bookStatus = bookStatus;
	}

	public String getDeweyDecimalNumber()
	{
		return deweyDecimalNumber;
	}

	public void setDeweyDecimalNumber(String deweyDecimalNumber)
	{
		this.deweyDecimalNumber = deweyDecimalNumber;
	}

	
}