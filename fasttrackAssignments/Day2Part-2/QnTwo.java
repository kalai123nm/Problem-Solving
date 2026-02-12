import java.util.Scanner;
public class QnTwo {
    public static void main(String[] args) {
        QnTwo qnT=new QnTwo();
        qnT.print();
    }

    void print(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the count of the number you want to enter: ");
        int len=scan.nextInt();
        System.out.println("Enter the nums: ");
        int x[] = new int[len]; 
        int sumOfSingleDigit=0;
        int sumOfDoubleDigit=0;
        for(int k=0;k<len;k++){
            x[k]=scan.nextInt();
        }int i=0;
        while(i<len){
            if((x[i]<10)&&(x[i]>0)){
                sumOfSingleDigit+=x[i];
            }if((x[i]>9)&&(x[i]<100)){
                sumOfDoubleDigit+=x[i];
            }
            i++;
        }
        scan.close();
        System.out.println("Sum Of Single Digit is: "+sumOfSingleDigit);
        System.out.println("Sum of Double digit is: "+sumOfDoubleDigit);
        
    }
}
