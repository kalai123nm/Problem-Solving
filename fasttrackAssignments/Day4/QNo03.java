import java.util.Scanner;
public class QNo03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter x: ");
        int xValue=scan.nextInt();
        System.out.print("Enter y: ");
        int yValue=scan.nextInt();
        System.out.print("Enter radius: ");
        int radiusValue=scan.nextInt();
        Circle circle=new Circle(xValue,yValue,radiusValue);
        circle.printPoint();
        System.out.println("Radius is "+circle.getRadius());
        System.out.printf("Area is %.2f\n ",circle.area());
        scan.close();
    }
}
class Point{
    private int x,y;
    public Point(){
        x=0;y=0;
    }
    public void setPoint(int x,int y) { //set the value
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    void printPoint(){
        System.out.println("Circle center is ("+getX()+","+getY()+")");
    }
}
class Circle extends Point{
    private int radius;

    public Circle(int x, int y,int radius){
        super(); //
        setPoint(x, y); //
        if(radius<=0){ //checks if the radius is positive. If not, then it'll set the radius 1.
            this.radius=1;
        }else{
        this.radius=radius;
        }
        
    }
    public void setRadius(int radius){
        if(radius<=0){
            this.radius=1;
        }else{
        this.radius=radius;
        }
    }
    public int getRadius(){
        return radius;
    }
    public double area(){
        return Math.PI*radius*radius;  //formula to find the circle's area is area=PI*Radius^2
    }
}
