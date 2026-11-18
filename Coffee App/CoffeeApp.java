public class CoffeeApp {
    public static void main(String[] args) {

        CoffeeKiosk kiosk = new CoffeeKiosk();              // blank 1: make a kiosk

        kiosk.addMenuItem("banana", 2.00);                  // blank 2: add a menu item (step 3 method)
        kiosk.addMenuItem("late", 12.00);                  // blank 2: add a menu item (step 3 method)
        kiosk.addMenuItem("apple", 5.00);                  // blank 2: add a menu item (step 3 method)
        // add 2-3 more items the same way

        kiosk.newOrder();                                // blank 3: start taking an order (step 5 method)
        kiosk.newOrder();                                // blank 3: start taking an order (step 5 method)
        kiosk.newOrder();                                // blank 3: start taking an order (step 5 method)
        kiosk.newOrder();                                // blank 3: start taking an order (step 5 method)
    }
}
