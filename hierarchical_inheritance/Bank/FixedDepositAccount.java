package hierarchical_inheritance.Bank;

class FixedDepositAccount extends BankAccount {
    private double tenure;
 
    public FixedDepositAccount(int var1, double var2, double var4) {
       super(var1, var2);
       this.tenure = var4;
    }
 
    public void displayAccountType() {
       super.displayAccountType();
       System.out.println("This is a Fixed Deposit Account");
       System.out.println("the tenure is " + this.tenure);
    }
 }
 