public class VehiclesQ01{
    public static void main(String[] args) {

        Audi auddi=new Audi(120000, 5, 6, "Diesel", "2025 A4",65.00,5000000.00);
        Ford fordd=new Ford(0, 0, 0, null,null, 67.00,300000.00);
        Bajaj bajajj=new  Bajaj(0, 0, null, null, 0, null, 45.00,100000.00);
        TVS tvs=new TVS(0, 0, null, null, 0, null,50.00,90000.00);
    }
}
class Vehicle{
    double mileage;
    double price;

    Vehicle(double mileage,double price){
        this.mileage=mileage;
        this.price=price;
    }
}

class Car extends Vehicle{
    
    int ownwershipCost;
    int warrenty;
    int seatingCapacity;
    String fuelType;
    Car(int ownwershipCost, int warrenty, int seatingCapacity, String fuelType,double mileage,double price){
        super(mileage,price);
        this.ownwershipCost=ownwershipCost;
        this.warrenty=warrenty;
        this.seatingCapacity=seatingCapacity;
        this.fuelType=fuelType;
    } 
}
class Bike extends Vehicle{
    int noOfCylinders;
    int noOfGears;
    String coolingType;
    String wheelType;
    float fuelTankSize;
    Bike(int noOfCylinders, int noOfGears, String coolingType, String wheelType, float fuelTankSize, String makeType,double mileage,double price){
        super(mileage, price);
        this.noOfCylinders=noOfCylinders;
        this.noOfGears=noOfGears;
        this.coolingType=coolingType;
        this.wheelType=wheelType;
        this.fuelTankSize=fuelTankSize;
    }
}
class Audi extends Car{
    String modelType;
    // void methodAudi(int ownwershipCost, int warrenty, int seatingCapacity, String fuelType, String modelType){
    //     this.modelType=modelType;
    //     super.ownwershipCost=ownwershipCost;
    //     super.warrenty=warrenty;
    //     super.seatingCapacity=seatingCapacity;
    //     this.fuelType=fuelType;

    //     System.out.println("Audi car: \nModel Type: "+modelType+"\nOwnershipCost: "+ownwershipCost+"\nWarrenty: "+warrenty+"\nSeating Capacity: "+seatingCapacity+"\nFuel Type: "+fuelType+"\n");
    // }

    Audi(int ownwershipCost, int warrenty, int seatingCapacity, String fuelType, String modelType,double mileage,double price){
        super(ownwershipCost, warrenty, seatingCapacity, fuelType, mileage, price);
        this.modelType=modelType;
        System.out.println("Audi car: \nModel Type: "+modelType+"\nOwnershipCost: "+ownwershipCost+"\nWarrenty: "+warrenty+"\nSeating Capacity: "+seatingCapacity+"\nFuel Type: "+fuelType+"\nMileage: "+mileage+"\nPrice: "+price+"\n");
    }
}
class Ford extends Car{
    String modelType;
    // void methodFord(int ownwershipCost, int warrenty, int seatingCapacity, String fuelType, String modelType){
    //     this.modelType=modelType;
    //     this.ownwershipCost=ownwershipCost;
    //     this.warrenty=warrenty;
    //     this.seatingCapacity=seatingCapacity;
    //     this.fuelType=fuelType;

    //     System.out.println("Ford car: \nModel Type: "+modelType+"\nOwnershipCost: "+ownwershipCost+"\nWarrenty: "+warrenty+"\nSeating Capacity: "+seatingCapacity+"\nFuel Type: "+fuelType+"\n");
    // }

    Ford(int ownwershipCost, int warrenty, int seatingCapacity, String fuelType, String modelType,double mileage,double price){
        super(ownwershipCost,warrenty,seatingCapacity, modelType, price, price);
        this.modelType=modelType;
        System.out.println("Ford car: \nModel Type: "+modelType+"\nOwnershipCost: "+ownwershipCost+"\nWarrenty: "+warrenty+"\nSeating Capacity: "+seatingCapacity+"\nFuel Type: "+fuelType+"\nMileage: "+mileage+"\nPrice: "+price+"\n");
    }
}
class Bajaj extends Bike{
    String makeType;
    // void methodBajaj(int noOfCylinders, int noOfGears, String coolingType, String wheelType, float fuelTankSize, String makeType){
        // this.noOfCylinders=noOfCylinders;
        // this.noOfGears=noOfGears;
        // this.coolingType=coolingType;
        // this.wheelType=wheelType;
        // this.fuelTankSize=fuelTankSize;
    //     this.makeType=makeType;

    //     System.out.println("Bajaj Bike: \nNumber of cylinders: "+noOfCylinders+"\nNumber of gears: "+noOfGears+"\nCooling Type: "+coolingType+"\nWheel Type: "+wheelType+"\nFuel Tank Size: "+fuelTankSize+"\nMake Type: "+makeType+"\n");
    // }

    Bajaj(int noOfCylinders, int noOfGears, String coolingType, String wheelType, float fuelTankSize, String makeType,double mileage,double price){
        super(noOfCylinders, noOfGears, coolingType, wheelType, fuelTankSize, makeType, mileage, price);
        this.makeType=makeType;
        System.out.println("Bajaj Bike: \nNumber of cylinders: "+noOfCylinders+"\nNumber of gears: "+noOfGears+"\nCooling Type: "+coolingType+"\nWheel Type: "+wheelType+"\nFuel Tank Size: "+fuelTankSize+"\nMake Type: "+makeType+"\nMileage: "+mileage+"\nPrice: "+price+"\n");
    }
}
class TVS extends Bike{
    String makeType;
    // void methodTVS(int noOfCylinders, int noOfGears, String coolingType, String wheelType, float fuelTankSize, String makeType){
    //     this.noOfCylinders=noOfCylinders;
    //     this.noOfGears=noOfGears;
    //     this.coolingType=coolingType;
    //     this.wheelType=wheelType;
    //     this.fuelTankSize=fuelTankSize;
    //     this.makeType=makeType;

    //     System.out.println("TVS Bike: \nNumber of cylinders: "+noOfCylinders+"\nNumber of gears: "+noOfGears+"\nCooling Type: "+coolingType+"\nWheel Type: "+wheelType+"\nFuel Tank Size: "+fuelTankSize+"\nMake Type: "+makeType+"\n");
    // }
    TVS(int noOfCylinders, int noOfGears, String coolingType, String wheelType, float fuelTankSize, String makeType,double mileage,double price){
        super(noOfCylinders, noOfGears, coolingType, wheelType, fuelTankSize, makeType, mileage, price);
        this.makeType=makeType;
        System.out.println("TVS Bike: \nNumber of cylinders: "+noOfCylinders+"\nNumber of gears: "+noOfGears+"\nCooling Type: "+coolingType+"\nWheel Type: "+wheelType+"\nFuel Tank Size: "+fuelTankSize+"\nMake Type: "+makeType+"\nMileage: "+mileage+"\nPrice: "+price+"\n");
    }
}