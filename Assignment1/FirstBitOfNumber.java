import java.util.Scanner;
public class FirstBitOfNumber {
    void firstBit(){
        Scanner num=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int int_num=num.nextInt();
        
        if(int_num<=0){
            System.out.println("First bit of a number is: 0");
            return;
        }
        int count=0;
        while ((int_num&1)==0) {
            int_num>>=1;
            count++;
        }
        System.out.println("count is: "+count);
    }
    public static void main(String[] args) {
        FirstBitOfNumber solution=new FirstBitOfNumber();
        solution.firstBit();
    }
}
