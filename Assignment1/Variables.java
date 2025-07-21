public class Variables{
    static int staticVar=5;
    int instanceVar=8;
    public void method0(){
        final int finalVar=7;
        int localVar=14;

        System.out.println("Static variable: "+staticVar);
        System.out.println("Instance variable: "+instanceVar);
        System.out.println("Local variable: "+localVar);
        System.out.println("Final variable: "+finalVar);

        if(localVar>10){
            int blockVar=2;
            System.out.println("Block variable: "+blockVar);
        }
    }
    public static void main(String[] args) {
        Variables jaa=new Variables();
        jaa.method0();
    }
}