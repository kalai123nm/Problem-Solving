
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        Sample sam=new Sample();
        
        System.out.println(sam.twoSum("67775533331"));
  }
  public String twoSum(String num){
    char max=' ';
    for(int i=0;i<num.length()-2;i++){
        char one=num.charAt(i);
        char two=num.charAt(i+1);
        char three=num.charAt(i+2);

        if(one==two&&two==three){
            if(max<one) max=one;
        }
    }
    if(max==' ')return "";
    return max+""+max+""+max;
  }
}
