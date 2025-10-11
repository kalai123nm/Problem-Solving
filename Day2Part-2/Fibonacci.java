import java.util.Arrays;
public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci nums=new Fibonacci();
        nums.fibonacciNums();  
    }
    void fibonacciNums(){
        int fibo[]=new int[30];
        fibo[0]=0;
        fibo[1]=1;
        for(int i=2;i<30;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        System.out.println(Arrays.toString(fibo));
    }
}
