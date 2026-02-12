import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=input.nextInt();
        
        if(number<=0){
            System.out.println("not");;
        }
        while(number%2==0){
            number=number/2;
        }if(number==1){
            System.out.println("power of 2");
        }else{
            System.out.println("not power of 2");
        }
    }
}





