public class Pattern2A{
    public void patternAX(){
        int count=7;
        for(int row=1;row<=7;row++){
            
            for(int column=1;column<=7;column++){
                if(row==column){
                    System.out.print("1");
                }else if(column==count){
                    System.out.print("1");
                }else{
                System.out.print(" ");
                }
            }
            count--;
            System.out.println();
            
        }
    }
    public static void main(String args[]){
        Pattern2A patt=new Pattern2A();
        patt.patternAX();
        
    }
}