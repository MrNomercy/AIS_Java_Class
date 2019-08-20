package assignment_01;

public class Customer {
	private String name;
	private String mobileNumber;
	private String address;

	public Customer() {
		setName("");
		setMobileNumber("");
		setAddress("");
	}

	public void showSummary() {
		System.out.println("******************************************");
		System.out.println("Name: " + getName());
		System.out.println("Mobile Number: " + getMobileNumber());
		if (	!getAddress().isEmpty()) {
			System.out.println("Address: " + getAddress());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
