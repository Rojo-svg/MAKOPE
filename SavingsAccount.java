// SavingsAccount.java
// Child of Account. Cannot go below a minimum balance. Earns interest monthly.
public class SavingsAccount extends Account {

    // Fixed minimum balance every savings account must keep ('final' = never changes)
    private final double minimumBalance = 500.0;

    // Fixed monthly interest rate: 2% (0.02)
    private final double interestRate = 0.02;

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance); // call the Account constructor
    }

    // Override the abstract method with the savings rule
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
            return;
        }
        // Would the balance fall below the minimum after withdrawing?
        if (balance - amount < minimumBalance) {
            System.out.println("Savings " + accountNumber + ": withdrawal of " + amount
                    + " REJECTED. Balance cannot go below the minimum of " + minimumBalance + ".");
        } else {
            balance -= amount;
            System.out.println("Savings " + accountNumber + ": withdrew " + amount
                    + ". New balance: " + balance);
        }
    }

    // Override the hook: add interest to the balance
    @Override
    public void endOfMonth() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Savings " + accountNumber + ": interest of " + interest
                + " added. New balance: " + balance);
    }
}