 public class Temperature {
    private final double celsius;                  // stored internally in Celsius

    private Temperature(double celsius) {          // PRIVATE: outsiders cannot use new
        this.celsius = celsius;
    }

    public static Temperature fromCelsius(double c) {
        return new Temperature(c);                 // already Celsius, store as is
    }

    public static Temperature 

fromFahrenheit(double f) {
        return new Temperature((f - 32) * 5 / 9);  // convert F to C first
    }

    public double getCelsius()    { return celsius; }
    public double getFahrenheit() { return celsius * 9 / 5 + 32; }

    public static void main(String[] args) {
        Temperature t1 = Temperature.fromCelsius(100);
        Temperature t2 = Temperature.fromFahrenheit(32);
        System.out.println(t1.getFahrenheit());    // 212.0
        System.out.println(t2.getCelsius());       // 0.0
    }
}





