class Payment {}

class CardPayment extends Payment {
    void chargeCard() { System.out.println("Charging card"); }
}
class MobileMoneyPayment extends Payment {
    void sendMobileMoney() { System.out.println("Sending mobile money"); }
}

class PaymentProcessor {
    static void pay(Payment p) {
        if (p instanceof CardPayment c) {
            c.chargeCard();
        } else if (p instanceof MobileMoneyPayment m) {
            m.sendMobileMoney();
        } else {
            System.out.println("Unknown payment type");

        }
    }
}

public class PaymentDemoA {
    public static void main(String[] args) {
        PaymentProcessor.pay(new CardPayment());
        PaymentProcessor.pay(new MobileMoneyPayment());
    }
}





































