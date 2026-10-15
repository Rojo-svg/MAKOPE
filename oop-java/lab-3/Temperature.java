public class Temperature {
      private final double kelvin;                    // internal unit is kelvin

    private Temperature(double kelvin) {            // private: only the factories below create objects
        if (kelvin < 0) {                           // absolute zero is 0 K
            throw new IllegalArgumentException("Below absolute zero");
        }
        this.kelvin = kelvin;
    }

    public static Temperature fromCelsius(double c) {
        return new Temperature(c + 273.15);         // convert C to K, constructor validates it
    }


    public static Temperature fromFahrenheit(double f) {
        return new Temperature((f - 32) * 5 / 9 + 273.15);   // F to C to K
    }

    public double getCelsius()    { return kelvin - 273.15; }
    public double getFahrenheit() { return getCelsius() * 9 / 5 + 32; }

    public static void main(String[] args) {
        Temperature t = Temperature.fromCelsius(100);
        System.out.println(t.getCelsius());         // 100.0 (may show tiny rounding like 99.99999999999994)
        System.out.println(t.getFahrenheit());      // about 212.0
        try {

            Temperature.fromCelsius(-300);          // below -273.15, so rejected
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
