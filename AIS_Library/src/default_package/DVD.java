package default_package;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DVD extends LIBRARY_ITEM{
	
	Scanner dvdreader = new Scanner(System.in);
	ArrayList dvds = new ArrayList();
	Random rand = new Random();
	int dvdid;
	String title;
	String releasedate;
	String actor;
	public int getDvdid() {
		return dvdid;
	}
	public void setDvdid(int dvdid) {
		this.dvdid = dvdid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	public DVD() 
	{
		dvdid = rand.nextInt(9999);
		title = "No title";
		releasedate = "No date";
		actor = "No actor";
	}
	
	public DVD(int dvdid,String title,String releasedate,String actor) 
	{
		this.dvdid = rand.nextInt(9999);
		this.title = title;
		this.releasedate = releasedate;
		this.actor = actor;
	}
	
	public void add_new_dvd() 
	{
		this.dvdid = dvdid;
		System.out.print("Please enter the title: ");
		this.title = dvdreader.nextLine();
		System.out.print("Please enter the release date: ");
		this.releasedate = dvdreader.nextLine();
		System.out.print("Please enter the actor: ");
		this.actor = dvdreader.nextLine();
		
		//arraylist;
		dvds.add(dvdid);
		dvds.add(title);
		dvds.add(releasedate);
		dvds.add(actor);
		//System.out.println(books);
		System.out.println("---dvd has been added---");
	}

}
