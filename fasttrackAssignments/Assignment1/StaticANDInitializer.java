public class StaticANDInitializer{
    static int jam=7;
    // Constructor block
    public StaticANDInitializer(){
        System.out.println("Constructor block is executed.");
    }
    // static block
    static{
        System.out.println("static block is executed: "+jam);
    }
    // Instance block
    {
        int i=12;
        System.out.println("Instance block is executed: "+i);
    }
    public static void main(String[] args) {
        StaticANDInitializer start=new StaticANDInitializer();
        
        StaticANDInitializer end=new StaticANDInitializer();
    }
}