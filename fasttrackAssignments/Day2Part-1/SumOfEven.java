import java.util.Scanner; 
public class SumOfEven {

    public static void main(String[] args) {
        SumOfEven value=new SumOfEven();
        value.sumEven();
    }

    void sumEven(){
        Scanner gett=new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int sizeOfArray=gett.nextInt();
        int []arra=new int[sizeOfArray];
        System.out.print("Enter the numbers: ");
        for(int i=0;i<sizeOfArray;i++){
            arra[i]=gett.nextInt();
        }
        int sumValue=0;
        for(int i=0;i<sizeOfArray;i++){
            if(arra[i]%2==0){
                sumValue+=arra[i];
            }
        }
        System.out.println("Sum of even number from the series: "+sumValue);
        gett.close();
    }
}