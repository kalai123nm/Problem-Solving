import java.util.ArrayList;
public class OOPQn5 {
    public static void main(String[] args) {
        Store stor=new Store();
        stor.setStoreDetails("Angadi SuperMarket", "Surandai"+"\n---------------------------------------");
        stor.displayStoreDetails();
        Product produc1=new Product(19,"Shirt",500,1);
        Product produc2=new Product(20,"Moblie",20000,1);
        Product produc3=new Product(23,"Watch",500,2);
        Product produc4=new Product(21,"Pen",20,3);
         
        stor.addProduct(produc1);
        stor.addProduct(produc2);
        stor.addProduct(produc3);
        stor.addProduct(produc4);
        stor.displayAllProducts();
        

    }
}

class Store{
    static String store_Name;
    static String store_Location;
    private ArrayList <Product> aram=new ArrayList<>();
    static void setStoreDetails(String Name, String Location){
       store_Name=Name;
       store_Location=Location;
    }
    static void displayStoreDetails(){
        System.out.println("StoreName is "+store_Name+"\nStore_Location is "+store_Location);
    }


    void addProduct(Product product){
        aram.add(product);
    }
    void displayAllProducts(){
        for(Product p:aram){
        p.displayProduct();
        }
    }
}

class Product{
    int product_ID;
    String name;
    int price;
    int quantity;

    Product(int id, String name, int price, int quantity){
        this.product_ID=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    void displayProduct(){
        System.out.println("Product_ID: "+product_ID+"\nProduct_Name: "+name+"\nProduct_Price: "+price+"\nQuantity: "+quantity+"\n");
    }
}