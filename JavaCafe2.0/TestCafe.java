import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil();

        System.out.println("Streak goal: " + appTest.getStreakGoal());

        double[] prices = {3.5, 1.5, 4.0, 4.5};
        System.out.println("Order total: " + appTest.getOrderTotal(prices));

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
        }
    }
}
