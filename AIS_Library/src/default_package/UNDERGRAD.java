package default_package;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UNDERGRAD extends PATRON {
	Scanner undergradreader = new Scanner(System.in);
	ArrayList undergrads = new ArrayList();
	Random rand = new Random();
	int undergradid;
	String name;
	String address;
	String telephone;
	String Email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public UNDERGRAD() 
	{
		undergradid = rand.nextInt(999999);
		name = "No name";
		address = "Unknown";
		telephone = "No phone";
		Email = "No email";
	}
	
	public UNDERGRAD(int undergradid,String name,String address,String telephone,String Email) 
	{
		this.undergradid = rand.nextInt(999999);
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.Email = Email;
	}
	
	public void add_new_undergrad() 
	{
		this.undergradid = undergradid;
		System.out.println("Please enter the name: ");
		this.name = undergradreader.nextLine();
		System.out.println("Please enter address: ");
		this.address = undergradreader.nextLine();
		System.out.println("Please enter telephone: ");
		this.telephone = undergradreader.nextLine();
		System.out.println("Please enter Email: ");
		this.Email = undergradreader.nextLine();
		//arraylist
		undergrads.add(undergradid);
		undergrads.add(name);
		undergrads.add(address);
		undergrads.add(telephone);
		undergrads.add(Email);
		System.out.println("---undergraduate student account has been created---");
	}

}
