import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatchQn02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try {
            System.out.println("Enter the first number as String: ");
            String i=scan.nextLine();
            System.out.println("Enter the second number as String: ");
            String j=scan.nextLine();

            Integer num1=Integer.parseInt(i);
            Integer num2=Integer.parseInt(j);

            int ans=num2/num1;
            System.out.println(ans);

        } catch (InputMismatchException i) {
            System.out.println("InputMismatch: "+i.getMessage());
        } catch(NumberFormatException n){
            System.out.println("NumberFormat: "+n.getMessage());
        } catch(ArithmeticException a){
            System.out.println("Arithmetic: "+a.getMessage());
        } catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        scan.close();
    }
}
