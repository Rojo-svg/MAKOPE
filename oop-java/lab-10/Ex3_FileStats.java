import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Ex3_FileStats {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter file name (e.g. sample.txt): ");
 Path file = Paths.get(sc.nextLine());
 int lines = 0, words = 0, chars = 0;
 try (BufferedReader br = Files.newBufferedReader(file)) {
 String line;
 while ((line = br.readLine()) != null) {
 lines++;
 chars += line.length();
 if (!line.isBlank()) {
 words += line.trim().split("\\s+").length;
 }
 }
 System.out.println("Lines: " + lines);
 System.out.println("Words: " + words);
 System.out.println("Characters: " + chars);
 } catch (IOException e) {
 System.out.println("Could not read file: " + e.getMessage());
 }
 }
}
