import PackagesOfQn02.arithmatic.Arithmatic;
import PackagesOfQn02.stringutils.StringUtils;
public class QnNo02{
    public static void main(String[] args) {
        Arithmatic arith=new Arithmatic();
        System.out.println("Addition of two Addition: "+arith.adding());
        System.out.println(arith.subtraction());
        System.out.println("Multiplication of two Numbers: "+arith.multiplication());
        System.out.println("Division of two Numbers: "+arith.division());
        System.out.println("Modulo of two Numbers: "+arith.modulo());

        StringUtils strUtils=new StringUtils();
        System.out.println("Concatenation of two Strings: "+strUtils.concatinateOf2String());
        System.out.println("Length of the String: "+strUtils.lengthOfString());
        System.out.println("Reverse of the String: "+strUtils.reverseOfString());
    }
}