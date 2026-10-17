class Employee {
    String name;
    Employee(String name) { this.name = name; }

    double pay() { return 0; }
}
class FullTime extends Employee {
    double salary;
    FullTime(String name, double salary) { super(name); this.salary = salary; }
    @Override
    double pay() { return salary; }
}
class PartTime extends Employee {
    double rate; int hours;
    PartTime(String name, double rate, int hours) {
        super(name); this.rate = rate; this.hours = hours;
    }
    @Override
    double pay() { return rate * hours; }
}
class Intern extends Employee {
    double stipend;

    Intern(String name, double stipend) { super(name); this.stipend = stipend; }
    @Override
    double pay() { return stipend; }
}

public class PayrollDemo {
    public static void main(String[] args) {
        Employee[] staff = {
            new FullTime("Tawanda", 1200),
            new PartTime("Rudo", 10, 40),
            new Intern("Tino", 300)
        };
        double total = 0;
        for (Employee e : staff) {
            total += e.pay();
        }
        System.out.println("Total payroll: " + total);
    }
}

