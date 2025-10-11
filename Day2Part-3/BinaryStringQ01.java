import java.util.Scanner;

public class BinaryStringQ01{
    public static void main(String[] args) {  
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first binary number: ");
        String a=scan.next();
        System.out.println("Enter the second binary number: ");
        String b=scan.next();
        BinaryStringQ01 bin=new BinaryStringQ01();
        String result=bin.binaryString(a, b);
        System.out.println("Sum of two binary number is: "+result);

        scan.close(); 
    }
    String binaryString(String x, String y){  
        // used here Wrapping class to convert String to Integer
        Integer aa=Integer.parseInt(x,2);
         //(x,2) here 2 means base=>if we give input normally it'll consider as decimal.so we use 2 to tell that's a binary.
        Integer bb=Integer.parseInt(y,2);
        int sum=aa+bb; 
        return Integer.toBinaryString(sum); //used again wrapper class to convert int to string
    }
}