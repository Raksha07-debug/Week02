package hierarchical_inheritance.Bank;

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
