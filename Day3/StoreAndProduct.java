import java.util.ArrayList;
import java.util.Scanner;
public class StoreAndProduct {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Store Name: ");
        String sName=scan.nextLine();
        System.out.print("Enter the Store Location: ");
        String sLocation=scan.nextLine();
        Store store=new Store();
        Store.setStoreDetails(sName, sLocation);
        System.out.print("Enter the number of your total Products: ");
        int productNum=scan.nextInt();
        Store.arr=new Product[productNum];

        for(int i=0;i<productNum;i++){
            System.out.println("Enter the details for product "+(i+1));
            System.out.print("Enter the ProductID: ");
            int pID=scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the product Name: ");
            String pName=scan.nextLine();
            System.out.print("Enter the product Price: ");
            double pPrice=scan.nextDouble();
            System.out.print("Enter the Quantity of the Product: ");
            int pQuantity=scan.nextInt();
            //scan.nextLine();
            System.out.println();
            Store.arr[i]=new Product(pID, pName, pPrice, pQuantity);
            // store.addProduct(Store.arr[i]);
        } 
        Store.displayStoreDetails();

        store.displayAllProducts();
        scan.close();
    }
}
class Store{
    static String storename;
    static String storeLocation;
    static Product[] arr;

    static void setStoreDetails(String name, String location){
        storename=name;
        storeLocation=location;

    }
    static void displayStoreDetails(){
        System.out.print("Store Name: "+storename+"\nLocation: "+storeLocation+"\n");
        System.out.println();
    }
    // void addProduct(Product p){
        
    // }
    void displayAllProducts(){
        System.out.printf("%-18s %-18s %-18s %-18s%n","Product ID","Product Name","Product Price","Product Quantity");
        for(Product k:arr ){
            k.displayProduct();
        }
    }
}
class Product{
    int productID;
    String productName;
    double productPrice;
    int productQuantity;

    Product(int id, String name, double price, int quantity){
        productID=id;
        this.productName=name;
        this.productPrice=price;
        this.productQuantity=quantity;
    }
    void displayProduct(){
        System.out.printf("%-18d %-18s %-18.2f %-18d%n",productID,productName,productPrice,productQuantity);
    }
}
