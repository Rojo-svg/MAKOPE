import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Ex1_SaveLines {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Path file = Paths.get("lines.txt");
 List<String> lines = new ArrayList<>();
 for (int i = 1; i <= 5; i++) {
 System.out.print("Enter line " + i + ": ");
 lines.add(sc.nextLine());
 }
 try {
 Files.write(file, lines); // save
 System.out.println("\nSaved. Reading back:");
 for (String line : Files.readAllLines(file)) { // read back
 System.out.println(line);
 }
 } catch (IOException e) {
 System.out.println("File error: " + e.getMessage());
 }
 }
}