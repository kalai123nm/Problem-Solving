public class Method1Qn07 {
    public static void main(String[] args) {
        Method1Qn07 met=new Method1Qn07();
        try {
            met.method1();
        } catch (Exception e) {
            System.out.println("Message: "+e.getMessage());
        }
    }
    void method1(){
        //try{
            method2();
        //}catch(Exception e){

        //   }
    }
    void method2(){
        
        method3();
    }
    void method3(){
        String str="kalai";
        System.out.println(str.charAt(5));
    }
}
