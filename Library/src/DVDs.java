import java.util.Scanner;

public class DVDs extends LibraryItems {
	String releasedate;
	String actors;
	Scanner myobj2=new Scanner (System.in);
	public void addDVDs()
	{
		System.out.println("Enter Title");
    	this.setTitle(myobj2.nextLine());
    	System.out.println("Enter ID");
    	this.setId(myobj2.nextInt());
		System.out.println("Enter The Release Date: ");
		releasedate=myobj2.next();
		System.out.println("Enter actors: ");
		actors=myobj2.next();
		
		
		
	}
	
	
}
