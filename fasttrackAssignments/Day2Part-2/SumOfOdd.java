import java.util.Scanner;

public class SumOfOdd {

    public static void main(String[] args) {
        sumOfOdd();
    }
    static void sumOfOdd(){
        Scanner gett=new Scanner(System.in);
        System.out.println("Enter the 10 numbers: ");
        int numbers[]=new int[10];
        int oddValue=0;
        for(int i=0;i<10;i++){
            numbers[i]=gett.nextInt();
            if(numbers[i]%2!=0){
                oddValue+=numbers[i];
            }
        }gett.close();
        System.out.println("Sum of all the Odd numbers: "+oddValue);
    }
}
