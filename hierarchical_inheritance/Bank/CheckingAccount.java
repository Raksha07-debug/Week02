package hierarchical_inheritance.Bank;

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
 
    public CheckingAccount(int var1, double var2, double var4) {
       super(var1, var2);
       this.withdrawalLimit = var4;
    }
 
    public void displayAccountType() {
       super.displayAccountType();
       System.out.println("This is a Checking Account");
       System.out.println("the withdrawal limit is " + this.withdrawalLimit);
    }
 }
 
