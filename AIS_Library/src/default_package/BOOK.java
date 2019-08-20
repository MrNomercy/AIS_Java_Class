package default_package;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BOOK extends LIBRARY_ITEM{
	
	Scanner bookreader = new Scanner(System.in);
	ArrayList books = new ArrayList();
	Random rand = new Random();
	int bookid;
	String title;
	String author;
	String publisher;
	String ISBN;
	int edition;
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public BOOK() 
	{
		bookid = rand.nextInt(9999);
		title = "No title";
		author = "No name";
		publisher = "No name";
		ISBN = "No ISBN";
		edition = 169;
	}
	
	public BOOK(int bookid,String title,String author,String publisher, String ISBN,int edition) 
	{
		this.bookid  = rand.nextInt(9999);
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.ISBN = ISBN;
	}
	
	public void add_new_book() 
	{
		this.bookid = bookid;
		System.out.print("Please enter the title: ");
		this.title = bookreader.nextLine();
		System.out.print("Please enter the author: ");
		this.author = bookreader.nextLine();
		System.out.print("Please enter the publisher: ");
		this.publisher = bookreader.nextLine();
		System.out.print("Please enter the ISBN: ");
		this.ISBN = bookreader.nextLine();
		System.out.print("please enter the edition: ");
		this.edition = bookreader.nextInt();
		//arraylist;
		books.add(bookid);
		books.add(title);
		books.add(author);
		books.add(publisher);
		books.add(ISBN);
		books.add(edition);
		//System.out.println(books);
		System.out.println("---book has been added---");
	}
	

}
