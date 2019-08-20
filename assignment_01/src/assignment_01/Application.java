package assignment_01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	private static Application instance;
	private static Scanner scan;
	
	private MenuItemListPizzaBase menuItemListPizzaBase;
	private MenuItemListSoftDrink menuItemListSoftDrink;
	private ArrayList<Order> orderList;

	public static void main(String[] args) {
		setInstance(new Application());
		getInstance().run();
	}

	/**
	 * Run main loop for this application.
	 */
	public void run() {
		boolean loop;

		initialize();

		showGreetingBanner();
		
		loop = true;
		while (loop) {
			String s;
			
			final String[] acceptStrings = {"n","l","e"};
			s = selectOption("[N]ew Order, [L]ist order or [E]xit?", acceptStrings);

			switch (s) {
			case "n":
				try {
					askOrder();
				} catch (OrderCancelException e) {
					System.out.println("Order is cancelled.");
				}
				break;
				
			case "l":
				listOrder();
				break;
				
			case "e":
				loop = false;
				break;
			}
		}

		showByeBanner();
	}

	private void initialize() {
		setScan(new Scanner(System.in));
		setMenuItemListPizzaBase(new MenuItemListPizzaBase());
		setMenuItemListSoftDrink(new MenuItemListSoftDrink());
		setOrderList(new ArrayList<Order>());
	}

	private void showGreetingBanner()
	{
		System.out.println("**********************************************************");
		System.out.println("*                                                        *");
		System.out.println("*                     Hello!                             *");
		System.out.println("*                                                        *");
		System.out.println("*            This is Pizza Order System.                 *");
		System.out.println("*                                                        *");
		System.out.println("**********************************************************");
	}
	
	private void showByeBanner()
	{
		System.out.println("**********************************************************");
		System.out.println("*                                                        *");
		System.out.println("*                    Byebye!                             *");
		System.out.println("*                                                        *");
		System.out.println("*            This is Pizza Order System.                 *");
		System.out.println("*                                                        *");
		System.out.println("**********************************************************");
	}
	
	/**
	 * Select a string.
	 * 
	 * To show prompt and select a string.
	 * 
	 * @param prompt Prompt message.
	 * @param acceptStrings the list of accept string.
	 * @return a string.
	 */
	public String selectOption(String prompt, ArrayList<String> acceptStringList) {
		String[] s = acceptStringList.toArray(new String[acceptStringList.size()]);

		return selectOption(prompt, s);
	}

	/**
	 * Select a string.
	 * 
	 * To show prompt and select a string.
	 * 
	 * @param prompt Prompt message.
	 * @param acceptStrings the list of accept string.
	 * @return a string.
	 */
	public String selectOption(String prompt, String[] acceptStrings) {
		String s;
		boolean vc = false;
		do {
			s = askStringWithPrompt(prompt).toLowerCase();
			vc = false;
			for (int i = 0; i < acceptStrings.length; i++) {
				if (acceptStrings[i].equals(s)) {
					vc = true;
					break;
				}
			}
			if (vc == false) {
				System.out.println("Invalid seletion.");
			}
		} while (vc == false);
		
		return s;
	}

	/**
	 * Ask order.
	 * 
	 * @throws OrderCancelException when cancel order
	 */
	private void askOrder() throws OrderCancelException {
		Order order;

		order = new Order();
		order.setOrderID(Integer.toString(getOrderList().size()));

		order.ask();
		order.setOrderedDateTime(LocalDateTime.now());

		getOrderList().add(order);

		System.out.println("******************************");
		System.out.println("");
		System.out.println("Add order in order list.");
		System.out.println("Order ID is: " + order.getOrderID());
		System.out.println("");
	}

	/**
	 * List order.
	 */
	private void listOrder() {
		ArrayList<Order> orderList;

		orderList = getOrderList();
		System.out.println("List Order");
		if (orderList.size() == 0) {
			System.out.println("Still no order.");
		} else {
			for (int i = 0; i < orderList.size(); i++) {
				orderList.get(i).showForList();
			}
		}
	}

	/**
	 * Ask something in string.
	 * 
	 * @param prompt Prompt message.
	 * @return answer string.
	 */
	public static String askStringWithPrompt(String prompt) {
		System.out.println(prompt);
		return getScan().next();
	}

	/**
	 * Ask number in integer.
	 *
	 * @param prompt Prompt message.
	 * @param min the minimum value of range.
	 * @param max the maximum value of range.
	 * @return
	 */
	public static int askIntWithPromptAndRange(String prompt, int min, int max) {
		int result;

		do {
			result = askIntWithPrompt(prompt);
		} while (result < min || max < result);

		return result;
	}

	/**
	 * Ask number in integer.
	 * 
	 * @param prompt Prompt message.
	 * @return
	 */
	public static int askIntWithPrompt(String prompt) {
		System.out.println(prompt);
		return getScan().nextInt();
	}

	public static Application getInstance() {
		return instance;
	}

	public static void setInstance(Application instance) {
		Application.instance = instance;
	}

	public static Scanner getScan() {
		return scan;
	}

	public static void setScan(Scanner scan) {
		Application.scan = scan;
	}

	public MenuItemList getMenuItemListPizzaBase() {
		return menuItemListPizzaBase;
	}

	public void setMenuItemListPizzaBase(MenuItemListPizzaBase menuItemListPizzaBase) {
		this.menuItemListPizzaBase = menuItemListPizzaBase;
	}

	public MenuItemList getMenuItemListSoftDrink() {
		return menuItemListSoftDrink;
	}

	public void setMenuItemListSoftDrink(MenuItemListSoftDrink menuItemListSoftDrink) {
		this.menuItemListSoftDrink = menuItemListSoftDrink;
	}

	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}

}
