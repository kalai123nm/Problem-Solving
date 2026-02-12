import java.util.Scanner;
public class ATMPinQn06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        aTM(scan);
        scan.close();
    }
    static void aTM(Scanner scan){
        int[] pin=new int[4];
        for(int i=0;i<pin.length;i++){
        try {
            System.out.println("Your "+(i+1)+" is: ");
            
                if(!(scan.hasNextInt())){
                    scan.next();
                    throw new IllegalArgumentException("Invalid input, PIN must be numeric value.");
                }
                int j=scan.nextInt();
                
                if(j>9 || j<0){
                    throw new IllegalArgumentException("Invalid input, PIN must be between 0-9 only.");
                }else pin[i]=j;
            } catch(IllegalArgumentException f){
                System.out.println(f.getMessage());
                i--;
            }
        }      
        if(pin[0]==0){
            System.out.println("Invalid, PIN must not start with 0.");
            return;
        }
        System.out.println("Valid PIN.");
    }
}
