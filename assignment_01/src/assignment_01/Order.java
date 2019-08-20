package assignment_01;

import java.time.LocalDateTime;
import java.util.Random;

public class Order {
	final private double GST_PERCENT = 15;

	private String orderID;
	private Customer customer;
	private OrderItemList orderItemListPizza;
	private OrderItemList orderItemListSoftDrink;
	private Serve serve;
	double totalCost;
	private LocalDateTime orderedDateTime;

	public void showForList() {
		String line;

		line = "";
		line += getOrderID();
		line += " $" + getTotalCost();
		line += " Pizzas: " + getOrderItemListPizza().size();
		line += " Soft Drinks: " + getOrderItemListSoftDrink().size();
		
		System.out.println(line);
	}

	public void ask() throws OrderCancelException {
		boolean loop;

		loop = true;
		do {
			askServe();
			askCustomer();
			askPizzaBase();
			askSoftDrink();
			setTotalCost(calculateTotalCost());
			loop = confirm() != true;
		} while (loop);
	}

	/**
	 * Ask Serve.
	 * 
	 * @throws OrderCancelException
	 */
	public void askServe() throws OrderCancelException {
		String s;

		showAskBanner("Ask Serve");

		final String[] acceptStrings = {"d","p","c"};
		s = Application.getInstance().selectOption("[D]elivery or [P]ickup or [C]ancel?", acceptStrings);

		switch (s) {
		case "d":
			setServe(new Serve(Serve.TYPE_DELIVERY));
			break;
			
		case "p":
			setServe(new Serve(Serve.TYPE_PICKUP));

			getServe().setPickupTime(Application.askStringWithPrompt("Pickup time: "));
			break;
		
		case "c":
			throw new OrderCancelException();
		}

		getServe().showSummary();
	}

	/**
	 * Ask Customer.
	 * 
	 */
	public void askCustomer() {
		Customer c = new Customer();

		showAskBanner("Ask Customer");

		c.setName(Application.askStringWithPrompt("Customer's Name:"));
		c.setMobileNumber(Application.askStringWithPrompt("Customer's Mobile Number:"));
		if (getServe().getType() == Serve.TYPE_DELIVERY) {
			c.setAddress(Application.askStringWithPrompt("Customer's address:"));
		}
		setCustomer(c);

		getCustomer().showSummary();
	}

	/**
	 * Ask Pizza.
	 * 
	 * @throws OrderCancelException
	 */
	public void askPizzaBase() throws OrderCancelException {
		OrderItemList oil;

		showAskBanner("Ask Pizza Base");

		oil = Application.getInstance().getMenuItemListPizzaBase().ask();
		setOrderItemListPizza(oil);

		getOrderItemListPizza().showSummary();
	}

	/**
	 * Ask Soft Drink
	 * 
	 * @throws OrderCancelException
	 */
	public void askSoftDrink() throws OrderCancelException {
		OrderItemList oil;

		showAskBanner("Ask Soft Drink");

		oil = Application.getInstance().getMenuItemListSoftDrink().ask();
		setOrderItemListSoftDrink(oil);

	}

	/**
	 * Confirm the order.
	 * 
	 * @return
	 * @throws OrderCancelException 
	 */
	public boolean confirm() throws OrderCancelException {
		boolean result = false;
		String a = "";

		showAskBanner("Summary");

		if (getOrderItemListPizza().size() == 0 && getOrderItemListSoftDrink().size() == 0) {
			final String[] acceptStrings = {"r", "c"};
			a = Application.getInstance().selectOption("Still no order. [R]estart order or [C]ancel?", acceptStrings);
		} else {
			showSummary();

			System.out.println("");

			final String[] acceptStrings = {"y", "n", "c"};
			a = Application.getInstance().selectOption("Are you sure? [Y]es or [R]estart or [C]ancel?", acceptStrings);

			result = a.equals("y");
		}

		switch (a) {
		case "y":
			result = true;
			break;

		case "r":
			result = false;
			break;

		case "c":
			throw new OrderCancelException();
		}

		return result;
	}

	/**
	 * Show summary of the order.
	 */
	public void showSummary() {
		System.out.println("Order ID: " + getOrderID());
		getServe().showSummary();
		getCustomer().showSummary();
		getOrderItemListPizza().showSummary();
		getOrderItemListSoftDrink().showSummary();

		System.out.println("******************************************");
		System.out.println("Subtotal: " + calculateSubtotal());
		System.out.println("GST: " + calculateGst());
		System.out.println("Total cost: " + getTotalCost());
	}

	/**
	 * Show a banner for asking.
	 * 
	 * @param message A banner message.
	 */
	private void showAskBanner(String message) {
		System.out.println("==========================================");
		System.out.println("");
		System.out.println("        " + message);
		System.out.println("");
		System.out.println("==========================================");
		System.out.println("");
	}

	/**
	 * Get sub total of the order.
	 * 
	 * @return
	 */
	private double calculateSubtotal() {
		double st = 0;

		st += getServe().calculateSubtotal(); 
		st += getOrderItemListPizza().calculateSubtotal();
		st += getOrderItemListSoftDrink().calculateSubtotal();

		return st;
	}

	/**
	 * Get the total cost of the order.
	 * 
	 * This is all of sub total and GST.
	 * 
	 * @return
	 */
	private double calculateTotalCost() {
		return calculateSubtotal() + calculateGst();
	}

	/**
	 * Calculate GST
	 * 
	 * @param cost
	 * @return
	 */
	private double calculateGst() {
		double st = 0;
		
		st += getOrderItemListPizza().calculateSubtotal();
		st += getOrderItemListSoftDrink().calculateSubtotal();

		return Math.ceil(st * GST_PERCENT) / 100;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderItemList getOrderItemListPizza() {
		return orderItemListPizza;
	}

	public void setOrderItemListPizza(OrderItemList orderItemListPizza) {
		this.orderItemListPizza = orderItemListPizza;
	}

	public OrderItemList getOrderItemListSoftDrink() {
		return orderItemListSoftDrink;
	}

	public void setOrderItemListSoftDrink(OrderItemList orderItemListSoftDrink) {
		this.orderItemListSoftDrink = orderItemListSoftDrink;
	}

	public Serve getServe() {
		return serve;
	}

	public void setServe(Serve serve) {
		this.serve = serve;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public LocalDateTime getOrderedDateTime() {
		return orderedDateTime;
	}

	public void setOrderedDateTime(LocalDateTime orderedDateTime) {
		this.orderedDateTime = orderedDateTime;
	}

}
