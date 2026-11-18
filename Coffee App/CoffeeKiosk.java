import java.util.ArrayList;        
import java.util.Scanner;
public class CoffeeKiosk {

    private ArrayList<Item> menu;     
    private ArrayList<Order> orders;   

    public CoffeeKiosk() {           
        menu = new ArrayList<Item>();      
        orders = new ArrayList<Order>();    
    }

    public void addMenuItem(String name, double price) {  
    Item item = new Item();                         

    item.name = name;                               
    item.price = price;                               

    menu.add(item);                                 

    item.setIndex(menu.size() - 1);                            
}
public void displayMenu() {                       
    for (Item item : menu) {                   
        System.out.printf("%d %s -- $%.2f%n", item.getIndex(), item.name, item.price);
    }
}

public void newOrder() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter customer name for new order:");
    String name = scanner.nextLine();

    Order order = new Order();                // blank 2
    order.name = name;                       // blank 3: the name the user typed

    displayMenu();

    System.out.println("Please enter a menu item index or q to quit:");
String itemNumber = scanner.nextLine();

while (!itemNumber.equals("q")) {
    try {
        int index = Integer.parseInt(itemNumber);

        if (index >= 0 && index < menu.size()) {
            Item item = menu.get(index);
            order.items.add(item);
            order.total += item.price;
        } else {
            System.out.println("Sorry, that item is not on the menu");
        }
    } catch (NumberFormatException e) {
        System.out.println("Please enter a number or q");
    }

    System.out.println("Please enter a menu item index or q to quit:");
    itemNumber = scanner.nextLine();
}

orders.add(order);

// print the details
System.out.printf("Name: %s%n", order.name);          // blank 8
for (Item i : order.items) {
    System.out.printf("%s -- $%.2f%n", i.name, i.price);
}
System.out.printf("Total: $%.2f%n", order.total);

}



}
