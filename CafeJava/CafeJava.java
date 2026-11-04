public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly ";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double espressoPrice = 8;
        double cappuccino = 5;
        double latte = 12;


        // Customer name variables (add yours below)
        String customer1 = "Shatha";
        String customer2 = "Ahmad";
        String customer3 = "Saly";
        String customer4 = "Adam";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder4 = false;

    

        // APP INTERACTION SIMULATION (Add your code for the chanllenges below)
        // EXAMPLE:
        System.out.println(generalGreeting + customer1); // Display "Welcome to Cafe Java, Shatha"
        System.out.println(customer3 + readyMessage);

          if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + latte *2);
        }

        
        System.out.println(customer4 + "," + displayTotalMessage + (latte - espressoPrice));

        // ** Your customer interaction print statements will go here **
    }
}
