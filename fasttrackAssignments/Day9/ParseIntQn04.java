//import java.io.FileNotFoundException;
import java.util.Scanner;
public class ParseIntQn04{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try {
            System.out.println("Enter the number: ");
            String num=scan.nextLine();
            Integer i=Integer.parseInt(num);
            System.out.println(i);
            //throws NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        scan.close();
    }
}
