public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item3 = new Item("drip coffee", 1.5);
        Item item4 = new Item("capuccino", 3.5);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Rami");
        Order order4 = new Order("Jimmy");
        


    
        order1.addItem(item1);
        order2.addItem(item2);
        order3.addItem(item3);
        order4.addItem(item4);
    


        
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getStatusMessage());

        System.out.println(order1.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        
    }
}
