import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
public class Ex5_GradeBands {
 record Learner(String name, double mark) {
 String band() {
 if (mark >= 70) return "A";
 if (mark >= 50) return "B";
 return "C";
 }
 }
 public static void main(String[] args) {
 Path csv = Paths.get("learners.csv"); // format: name,mark (first line is a header)
 try (Stream<String> lines = Files.lines(csv)) {
 List<Learner> learners = lines
 .skip(1)
 .filter(l -> !l.isBlank())
 .map(l -> l.split(","))
 .map(p -> new Learner(p[0].trim(), Double.parseDouble(p[1].trim())))
 .collect(Collectors.toList());
 Map<String, List<Learner>> byBand = learners.stream()
 .collect(Collectors.groupingBy(Learner::band, TreeMap::new, Collectors.toList()));
 for (Map.Entry<String, List<Learner>> entry : byBand.entrySet()) {
 List<String> report = entry.getValue().stream()
 .map(l -> l.name() + " - " + l.mark())
 .collect(Collectors.toList());
 Path out = Paths.get("report_" + entry.getKey() + ".txt");
 Files.write(out, report);
 System.out.println("Wrote " + out + " (" + report.size() + " learners)");
 }
 } catch (IOException e) {
 System.out.println("File error: " + e.getMessage());
 } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
 System.out.println("Bad CSV line: " + e.getMessage());
 }
 }
}
