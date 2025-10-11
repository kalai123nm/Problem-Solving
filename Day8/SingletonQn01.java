import java.util.Scanner;
public class SingletonQn01{
    public static void main(String[] args) {
        Scanner message=new Scanner(System.in);

        // SingletonQn01 example1=new SingletonQn01();   // normal class object...
        // SingletonQn01 exapmle2=new SingletonQn01();

        // if(example1==exapmle2){System.out.println("same instance");}
        // else{System.out.println("no, different instance.");}

        SingletonDemo single1=SingletonDemo.getInstance(); //singleton Class 
        single1.DemoMethod(message);
        SingletonDemo single2=SingletonDemo.getInstance();
        single2.DemoMethod(message);
        SingletonDemo single3=SingletonDemo.getInstance();
        single3.DemoMethod(message);

        if(single1==single2 && single2==single3){ 
            System.out.println("All object have the same instances."); //will prints if two objects have same instance.
        }else{
            System.out.println("have different instances.");
        }
    }
}

class SingletonDemo{
    private static SingletonDemo stringInstance; //private static instance of the class SingletonDemo

    private SingletonDemo(){  //private constructor. so object cannot be created other than itself; 
        System.out.println("Instance created successfully.");
    }
    public static SingletonDemo getInstance(){  //public static method to access private instance
        if(stringInstance==null){
            stringInstance=new SingletonDemo();
        }return stringInstance;
    }

    public void DemoMethod(Scanner message){  //you can create public method if you want
        System.out.println("ha ha....April fool- u cannot put message here. (:)");
    }
}