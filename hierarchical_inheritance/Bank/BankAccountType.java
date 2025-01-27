package hierarchical_inheritance.Bank;

class BankAccountType {
    BankAccountType() {
    }
 
    public static void main(String[] var0) {
       SavingsAccount var1 = new SavingsAccount(12345, 10000.0, 0.05);
       var1.displayAccountType();
       FixedDepositAccount var2 = new FixedDepositAccount(67890, 20000.0, 5.0);
       var2.displayAccountType();
       CheckingAccount var3 = new CheckingAccount(11111, 5000.0, 5000.0);
       var3.displayAccountType();
    }
 }
 