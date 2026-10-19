abstract class Account {
    protected double balance;                  // visible to subclasses

    void deposit(double amt) {                 // concrete: shared by all accounts
        balance += amt;                        // add money to balance
    }
    abstract double monthlyFee();              // 
}

class SavingsAccount extends Account {
    double monthlyFee() { return 0; }          // savings: no fee
}

class CurrentAccount extends Account {
    double monthlyFee() { return 10; }         // current: flat fee
}
