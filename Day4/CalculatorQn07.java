import java.util.Scanner;
public class CalculatorQn07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BasicCalculator basicCalc=new BasicCalculator();
        AdvanceCalculator advanceCalc=new AdvanceCalculator();
        ScientificCalculator scifiCalc=new ScientificCalculator();

        System.out.println("Addition: "+basicCalc.addInt(scan)+"\n");
        System.out.println("Subtraction: "+basicCalc.subtractInt(scan)+"\n");
        System.out.println("Multiplication: "+basicCalc.multiInt(scan)+"\n");
        System.out.println("Division: "+basicCalc.diviInt(scan)+"\n");

        System.out.println("Power: "+advanceCalc.powerInt(scan)+"\n");
        System.out.println("Modulus: "+advanceCalc.moduloInt(scan)+"\n");
        System.out.println("SquareRoot: "+advanceCalc.sqrtInt(scan)+"\n");

        System.out.println("Sine: "+scifiCalc.sineDouble(scan)+"\n");
        System.out.println("Cos: "+scifiCalc.cosDouble(scan)+"\n");
        System.out.println("Log: "+scifiCalc.logDouble(scan)+"\n");
        System.out.println("Exponential: "+scifiCalc.expDouble(scan)+"\n");
    }
}

class BasicCalculator{
    int a,b,total;
    double angle,total1;
    public int addInt(Scanner scan){
        this.a=a; this.total=total; this.b=b;
        System.out.println("----- Addition -----");
        System.out.print("Enter the number1: ");
        a=scan.nextInt();
        System.out.print("Enter the number2: ");
        b=scan.nextInt();
        total=a+b;
        return total;
    }
    public int subtractInt(Scanner scan){
        System.out.println("----- Subtraction -----");
        this.a=a; this.b=b; this.total=total;
        System.out.print("Enter the number1: ");
        a=scan.nextInt();
        System.out.print("Enter the number2: ");
        b=scan.nextInt();
        total=a-b;
        return total;
    }
    public int multiInt(Scanner scan){
        this.a=a; this.b=b; this.total=total;
        System.out.println("----- Multiplication -----");
        System.out.print("Enter the number1: ");
        a=scan.nextInt();
        System.out.print("Enter the number2: ");
        b=scan.nextInt();
        total=a*b;
        return total;
    }
    public int diviInt(Scanner scan){
        this.a=a; this.b=b; this.total=total;
        System.out.println("----- Division -----");
        System.out.print("Enter the number1: ");
        a=scan.nextInt();
        System.out.print("Enter the number2: ");
        b=scan.nextInt();
        if(b!=0)total=a/b;
        return total;
    }
}

class AdvanceCalculator extends BasicCalculator{

    public int powerInt(Scanner scan){
        System.out.println("----- Power Of Number -----");
        System.out.print("Enter the base number: ");
        int base=scan.nextInt();
        System.out.print("Enter the exponent number: ");
        int expo=scan.nextInt();
        super.a=base; super.b=expo; 
        int result=1;
        for(int i=1;i<=expo;i++){
            result*=base;
        }
        super.total=result;
        return total;
    }

    public int moduloInt(Scanner scan){
        this.a=a; this.b=b; this.total=total;
        System.out.println("----- Modulus of Number -----");
        System.out.print("Enter the number1: ");
        a=scan.nextInt();
        System.out.print("Enter the Number2: ");
        b=scan.nextInt();
        total=a%b;
        return total;
    }
    public float sqrtInt(Scanner scan){ 
        System.out.println("----- SquareRoot Of Number -----");
        System.out.print("Enter the number: ");
        float num=scan.nextFloat();
        return (float) Math.sqrt(num);
    }

}

class ScientificCalculator extends BasicCalculator{

    public double sineDouble(Scanner scan){
        this.angle=angle; this.total1=total1;
        System.out.println("----- Sine value Of Number -----");
        System.out.print("Enter the number: ");
        a=(int)scan.nextDouble();   
        total1=Math.sin(Math.toRadians(angle));     
        return total1;
    }
    public double cosDouble(Scanner scan){
        this.angle=angle; this.total1=total1;
        System.out.println("----- Cos value Of Number -----");
        System.out.print("Enter the number: ");
        angle=scan.nextDouble();   
        total1=Math.cos(Math.toRadians(angle));     
        return total1;
    }
    public double logDouble(Scanner scan){
        this.angle=angle; this.total1=total1;
        System.out.println("----- Log value Of Number -----");
        System.out.print("Enter the number: ");
        angle=scan.nextDouble();   
        total1=Math.log(angle);   
        return total1;
    }
    public double expDouble(Scanner scan){
        this.angle=angle; this.total1=total1;
        System.out.println("----- Exponential value Of Number -----");
        System.out.print("Enter the number: ");
        angle=scan.nextDouble();   
        total1=Math.exp(angle);     
        return total1;
    }
}
