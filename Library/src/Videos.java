import java.util.Scanner;

public class Videos extends LibraryItems {
	String producer;
	int lifetime;
	int length;
	Scanner video= new Scanner (System.in);
	public void addVideos()
	{
		System.out.println("Enter Title");
    	this.setTitle(video.nextLine());
    	System.out.println("Enter ID");
    	this.setId(video.nextInt());
    	System.out.println("Enter Producer");
    	producer=video.next();
    	System.out.println("Enter Lifetime");
    	lifetime=video.nextInt();
    	System.out.println("Enter Length");
    	length=video.nextInt();
    	
	}
	
}
