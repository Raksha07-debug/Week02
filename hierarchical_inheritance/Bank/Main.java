package hierarchical_inheritance.Bank;

class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, 10000, 0.05);
        sa.displayAccountType();

        FixedDepositAccount fda = new FixedDepositAccount(67890, 20000, 5);
        fda.displayAccountType();

        CheckingAccount ca = new CheckingAccount(11111, 5000, 5000);
        ca.displayAccountType();
    }
}
