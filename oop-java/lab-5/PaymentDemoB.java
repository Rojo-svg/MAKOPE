 abstract class PaymentB {
    abstract void process();
}
class CardPaymentB extends PaymentB {
    @Override
    void process() { System.out.println("Charging card"); }
}

class MobileMoneyPaymentB extends PaymentB {
    @Override
    void process() { System.out.println("Sending mobile money"); }
}

public class PaymentDemoB {
    public static void main(String[] args) {
        PaymentB[] payments = { new CardPaymentB(), new MobileMoneyPaymentB() };
        for (PaymentB p : payments) {
            p.process();
        }
    }
}
