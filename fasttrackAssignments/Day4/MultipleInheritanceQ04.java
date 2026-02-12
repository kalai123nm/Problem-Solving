public class MultipleInheritanceQ04 {
    public static void main(String[] args) {
        child1 child=new child1();
        child.childMethod();
    }
}
class Parent1{
    public void speak(){
        System.out.println("I am the father.");
    }
}
class Parent2{
    public void speak(){
        System.out.println("I am the mother.");
    }
}
class child1 extends Parent1/* ,Parent2*/{ 
    /*java will not allow this multiple inheritance. 
    because the child class will get confused which parent should listen.Instead we can use Interface to achieve this.*/
    public void childMethod(){
        System.out.println("hello mom,dad :)");
    }
}
