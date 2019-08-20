package assignment_01;

public class MenuItemListPizzaBase extends MenuItemList {
	final private double BASE_LIST_PRICE = 10;

	public MenuItemListPizzaBase() {
		super("Pizza Base");

		MenuItemList toppingMenuItemList;

		toppingMenuItemList = new MenuItemListPizzaTopping();

		add(new MenuItem(
				"Thin Pizza",
				BASE_LIST_PRICE,
				5,
				toppingMenuItemList));

		add(new MenuItem(
				"Thick Pizza",
				BASE_LIST_PRICE * 2,
				5,
				toppingMenuItemList));

	}

}
