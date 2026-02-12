import java.util.Scanner;

public class TenPrimeNumbers {

    public static void main(String[] args) {
        TenPrimeNumbers ten=new TenPrimeNumbers();
        ten.primeNumbers();
    }
    void primeNumbers(){
        Scanner take=new Scanner(System.in);
        System.out.println("Enter the 10 numbers: ");
        int nums[]=new int[10];
        int prime=0;
        for(int i=0;i<10;i++){
            nums[i]=take.nextInt(); 
        }
        for(int i=0;i<10;i++){
            if(isPrime(nums[i])){
                System.out.print(nums[i]+" ");
                prime+=nums[i]; 
            }
        }
        take.close();
        System.out.println("\nSum of prime nums: "+prime);
    }
    static boolean isPrime(int num){
        if(num<=1) return false;
        for(int j=2;j<=Math.sqrt(num);j++){
            if(num%j==0){
            return false;
            }
        }return true;
    }
}