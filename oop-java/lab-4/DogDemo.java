class Animal {
    Animal(String name) {               
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {                  
        super(name);                    
    }
}

public class DogDemo {

    public static void main(String[] args) {
        new Dog("Rex");                
    }
}