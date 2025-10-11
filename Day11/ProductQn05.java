import java.util.*;
import java.io.*;

public class ProductQn05 {
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        Scanner scan=new Scanner(System.in);
        AllProduct allPro=AllProduct.deSerializableMeth();

        int num=0;
        while (num!=6) {
            System.out.println("--- Choose what to do ---");
            System.out.println("1.> Accept product details from the user and write the object to a file.");
            System.out.println("2.> Read all product objects from the file and display them.");
            System.out.println("3.> Search for a product by productId in the file and display its details if found.");
            System.out.println("4.> Locate a product in the file using the ID, update its price or quantity, and save the changes back to the file.");
            System.out.println("5.> Remove a product object from the file by ID.");
            System.out.println("6.> Exit...");
            num=scan.nextInt();
            scan.nextLine();
            switch (num) {
                case 1:
                    allPro.addProduct(scan);
                    allPro.serializableMeth();
                    
                    break;
                case 2:
                    allPro.displayAllProducts();
                    break;
                case 3:
                    allPro.searchProduct(scan);
                    break;
                case 4:
                    allPro.changeValues(scan);
                    allPro.serializableMeth();
                    break;
                case 5:
                    allPro.removeProduct(scan);
                    allPro.serializableMeth();
                    break;
                case 6:
                    System.out.println("You chose to exit......");
                    break;
                default:
                    System.out.println("Wrong input, choose the correct option...");
                    break;
            }
        }
    }
}

class Product implements Serializable{
    int productID, quantity;
    String name;
    double price;

    Product(int productID, String name, int quantity, double price){
        this.productID=productID;
        this.quantity=quantity;
        this.name=name;
        this.price=price;
    }
    Product(){

    }
    void displayProduct(){
        System.out.println("Product ID: "+productID+"\nProduct Name: "+name+"\nProduct Price: "+price+"\nProduct Quantity: "+quantity+"\n");    
    }
}

class AllProduct implements Serializable{
    private List<Product> arr=new ArrayList<Product>();   
    void addProduct(Scanner scan){
        System.out.print("How many products you are going to add: \n");
        int numofPro=scan.nextInt();
        

        for(int i=0;i<numofPro;i++){
            System.out.print("Enter the product "+(i+1)+" details: \n\n");
            System.out.print("Enter the ProductID: ");
            int pID=scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the Product name: ");
            String pName=scan.nextLine();
            System.out.print("Enter the Product price: ");
            double pPrice=scan.nextDouble();
            System.out.print("Enter the Product Quantity: ");
            int pQuantity=scan.nextInt();
            System.out.println();
            arr.add(new Product(pID, pName, pQuantity, pPrice));
            System.out.println("Product added successfully.");
        }
        // displayAllProducts();
    }

    void displayAllProducts(){
        if(arr.isEmpty()){
            System.out.println("No product found.");
        }else{
            System.out.println("Product found....\n=== Product Details ===\n");
            for (Product prod : arr) {
                prod.displayProduct();
            }
        }
    }

    void searchProduct(Scanner scan){
        System.out.print("Enter the product ID to search in the file: ");
        int proID=scan.nextInt();
        boolean found=false;
            for (Product productt : arr) {
                if (productt.productID==proID){ 
                    productt.displayProduct();
                    found=true;
                    break;
                }
            }if(!found) System.out.println("Product not found");
    }
    void changeValues(Scanner scan){
        System.out.print("Enter the product ID to search in the file: ");
        int proID=scan.nextInt();
        boolean found=false;
        for (Product product : arr) {
            if (product.productID==proID){ 
                product.displayProduct();
                found=true;

                System.out.println("Current Products ");
                product.displayProduct();
                System.out.println("Press 1 to change the price of the product.");
                System.out.println("Press 2 to change the quantity of thr product.");
                System.out.println("Press 3 to change nothing...");
                int no=scan.nextInt();
                    switch (no) {
                    case 1:
                        System.out.println("Enter the price of the product which has to be updated");
                        product.price=scan.nextDouble();
                        System.out.println("Price Updated successfully.");
                        //pro.price=scan.nextDouble();    
                        return;
                    case 2:
                        System.out.print("Enter the quantity of the product which has to be updated : ");
                        product.quantity=scan.nextInt();
                        System.out.println("Quantity updated successfully.");    
                        return;
                    case 3:
                        System.out.println("If you want to change anything, please let us know");
                        break;
                    default:
                        System.out.println("Enter the correct number...");
                        break;
                    }
                }
            }
        if(!found) System.out.println("Product not found");         
    }

    void serializableMeth() throws IOException{
        FileOutputStream filee=new FileOutputStream("newFile.dat");
        ObjectOutputStream obj=new ObjectOutputStream(filee);
        obj.writeObject(this);
        obj.close();
    }

    static AllProduct deSerializableMeth()throws IOException, ClassNotFoundException{
        try(FileInputStream fileInput=new FileInputStream("newFile.dat");
        ObjectInputStream objInput=new ObjectInputStream(fileInput)){
            return (AllProduct) objInput.readObject();
        }catch(IOException|ClassNotFoundException e){
            return new AllProduct();
        }
        
    }

    void removeProduct(Scanner scan){
        System.out.println("Enter the Product ID to remove ");
        int id=scan.nextInt();
        Iterator <Product> iter=arr.iterator();
        while(iter.hasNext()){
            if(iter.next().productID==id){
                iter.remove();
                System.out.println("Product removed from the file.");
                return;
            }
        }System.out.println("Product not found.");
    }
}