package assignment_01;

public class MenuItem extends Item {
	private double listPrice;
	private int maxQuantity;
	private MenuItemList childMenuItemList;

	public MenuItem(String name, double listPrice, int maxQuantity) {
		super(name);

		setListPrice(listPrice);
		setMaxQuantity(maxQuantity);
	}

	public MenuItem(String name, double listPrice, int maxQuantity, MenuItemList childMenuItemList) {
		super(name);

		setListPrice(listPrice);
		setMaxQuantity(maxQuantity);
		setChildMenuItemList(childMenuItemList);
	}

	public OrderItem createOrderItem(int quantity) {
		return new OrderItem(this, quantity);
	}

	public String toString() {
		return getName() + " " + getListPrice();
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public MenuItemList getChildMenuItemList() {
		return childMenuItemList;
	}

	public void setChildMenuItemList(MenuItemList childMenuItemList) {
		this.childMenuItemList = childMenuItemList;
	}

}
