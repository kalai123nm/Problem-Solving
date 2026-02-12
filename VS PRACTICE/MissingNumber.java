public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8,9}; int n=9;
        int result=missingNum(arr, n);
        System.out.println("Missing number is: "+result);
    }
    static int missingNum(int arr[], int n){
        int totalSum=n*(n+1)/2;
        int actualSum=0;
        for(int each:arr){
            actualSum+=each;
        }
        return totalSum-actualSum;
    }
}
