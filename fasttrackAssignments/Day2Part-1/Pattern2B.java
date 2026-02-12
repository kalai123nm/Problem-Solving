public class Pattern2B {
    static void patternR(){
        for(int row=1;row<=5;row++){
            
            for(int column=1;column<=4;column++){
                if((row==2||row==5)&&(column==2||column==3)){
                    System.out.print("  ");
                }else if((row==4)&&(column==2||column==4)){
                    System.out.print("  ");
                }else{
                    System.out.print("R ");
                }
                
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        patternR();
        
    }
}
