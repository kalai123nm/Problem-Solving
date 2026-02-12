package ThamaraisnasAM;

public class PracticePolymorphism {
    
    public static void main(String[] args) {
        Vehicle v;
        v = new Scooter();
        System.out.println("Scooter Mileage: " + v.calculateMileage(120, 4));
        v = new ElectricVehicle();
        System.out.println("Electric Vehicle Mileage: " + v.calculateMileage(100, 2));
        v = new Bike();
        System.out.println("Bike Mileage: " + v.calculateMileage(150, 5));
    }
}
class Vehicle {
    double calculateMileage(double distance, double fuel) {
        return 0;
    }
}

class Scooter extends Vehicle {
    @Override
    double calculateMileage(double distance, double fuel) {
        return distance / fuel;
    }
}

class ElectricVehicle extends Vehicle {
    @Override
    double calculateMileage(double distance, double fuel) {
        return distance / fuel;
    }
}

class Bike extends Vehicle {
    @Override
    double calculateMileage(double distance, double fuel) {
        return distance / fuel;
    }
}