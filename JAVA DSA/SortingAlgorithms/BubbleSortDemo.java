import java.util.Scanner;

public class BubbleSortDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int arrSize=scan.nextInt();
        System.out.print("Enter the array values: ");
        int[]nums=new int[arrSize];
        for(int i=0;i<arrSize;i++){
            nums[i]=scan.nextInt();
        }

        BubbleSortDemo sorting=new BubbleSortDemo();
        sorting.bubbleSortedArray(nums);

        scan.close();
    }    

    public void bubbleSortedArray(int[] nums){
        int size=nums.length;
        int temp=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-    1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        for(int a:nums){
            System.err.print(a+" ");
        }
    }
}
