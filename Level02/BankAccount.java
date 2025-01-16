public class BankAccount {
    // Fields to store the account holder's name, account number, and balance
    String accountHolder; 
    int accountNumber;
    double balance;

    // Constructor to initialize the bank account details
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber; // Typo fixed
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful, your balance is " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    } 

    // Method to withdraw money from the account if sufficient balance exists
    public void withdraw(double amount) { // Removed static keyword
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful, new balance is " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Method to display the current balance
    public void displayBalance() { 
        System.out.println("Current balance: " + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jane Doe", 12345, 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayBalance();
        account.withdraw(1500.0);
    }
}
