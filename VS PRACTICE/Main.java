import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int ans=0; int i=1;
            while(i>n){
                if(i%3==0 || i%5==0){ ans+=i++;}
            }
            System.out.println(ans);
        }
    }

    Main();

}

abstract class A{
  A(){

  }
}
