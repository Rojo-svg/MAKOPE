 public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", "Tendai", 500.00);

        acc.deposit(250.00);
        acc.withdraw(100.00);
        System.out.println(acc);

        System.out.println(acc.getHistory());

        try {
            acc.getHistory().add("Hacked");
        } catch (UnsupportedOperationException e) {
            System.out.println("History is protected");
        }
    }

} 
