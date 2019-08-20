package default_package;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CUSTOMER {
	//data encapsulation
	private static int customerCount = 0;
	private String Name;
	private String Address;
	private String phone;
	private String Email;
	private String Membership;
	
	//getter and setter
	public int getCustomerCount() {
		return customerCount;
	}
	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMembership() {
		return Membership;
	}
	public void setMembership(String membership) {
		Membership = membership;
	}
	
	//constructor
	public CUSTOMER(String Name,String Address,String phone,String Email,String membership) 
	{
		this.Name = Name;
		this.Address = Address;
		this.phone = phone;
		this.Email = Email;
		this.Membership = membership;
		customerCount ++;
	}
	
	//add_customer function
	public static void add_customer() 
	{
		Scanner myscan = new Scanner(System.in);
		System.out.println("Please enter customer's Name:");
		String Name = myscan.nextLine();
		System.out.println("Please enter customer's Address:");
		String Address = myscan.nextLine();
		System.out.println("Please enter customer's Phone:");
		String Phone = myscan.nextLine();
		System.out.println("Please enter customer's Email:");
		String Email = myscan.nextLine();
		System.out.println("Please enter membership type:");
		String membership = myscan.nextLine();
		CUSTOMER newcustomer = new CUSTOMER(Name,Address,Phone,Email,membership);
		String mycustomer = ("CustomerCount: "+newcustomer.getCustomerCount()+"\nCustomerName: "+newcustomer.getName()+"\nCustomerAddress: "+newcustomer.getAddress()+"\nCustomerPhone: "+newcustomer.getPhone()+"\nCustomerEmail: "+newcustomer.getEmail()+"\nCustomerMembership"+newcustomer.getMembership());
		System.out.println(mycustomer);
		String mycustomerinfo = ("CustomerCount: "+newcustomer.getCustomerCount()+"\tCustomerName: "+newcustomer.getName()+"\tCustomerAddress: "+newcustomer.getAddress()+"\tCustomerPhone: "+newcustomer.getPhone()+"\tCustomerEmail: "+newcustomer.getEmail()+"\tCustomerMembership"+newcustomer.getMembership()+"\r\n");
		
		try {
			FileWriter myfile = new FileWriter("customer.txt",true);
			BufferedWriter FW = new BufferedWriter(myfile);
			FW.write(mycustomerinfo);
			FW.close();
			System.out.println("\nDo you want to dispaly all customer? 'y or n'");
			char display = myscan.next().charAt(0);
			if(display=='y') 
			{
				FileReader FR = new FileReader("customer.txt");
				int i;
				while ((i = FR.read()) != -1) 
				{
					System.out.print((char) i);
				}
				System.out.print("\n");
			}
			else 
			{
				System.out.println();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot find the file.");
		}
	}
	
	
	
	

}
