public class BankAccount {
    private static String bankName = "XYZ Bank";
    private static int totalAccounts = 0; 
    private final int accountNumber;
    private String accountHolderName; 
    public BankAccount(String accountHolderName, int accountNumber) {
        // Using "this" to resolve ambiguity
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // Increment total accounts for each new instance
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayAccountDetails() { 
        // Using instanceof to check the type of the object
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 1001);
        BankAccount account2 = new BankAccount("Bob", 1002);

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        account1.displayAccountDetails();
        account2.displayAccountDetails();
    }
}
