public class PowerOfTwo {
    public static void main(String arg[]){
        PowerOfTwo power=new PowerOfTwo();
        System.out.println(power.isPowerOfTwo(64));
    }
    public boolean isPowerOfTwo(int x){
        if(x==0)return false;
        else{
            while(x%2==0)
                x/=2;
        }
        return(x==1);
    }
}
