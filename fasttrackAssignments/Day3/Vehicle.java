public class Vehicle {
    
    public static void main(String[] args) {
        vehicleClass car1=new vehicleClass(1,"BMW",10000);
        vehicleClass car2=new vehicleClass(2,"Innova",20000);
        vehicleClass car3=new vehicleClass(3,"Audi",30000);
        vehicleClass car4=new vehicleClass(4,"Cheverlate",40000);
        vehicleClass car5=new vehicleClass(5,"Huindai",50000);
        vehicleClass car6=new vehicleClass(6,"RR",60000);
        car6.toPrint();  
        
    }
}
class vehicleClass{
    int Vehicle_ID;
    String brand_Name;
    int price;
    static int count=0;
    vehicleClass(int Vehicle_ID, String brand_Name, int price){
        this.Vehicle_ID=Vehicle_ID;
        this.brand_Name=brand_Name;
        this.price=price;
        count++;
    }
    void toPrint(){
        //System.out.println("Vehicle_ID:"+Vehicle_ID+"\n Brand_Name:"+brand_Name+"\n Price: "+price);
        System.out.println(count+" vehicles have created.");
    }
}