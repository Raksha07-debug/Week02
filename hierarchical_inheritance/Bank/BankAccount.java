package hierarchical_inheritance.Bank;

// Base class that represents a Bank Account
class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor to initialize a bank account
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display common account details
    public void displayAccountType() {
       
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Derived class that represents a Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor to initialize a savings account
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Overriding the display method to include interest rate
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("This is a Savings Account");
        System.out.println("Interest Rate: " + interestRate);
    }
}

// Derived class that represents a Checking Account
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor to initialize a checking account
    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding the display method to include withdrawal limit
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("This is a Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

// Derived class that represents a Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    private double tenure;

    // Constructor to initialize a fixed deposit account
    public FixedDepositAccount(int accountNumber, double balance, double tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    // Overriding the display method to include tenure
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("This is a Fixed Deposit Account");
        System.out.println("Tenure: " + tenure + " years");
    }
}

// Main class to test the account types
class BankAccountType {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, 10000, 0.05);
        sa.displayAccountType();

        FixedDepositAccount fda = new FixedDepositAccount(67890, 20000, 5);
        fda.displayAccountType();

        CheckingAccount ca = new CheckingAccount(11111, 5000, 5000);
        ca.displayAccountType();
    }
}
