package default_package;

public class LIBRARY_ITEM {
	
	int itemid;
	String title;
	
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public LIBRARY_ITEM() 
	{
		title = "no title";
	}
	
	

}
