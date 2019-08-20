import java.util.Scanner;

public class Books extends LibraryItems {
	String author;
	String publisher;
	String ISBN;
	int edition;
	Scanner myObj3=new Scanner(System.in);
	
	
	public void addBook()
	{
		System.out.println("Enter Title");
    	this.setTitle(myObj3.nextLine());
    	System.out.println("Enter ID");
    	this.setId(myObj3.nextInt());
    	System.out.println("Enter Author");
    	author=myObj3.next();
    	System.out.println("Enter Publisher");
    	publisher=myObj3.next();
    	System.out.println("Enter ISBN");
        ISBN=myObj3.next();
    	System.out.println("Enter Edition");
    	edition=myObj3.nextInt();
	}
}
