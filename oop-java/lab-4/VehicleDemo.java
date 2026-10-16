class Vehicle {                         // Top of the chain
    Vehicle() {                         // Vehicle constructor
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle {             // Car IS-A Vehicle
    Car() {                             // Java silently inserts super() here first
        System.out.println("Car constructor");
    }
}

class ElectricCar extends Car {         // ElectricCar IS-A Car (multilevel)
    ElectricCar() {                     // super() is called first, going up the chain

        System.out.println("ElectricCar constructor");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        new ElectricCar();              // creating one object triggers all three constructors
    }
}