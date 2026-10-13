// Account.java
// Abstract parent class: it holds what ALL accounts share.
// You cannot create an Account object directly (because it is abstract);
// you create SavingsAccount or CurrentAccount instead.
public abstract class Account {

    // 'protected' = visible to this class AND its subclasses
    protected String accountNumber;
    protected double balance;

    // Constructor: runs when a subclass object is created (via super(...))
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Concrete method (has a body): same behaviour for every account type
    public void deposit(double amount) {
        // Reject zero or negative deposits
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive.");
            return; // stop here, do not change the balance
        }
        balance += amount;
        System.out.println("Deposited " + amount + " into " + accountNumber
                + ". New balance: " + balance);
    }

    // Concrete method: simply returns the current balance
    public double getBalance() {
        return balance;
    }

    // Abstract methods (NO body): every subclass MUST provide its own version
    public abstract void withdraw(double amount);

    // "Hook" method: called at the end of each month, each account type
    // does something different (interest vs. fee)
    public abstract void endOfMonth();
}