import java.util.*;
import java.util.stream.*;
public class Ex4_AboveAverage {
 record Student(String name, double mark) { }
 public static void main(String[] args) {
 List<Student> students = List.of(
 new Student("Tawanda", 72),
 new Student("Chipo", 58),
 new Student("Farai", 85),
 new Student("Rudo", 45),
 new Student("Blessing", 66),
 new Student("Anesu", 90)
 );
 double avg = students.stream()
 .mapToDouble(Student::mark)
 .average()
 .orElse(0);
 System.out.printf("Class average: %.2f%n", avg);
 System.out.println("Above average (A-Z):");
 students.stream()
 .filter(s -> s.mark() > avg)
 .map(Student::name)
 .sorted()
 .forEach(System.out::println);
 }
}
