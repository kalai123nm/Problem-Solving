package PackagesOfQn02.stringutils;
import java.util.Scanner;
public class StringUtils {
    String string1,string2,finalString="";
    Scanner scan=new Scanner(System.in);
    public String concatinateOf2String(){
        System.out.print("Your first String is? ");
        string1=scan.next();
        System.out.print("Your Second String is? ");
        string2=scan.next();
        return string1+string2;
    }
    public String reverseOfString(){
        System.out.print("Your first String is? ");
        string1=scan.next();
        StringBuilder str=new StringBuilder(string1);
        str.reverse();
        return str.toString();
    }
    public int lengthOfString(){
        System.out.print("Your first String is? ");
        string1=scan.next();
        return string1.length();
    }
}
