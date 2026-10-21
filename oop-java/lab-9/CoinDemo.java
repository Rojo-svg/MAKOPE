import java.util.*;

enum Coin {

    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private final int value;

    Coin(int value) { this.value = value; }

    public int getValue() { return value; }

    // Greedy: use as many of the biggest coin as possible, then the next, etc.
    public static Map<Coin, Integer> fewestCoins(int amount) {
        Map<Coin, Integer> result = new LinkedHashMap<>();
        Coin[] coins = Coin.values();
        for (int i = coins.length - 1; i >= 0; i--) {   // QUARTER down to PENNY
            int count = amount / coins[i].value;
            if (count > 0) {
                result.put(coins[i], count);

                amount = amount % coins[i].value;       // what is left over
            }
        }
        return result;
    }
}

public class CoinDemo {
    public static void main(String[] args) {
        int amount = 87;
        Map<Coin, Integer> result = Coin.fewestCoins(amount);

        System.out.println("Amount: " + amount);
        int total = 0;
        for (Map.Entry<Coin, Integer> e : result.entrySet()) {
            System.out.println(e.getKey() + " x " + e.getValue());

            total += e.getValue();
        }
        System.out.println("Total coins: " + total);
    }
}