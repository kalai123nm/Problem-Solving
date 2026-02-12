import java.lang.reflect.Array;
import java.util.*;

public class AliceCookies {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int testCase=scann.nextInt();
        for(int i=1;i<=testCase;i++){
            int noFriends=scann.nextInt();
            int aliceCookies=scann.nextInt();
            int arr[]=new int[noFriends];
            for(int j=0;j<noFriends;j++){
                arr[j]=scann.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            for(int j=0;j<noFriends;j++){
                int n=0;
                if(aliceCookies==arr[j]){
                n++;
                }else{
                    n=0;
                }
            aliceCookies=Math.abs(n-aliceCookies);
            }
            System.out.println(aliceCookies);
        }
        
        
    }
}
