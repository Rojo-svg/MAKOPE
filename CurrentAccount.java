// CurrentAccount.java
// Child of Account. Can go negative (overdraft) up to a limit. Pays a monthly fee.
public class CurrentAccount extends Account {

    // How far below zero the balance may go
    private double overdraftLimit;

    // Small fixed monthly maintenance fee (no interest on current accounts)
    private final double monthlyFee = 10.0;

    public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance); // set up the shared fields
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw: balance may be negative, but not below -overdraftLimit
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
            return;
        }
        // Lowest allowed balance is the NEGATIVE of the overdraft limit
        if (balance - amount < -overdraftLimit) {
            System.out.println("Current " + accountNumber + ": withdrawal of " + amount
                    + " REJECTED. It would exceed the overdraft limit of " + overdraftLimit + ".");
        } else {
            balance -= amount;
            if (balance < 0) {
                System.out.println("Current " + accountNumber + ": withdrew " + amount
                        + ". Account is in OVERDRAFT. Balance: " + balance);
            } else {
                System.out.println("Current " + accountNumber + ": withdrew " + amount
                        + ". New balance: " + balance);
            }
        }
    }

    // Override the hook: deduct the maintenance fee
    @Override
    public void endOfMonth() {
        balance -= monthlyFee;
        System.out.println("Current " + accountNumber + ": monthly fee of " + monthlyFee
                + " deducted. New balance: " + balance);
    }
}