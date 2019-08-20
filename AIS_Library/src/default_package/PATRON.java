package default_package;

public class PATRON {
	
	int patronid;
	String Name;
	public int getPatronid() {
		return patronid;
	}
	public void setPatronid(int patronid) {
		this.patronid = patronid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public PATRON() 
	{
		Name = "No name";
	}

}
