public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount (double checkingBalance, double savingsBalance){
    	accounts += 1;
    	this.checkingBalance = checkingBalance;
    	this.savingsBalance = savingsBalance;
    	totalMoney += checkingBalance + savingsBalance; 
    	
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
    	return checkingBalance;
    	
    }
    
    public double getSavingsBalance() {
    	return savingsBalance; 
    }
    
    public static int getAccounts() {
    	return accounts;
    }
    
    public static double getTotalMoney() {
    	return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void deposit(String type, double amount) {     
        if (type.equals("checking")) {
            this.checkingBalance += amount;
            totalMoney += amount;                          
        } else if (type.equals("savings")) {
            this.savingsBalance += amount;
            totalMoney += amount;                         
        } else {
            System.out.println("Unknown account type: " + type);
        }
    }
    
 
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    
    public void withdraw(String type, double amount) {     
        if (type.equals("checking")) {
            if (this.checkingBalance >= amount) {
                this.checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in checking");
            }
        } else if (type.equals("savings")) {
            if (this.savingsBalance >= amount) {
                this.savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in savings");
            }
        } else {
            System.out.println("Unknown account type: " + type);
        }
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getBalance() {
    	return checkingBalance + savingsBalance;
    }
}
