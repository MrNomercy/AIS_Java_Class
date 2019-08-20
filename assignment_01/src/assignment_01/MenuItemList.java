package assignment_01;

import java.util.ArrayList;

public class MenuItemList extends ArrayList<MenuItem> {	
	private String genre;
	private int maxOrder;

	public MenuItemList(String genre) {
		setGenre(genre);
		setMaxOrder(10);
	}

	/**
	 * Ask menu order.
	 *  
	 * @return
	 * @throws OrderCancelException
	 */
	public OrderItemList ask() throws OrderCancelException {
		boolean loop;
		OrderItemList oil;

		oil = new OrderItemList(getGenre());

		loop = true;
		do {
			String select;

			System.out.println("====================================");
			System.out.println("    Please choose " + getGenre());
			System.out.println("====================================");
			System.out.println("");

			showMenuList();

			select = selectMenu();
			switch (select) {
			case "c":
				throw new OrderCancelException();

			case "n":
				loop = false;
				break;

			case "l":
				showOrderItemList(oil);
				break;

			default:
				int i;
				i = Integer.parseInt(select);

				if (0 <= i && i < size()) {
					MenuItem menuItem;
					MenuItemList cmil;
					OrderItem oi;
					OrderItemList coil;
					int q;

					menuItem = get(i);
					q = menuItem.getMaxQuantity() == 1 ? 1 : askQuantity(menuItem.getMaxQuantity());
					oi = menuItem.createOrderItem(q);

					System.out.println("Selected menu is: " + oi.getName() + " (" + q + " item(s)");
					cmil = menuItem.getChildMenuItemList();
					if (cmil != null) {
						coil = cmil.ask();
						oi.setChildOrderItemList(coil);
					}
					oil.add(oi);
					if (getMaxOrder() <= size() ) {
						loop = false;
					}
				}
			}
		} while (loop);

		return oil;
	}

	private void showOrderItemList(OrderItemList orderItemList) {
		orderItemList.showList();
	}

	private void showMenuList() {
		for (int i = 0; i < this.size(); i++) {
			System.out.println("[" + i + "] ... " + get(i));
		}
	}

	private int askQuantity(int max) {
		int result;

		result = Application.askIntWithPromptAndRange("How many item (1 .. " + max + ")?", 1, max);
		
		return result;
		}

	private String selectMenu() {
		String result;
		String prompt;
		ArrayList<String> acceptStringList;
		
		acceptStringList = new ArrayList<String>();
		for (int i = 0; i < this.size(); i++) {
			acceptStringList.add(Integer.toString(i));
		}

		prompt = "Select item number ([0] .. [" + (this.size() - 1) + "]), ";
		acceptStringList.add("n");
		acceptStringList.add("c");
		if (1 < getMaxOrder()) {
			acceptStringList.add("l");
			prompt += "[L]ist Choices, ";
		}
		prompt += "[N]ext Step or [C]ancel Order. Which one?";

		result = Application.getInstance().selectOption(
					prompt,
					acceptStringList);

		return result;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getMaxOrder() {
		return maxOrder;
	}

	public void setMaxOrder(int maxOrder) {
		this.maxOrder = maxOrder;
	}

}
