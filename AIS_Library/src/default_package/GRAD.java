package default_package;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GRAD extends PATRON {
	Scanner gradreader = new Scanner(System.in);
	ArrayList grads = new ArrayList();
	Random rand = new Random();
	int gradid;
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
	
	
	/**
	 * constructor GRAD() default value.
	 */
	public GRAD() 
	{
		gradid = rand.nextInt(999999);
		name = "No name";
		address = "Unknown";
		telephone = "No phone";
		Email = "No email";
	}
	
	public GRAD(int gradid,String name,String address,String telephone,String Email) 
	{
		this.gradid = rand.nextInt(999999);
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.Email = Email;
	}
	
	public void add_new_grad() 
	{
		this.gradid = gradid;
		System.out.println("Please enter the name: ");
		this.name = gradreader.nextLine();
		System.out.println("Please enter address: ");
		this.address = gradreader.nextLine();
		System.out.println("Please enter telephone: ");
		this.telephone = gradreader.nextLine();
		System.out.println("Please enter Email: ");
		this.Email = gradreader.nextLine();
		//arraylist
		grads.add(gradid);
		grads.add(name);
		grads.add(address);
		grads.add(telephone);
		grads.add(Email);
		System.out.println("---graduate student account has been created---");
	}

}
