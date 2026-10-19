 class InsufficientFundsException extends Exception {   // your lines 1-3, unchanged
    public InsufficientFundsException(String msg) { super(msg); }
}

public class BankDemo {                                // ADD

    private double balance;                            // ADD: the field withdraw uses

    public BankDemo(double balance) {                  // ADD: sets the starting balance
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {  // your lines 5-9, unchanged

        if (amount > balance)
            throw new InsufficientFundsException("Balance " + balance + ", requested " + amount);
        balance -= amount;
    }

    public static void main(String[] args) {           // ADD
        BankDemo acc = new BankDemo(100);
        try {
            acc.withdraw(30);                          // ok, balance becomes 70
            System.out.println("Withdrew 30");
            acc.withdraw(500);                         // too much, throws
        } catch (InsufficientFundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

}                                                      // ADD
