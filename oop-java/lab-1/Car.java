public class Car {
    String brand;
    int year;
    double milage;

    void display() {
        System.out.println("Brand:" + brand + ",Year" + year + ", Milage:" + milage + "Km");

    }

    boolean isAntique() {
        int currentYear =java.time.Year.now().getValue();
        return (currentYear - year)>25;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.year = 2018;
        c1.milage = 85000;

        Car c2 = new Car();
        c2.brand = "Merceides";
        c2.year = 1995;
        c2.milage =21000;

        Car c3 = new Car();
        c3.brand = "Honda";
        c3.year =2022;
        c3.milage = 15000;

        c1.display();
        c2.display();
        c3.display();
        
        System.out.println(c1.brand + "antique?" + c1.isAntique());
        System.out.println(c2.brand + "antique?" + c2.isAntique());
        System.out.println(c3.brand + "antique?" + c3.isAntique());
    }
}
