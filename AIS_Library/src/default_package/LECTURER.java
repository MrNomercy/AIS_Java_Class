package default_package;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LECTURER extends PATRON{
	
	Scanner lecturerreader = new Scanner(System.in);
	ArrayList lecturers = new ArrayList();
	Random rand = new Random();
	int lecturerid;
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
	public String gettelephone() {
		return telephone;
	}
	public void settelephone(String telephone) {
		telephone = telephone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public LECTURER() 
	{
		lecturerid = rand.nextInt(999999);
		name = "No name";
		address = "Unknown";
		telephone = "No phone";
		Email = "No email";
	}
	
	public LECTURER(int lecturerid,String name,String address,String telephone,String Email) 
	{
		this.lecturerid = rand.nextInt(999999);
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.Email = Email;
	}
	
	public void add_new_lecturer() 
	{
		this.lecturerid = lecturerid;
		System.out.println("Please enter the name: ");
		this.name = lecturerreader.nextLine();
		System.out.println("Please enter address: ");
		this.address = lecturerreader.nextLine();
		System.out.println("Please enter telephone: ");
		this.telephone = lecturerreader.nextLine();
		System.out.println("Please enter Email: ");
		this.Email = lecturerreader.nextLine();
		//arraylist
		lecturers.add(lecturerid);
		lecturers.add(name);
		lecturers.add(address);
		lecturers.add(telephone);
		lecturers.add(Email);
		System.out.println("---lecturer account has been created---");
	}

}
