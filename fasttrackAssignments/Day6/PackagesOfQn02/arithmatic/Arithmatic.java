package PackagesOfQn02.arithmatic;
import java.util.Scanner;

public class Arithmatic {
    int number1,number2;
    double answer;
    Scanner scan=new Scanner(System.in);

    public double adding(){

        System.out.print("---Addition---\nEnter the first number: ");
        number1=scan.nextInt();
        System.out.print("Enter the second number: ");
        number2=scan.nextInt();
        this.answer=number1+number2;
        return answer;
    }
    public double subtraction(){
        System.out.print("---Subtraction---\nEnter the first number: ");
        number1=scan.nextInt();
        System.out.print("Enter the second number: ");
        number2=scan.nextInt();
        this.answer=number1-number2;
        return answer;
    }
    public double multiplication(){
        System.out.print("---Multiplication---\nEnter the first number: ");
        number1=scan.nextInt();
        System.out.print("Enter the second number: ");
        number2=scan.nextInt();
        this.answer=number1*number2;
        return answer;
    }
    public double division(){
        System.out.print("---Division---\nEnter the first number: ");
        number1=scan.nextInt();
        System.out.print("Enter the second number: ");
        number2=scan.nextInt();
        
        if(number1>number2){
            this.answer=number1/number2;
            System.out.println("Division Of two Numbers: "+answer+"\n");
        }else{System.out.println("The Divisor is smaller than divider......");}
        return answer;
    }
    public double modulo(){
        System.out.print("---Modulo---\nEnter the first number: ");
        number1=scan.nextInt();
        System.out.print("Enter the second number: ");
        number2=scan.nextInt();
        this.answer=number1%number2;
        return answer;
    }
}
