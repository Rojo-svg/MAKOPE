// BankDemo.java
// Contains main(). Demonstrates POLYMORPHISM: we only use the Account type,
// yet Java runs the correct overridden method for each real object.
import java.util.ArrayList;
import java.util.List;

public class BankDemo {

    public static void main(String[] args) {

        // A list of Account references holding a MIX of subclasses
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV-001", 1000.0));       // will be rejected below
        accounts.add(new CurrentAccount("CUR-001", 300.0, 1000.0)); // will go into overdraft
        accounts.add(new SavingsAccount("SAV-002", 2000.0));       // withdrawal allowed
        accounts.add(new CurrentAccount("CUR-002", 500.0, 200.0));  // rejected: past overdraft limit

        // Test deposit rules
        System.out.println("=== Deposits ===");
        accounts.get(0).deposit(100.0);  // valid deposit
        accounts.get(0).deposit(-50.0);  // rejected (non-positive)

        // POLYMORPHIC LOOP: withdraw() through the Account reference only (no casting)
        System.out.println("\n=== Withdrawals (polymorphic loop) ===");
        for (Account acc : accounts) {
            acc.withdraw(800.0); // each object runs ITS OWN withdraw()
        }

        // Another polymorphic loop for the month-end processing
        System.out.println("\n=== End of month ===");
        for (Account acc : accounts) {
            acc.endOfMonth(); // interest for savings, fee for current
        }

        // Print final balances
        System.out.println("\n=== Final balances ===");
        for (Account acc : accounts) {
            System.out.println(acc.getClass().getSimpleName() + ": " + acc.getBalance());
        }

        // Edge cases explained:
        // SAV-001: 1100 - 800 = 300 < 500 minimum  -> REJECTED (Edge case 1)
        // CUR-001: 300 - 800 = -500, limit is 1000 -> ALLOWED, goes into overdraft (Edge case 2)
        // CUR-002: 500 - 800 = -300, limit is 200  -> REJECTED
    }
}