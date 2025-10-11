// public class PassByValue {
//        //REFERENCE By Value:  
//     public static void main(String[] args) {
//         PassByValue pbv=new PassByValue();

//         Newv s=new Newv("hehehe he");

//         System.out.println(s.str); // prints "hehehe he"
//         pbv.method(s);
//         System.out.println(s.str); // prints "ha ha ha"
//     }

//     void method(Newv h){
//         h=new Newv();   //creating new reference to the object
//         h.str="ha ha ha";
//     }
// }
// class Newv{
//     String str;

//     Newv(String str){
//         this.str=str;
//     }
//     Newv(){

//     }
// }

public class PassByValue{
    public static void main(String[] args) {
        int i=10;

        change(i);
        System.out.println(i);

    }
    public static void change(int i){ // here i variable passing to the method and have the different name only. but it points the same reference.
                                        // so it prints the old value.
        i+=2;
    }
}