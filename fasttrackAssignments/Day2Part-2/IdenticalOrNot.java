public class IdenticalOrNot {
    public static void main(String[] args) {
        IdenticalOrNot idea=new IdenticalOrNot();
        
        idea.printt();
        //idea.identical();
        
    }
    char x[]={'m','n','o','q'};
    char y[]={'m','n','o','p'};
    String stri=new String(x);
    String str2=new String(y);
    void printt(){    
        if(stri.equals(str2))  System.out.println("Yes");
        else   System.out.println("No"); 
    }

    // void identical(){
    //     int nn=0;
    //     if(x.length==y.length){
    //         for(int i=0;i<x.length;i++){
    //             if(x[i]==y[i]){
    //                 nn++;
    //             }
    //         }
    //     }
    //     if(nn!=0) System.out.println("Yes");
    //     else   System.out.println("No");
    // }
}
