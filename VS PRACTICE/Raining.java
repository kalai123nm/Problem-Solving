import java.util.Scanner;

public class Raining {
    static void rainOrNot(Scanner input){
		int morning=input.nextInt();
		int evening=input.nextInt();
        if(evening>=(morning*3)){
            System.out.println("Rain");
        }else{
            System.out.println("Dry");
        }
    }
    public static void main(String[] args) {
        Scanner input1=new Scanner(System.in);
		rainOrNot(input1);
    }
}