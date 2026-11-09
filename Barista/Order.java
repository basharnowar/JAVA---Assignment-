import java.util.ArrayList;

public class Order {

    // ---------- MEMBER VARIABLES ----------
    private String name;
    private boolean ready;
    private ArrayList<Item> items;


    // ---------- CONSTRUCTORS ----------
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }


    // ---------- GETTERS & SETTERS ----------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;               // return the FIELD — "return isReady();" would call itself forever
    }

    public void setReady(boolean ready) {   // void = returns nothing, boolean = true/false
        this.ready = ready;                 // store the value into the field
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


    // ---------- ORDER METHODS ----------
    public void addItem(Item item) {
        items.add(item);
    }

    public String getStatusMessage() {
        if (ready) {
            return "Your order is ready.";
        } else {                    // else has NO condition — it means "every other case"
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {         // void — it prints, it doesn't return
        System.out.println("Customer Name: " + name);
        for (Item item : items) {
            // item = ONE coffee in the list -> ask it for its name and price with the getters
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());   // reuse the method, don't recalculate
    }
}
