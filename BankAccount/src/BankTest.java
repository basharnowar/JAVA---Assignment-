public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount(100, 50);
        BankAccount account2 = new BankAccount(200, 50);
        BankAccount account3 = new BankAccount(0, 300);
        System.out.println("Total money at start: " + BankAccount.getTotalMoney());

        // Deposit Test
        account1.deposit("checking", 50);
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Total money: " + BankAccount.getTotalMoney());

        account2.deposit("savings", 100);
        System.out.println("Account 2 balance: " + account2.getBalance());
        System.out.println("Total money: " + BankAccount.getTotalMoney());

        account3.deposit("checking", 25);
        System.out.println("Account 3 balance: " + account3.getBalance());
        System.out.println("Total money: " + BankAccount.getTotalMoney());

        // Withdrawal Test
        account1.withdraw("checking", 30);
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Total money: " + BankAccount.getTotalMoney());

        account2.withdraw("savings", 50);
        System.out.println("Account 2 balance: " + account2.getBalance());
        System.out.println("Total money: " + BankAccount.getTotalMoney());

        account3.withdraw("checking", 500); // more than the balance, should be refused
        System.out.println("Account 3 balance: " + account3.getBalance());
        System.out.println("Total money: " + BankAccount.getTotalMoney());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Number of accounts: " + BankAccount.getAccounts());
        System.out.println("Total money: " + BankAccount.getTotalMoney());
    }

    	
    	
        // Create 3 bank accounts

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        // Static Test (print the number of bank accounts and the totalMoney)

    }
