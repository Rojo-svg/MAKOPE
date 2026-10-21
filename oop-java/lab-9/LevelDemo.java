enum Level { LOW, MEDIUM, HIGH }

public class LevelDemo {

    static void advice(Level level) {
        switch (level) {
            case LOW -> System.out.println("LOW: Relax, everything is under control.");
            case MEDIUM -> System.out.println("MEDIUM: Stay alert and keep monitoring.");
            case HIGH -> System.out.println("HIGH: Take action immediately!");
        }
    }

    public static void main(String[] args) {
        for (Level l : Level.values()) {      // loop through every enum constant
            advice(l);
        }
    }
}