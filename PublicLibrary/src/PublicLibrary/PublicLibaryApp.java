package PublicLibrary;

import java.util.*;

public class PublicLibaryApp
{

	static Library lib = new Library();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;	
	
	public static void main(String[] args) 
	{
		while (running)
		{
			System.out.println("\nEnter 1 to add a book to the Library" +
							   "\nEnter 2 to list all books in a Library" +
							   "\nEnter 3 to exit the program" );
			int answer = in.nextInt();
			switch(answer)
			{
			case 1:
				addBook();
				break;
			case 2:
				System.out.println(lib.toString());
				break;
			case 3:
				running = false;
				System.exit(0);
				break;
				
			}
		}
		
	}

	private static void addBook()
	{
		String author, title;
		int isbn, branchLocation;
		
		System.out.println("\nEnter Author: ");
		author = in.nextLine();
		
		System.out.println("\nEnter Title: ");
		title= in.nextLine();
		
		System.out.println("\nEnter ISBN: ");
		isbn = in.nextInt();
		
		System.out.println("\nEnter Branch Location Number: ");
		branchLocation = in.nextInt();
		
		Book b = new Book(author, isbn, title, branchLocation);
		lib.addBook(b);
		
		
		
	}

}