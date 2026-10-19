import java.util.*;

class Student implements Comparable<Student> { // natural order defined by compareTo
    String name;
    int marks;
    Student(String name, int marks) { 

this.name = name; this.marks = marks; }

    @Override
    public int compareTo(Student other) {      // negative, zero or positive result
        return this.name.compareTo(other.name);// sort alphabetically by name
    }
    @Override
    public String toString() { return name + "(" + marks + ")"; }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student[] s = { new Student("Chenai", 82), new Student("Anesu", 70) };
        Arrays.sort(s);                        // uses compareTo, so sorted by name
        

System.out.println(Arrays.toString(s));// [Anesu(70), Chenai(82)]

        Comparator<Student> byMarks =          // a separate, alternative ordering
            (a, b) -> Integer.compare(a.marks, b.marks);
        Arrays.sort(s, byMarks);               // sorted by marks, ascending
        System.out.println(Arrays.toString(s));// [Anesu(70), Chenai(82)]
    }
}
