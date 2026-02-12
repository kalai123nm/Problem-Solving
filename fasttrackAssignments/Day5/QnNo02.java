public class QnNo02{
    public static void main(String[] args) {
        Child child=new Child();
        child.method02();
        child.method03();
        
    }
}

class Parent{
    private static void method01(){
        int number=0;
        System.out.println("This is the Private Method from parent.");
    }
    public Parent() {
        System.out.println("Thus is the default contructor from parent.");
    }
    static void method02(){
        System.out.println("This is the static method from parent.");
    }
    final void method03(){
        System.out.println("This is the Final method from parent.");
    }
}

class Child extends Parent{
    //cannot override a private method. Because it is not accessable from it's subclass.
    private static void method01(){
        System.out.println("This is the Private Method from ***child***");
    }
    // constructor cannot be overridden. I can be declared only
    Child(){
        System.out.println("Thus is the default contructor from ***child***");
    }
    // Static method cannot be overridden, because it is belong to the Class not the instance
    static void method02(){
        System.out.println("This is the static method from ***child***");
    }
    // We cannot override a Final method, because it will be blocked forever.
    // final void method03(){
    //     System.out.println("This is the Final method from ***child***");
    // }
}