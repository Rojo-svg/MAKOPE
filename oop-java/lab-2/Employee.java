public class Employee {
    private static int nextId = 1;
    private final int employeeId;
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary){
        this.employeeId = nextId++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public Employee(String name, double salary){
        this(name, "general", salary);
    }

    public Employee(String name) {
        this(name, 0.0);
    }
    
    public Employee(Employee other){
        this(other.name, other.department, other.salary);
    }
    
    public void display(){
        System.out.println("ID" + employeeId + ":" + name + "," + department + ",$" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Tatenda","IT",2500);
        Employee e2 = new Employee("Rudo",1800);
        Employee e3 = new Employee("Farai");
        Employee e4 = new Employee(e1);
        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }

}
