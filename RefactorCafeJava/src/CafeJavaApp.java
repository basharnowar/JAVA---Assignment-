import java.util.ArrayList;
import java.util.Scanner;

public class CafeJavaApp {
	public static void main(String[] args) {
		CoffeeKiosk kiosk = new CoffeeKiosk();

		kiosk.addMenuItem("banana", 2.00);
		kiosk.addMenuItem("coffee", 1.50);
		kiosk.addMenuItem("latte", 4.50);
		kiosk.addMenuItem("cappuccino", 3.00);
		kiosk.addMenuItem("muffin", 4.00);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Cafe Java!");
		System.out.println("Press Enter to create an order or q to exit:");
		String command = scanner.nextLine();

		while (!command.equals("q")) {
			kiosk.newOrder(scanner);

			System.out.println("Press Enter to create another order or q to exit:");
			command = scanner.nextLine();
		}

		System.out.println("Goodbye!");
		scanner.close();
	}
}

class Item {
	private int index;
	private String name;
	private double price;

	public Item(int index, String name, double price) {
		this.index = index;
		this.name = name;
		this.price = price;
	}

	public int getIndex() {
		return this.index;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}
}

class Order {
	private String customerName;
	private ArrayList<Item> items = new ArrayList<Item>();

	public Order(String customerName) {
		this.setCustomerName(customerName);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public ArrayList<Item> getItems() {
		return items;
	}
}

class CoffeeKiosk {
	public ArrayList<Item> menu = new ArrayList<Item>();
	public ArrayList<Order> orders = new ArrayList<Order>();

	public void addMenuItem(String name, double price) {
		Item item = new Item(menu.size(), name, price);
		menu.add(item);
	}

	public void displayMenu() {
		for (Item item : menu) {
			System.out.printf("%d %s -- $%.2f%n", item.getIndex(), item.getName(), item.getPrice());
		}
	}

	public void newOrder(Scanner scanner) {
		System.out.println("Please enter customer name:");
		String name = scanner.nextLine();
		Order order = new Order(name);

		collectItems(scanner, order);

		orders.add(order);

		printReceipt(order);
	}

	private void collectItems(Scanner scanner, Order order) {
		displayMenu();
		System.out.println("Please enter a menu item index or q to finish:");
		String choice = scanner.nextLine();

		while (!choice.equals("q")) {
			int itemIndex = Integer.parseInt(choice);
			Item selectedItem = menu.get(itemIndex);
			order.addItem(selectedItem);

			System.out.println("Added: " + selectedItem.getName());
			System.out.println("Please enter a menu item index or q to finish:");
			choice = scanner.nextLine();
		}
	}

	private void printReceipt(Order order) {
		double total = 0.0;
		System.out.println("Order for " + order.getCustomerName() + ":");

		for (Item item : order.getItems()) {
			System.out.printf("%s - $%.2f%n", item.getName(), item.getPrice());
			total += item.getPrice();
		}

		System.out.printf("Total: $%.2f%n", total);
	}
}