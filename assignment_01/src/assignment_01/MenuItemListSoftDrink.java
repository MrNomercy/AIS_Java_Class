package assignment_01;

public class MenuItemListSoftDrink extends MenuItemList {

	public MenuItemListSoftDrink() {
		super("Soft Drink");

		MenuItemList sizeMenuItemList;

		sizeMenuItemList = new MenuItemListSoftDrinkSize();

		add(new MenuItem(
				"Coca Cola",
				3.00,
				5,
				sizeMenuItemList));

		add(new MenuItem(
				"Dr Pepper",
				3.00,
				5,
				sizeMenuItemList));

		add(new MenuItem(
				"L&P",
				3.00,
				5,
				sizeMenuItemList));

		add(new MenuItem(
				"Orange Juice",
				5.00,
				5,
				sizeMenuItemList));

		add(new MenuItem(
				"Apple Juice",
				5.00,
				5,
				sizeMenuItemList));
	}

}
