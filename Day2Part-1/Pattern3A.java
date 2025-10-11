public class Pattern3A {
    public void Increase(){
        int count=1;
        int row=1;
        while(row<=5){
            int column=1;
            while(count<=9&&column<=5){
                if(count==column){
                    System.out.print(column);
                }
                else{
                    System.out.print(" ");
                }
                column++;
                count++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args) {
        Pattern3A pat=new Pattern3A();
        pat.Increase();
    }
}