package assignment_01;

public class MenuItemListPizzaTopping extends MenuItemList {

	public MenuItemListPizzaTopping() {
		super("Pizza Topping");

		add(new MenuItem("Pepper", 0.10, 3));
		add(new MenuItem("Cheese", 1.00, 3));
		add(new MenuItem("Chiken", 2.00, 3));
		add(new MenuItem("Pineappple", 1.00, 3));
	}

}
