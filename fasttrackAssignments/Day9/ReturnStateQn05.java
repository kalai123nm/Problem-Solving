public class ReturnStateQn05 {
    public static void main(String[] args) {
        System.out.println(method01()); 
    }
    static public int method01(){
        int a=12,b=3;
        try {
            return a/b;
        }
        // catch(Exception e){
        //     e.getMessage();
        //     return 0;
        // }
        finally{
            System.out.println("prints finally block.");
            // return a-b; //this return satatement fro finally block overrides the try return block
        }
    }
}