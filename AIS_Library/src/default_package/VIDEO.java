package default_package;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VIDEO extends LIBRARY_ITEM{
	
	Scanner videoreader = new Scanner(System.in);
	ArrayList videos = new ArrayList();
	Random rand = new Random();
	int videoid;
	String title;
	String producer;
	String Lifetime;
	String length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getLifetime() {
		return Lifetime;
	}
	public void setLifetime(String lifetime) {
		Lifetime = lifetime;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	
	public VIDEO() 
	{
		videoid = rand.nextInt(9999);
		title = "No title";
		producer = "No producer";
		Lifetime = "Unlimited";
		length = "Unknown";
	}
	
	public VIDEO(int videoid,String title, String producer, String Lifetime, String length) 
	{
		this.videoid = rand.nextInt(9999);
		this.title = title;
		this.producer = producer;
		this.Lifetime = Lifetime;
		this.length = length;
	}
	
	public void add_new_video() 
	{
		this.videoid = videoid;
		System.out.print("Please enter the title: ");
		this.title = videoreader.nextLine();
		System.out.print("Please enter the producer: ");
		this.producer = videoreader.nextLine();
		System.out.print("Please enter the Lifetime: ");
		this.Lifetime = videoreader.nextLine();
		System.out.print("Please enter the length: ");
		this.length = videoreader.nextLine();
		//arraylist;
		videos.add(videoid);
		videos.add(title);
		videos.add(producer);
		videos.add(Lifetime);
		videos.add(length);
		//System.out.println(books);
		System.out.println("---video has been added---");

	
	}

}
