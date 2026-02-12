public class QN05 {
    public static void main(String[] args) {
        Square square=new Square();
        square.shape();
        Triangle triangle=new Triangle();
        triangle.shape();
        Rectangle rectangle=new Rectangle();
        rectangle.shape();
        Polygon polygon=new Polygon();
        polygon.shape();
        Shape shape=new Shape();
        shape.shape();
    }
}
class Shape{ //base class/ parent class
    public void shape(){
        System.out.println("This is a Shape.");
    }
}
class Polygon extends Shape{ //Polygon is the subclass of Shape and it is the Parentclass for both Rectangle and Triangle.
    @Override
    public void shape(){
        System.out.println("Polygon is a Shape.");
    }
}
class Rectangle extends Polygon{ //Rectangle is the parent class for Square class
    @Override
    public void shape(){
        System.out.println("Rectangle is a Polygon.");
    }
}
class Triangle extends Polygon{  //Triangle is the subclass of Polygon
    @Override
    public void shape(){
        System.out.println("Triangle is a Polygon.");
    }
}
class Square extends Rectangle{ //Square is the subclass of Rectangle class
    @Override
    public void shape(){
        System.out.println("Square is a Rectangle.");
    }
}