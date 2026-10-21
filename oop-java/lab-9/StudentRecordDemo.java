record Student(String name, int age) { }

public class StudentRecordDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Tawanda", 20);
        Student s2 = new Student("Tawanda", 20);
        Student s3 = new Student("Ada", 22);

        System.out.println(s1);                        // Student[name=Tawanda, age=20]
        System.out.println(s1.equals(s2));             // true  (same values)
        System.out.println(s1 == s2);                  

// false (different objects)
        System.out.println(s1.equals(s3));             // false
        System.out.println("Name: " + s1.name());      // read a component
        System.out.println("Age: " + s1.age());
    }
}
