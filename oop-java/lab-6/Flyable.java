public interface Flyable {
    void fly();                                // implicitly public abstract
}

class Bird implements Flyable {
    public void fly() {                        // must be public, interface methods are public
        System.out.println("Bird flaps its wings");
    }
}

class Aeroplane implements Flyable {
    public void fly() {
        System.out.println("Aeroplane uses engines");
    }
} 
