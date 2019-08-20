package assignment_01;

public class MenuItemListSoftDrinkSize extends MenuItemList {

	public MenuItemListSoftDrinkSize() {
		super("Soft Drink Size");
		
		add(new MenuItem("S", 0.00, 1));
		add(new MenuItem("M", 0.50, 1));
		add(new MenuItem("L", 1.00, 1));
		setMaxOrder(1);
	}
}
