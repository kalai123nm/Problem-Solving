public class Pattern3B {
    static void pattern2W(){
        int row=10;
        int eye=1;
        while(eye<=row){
            int column=1;
            int num;
            if(eye<6){
                num=eye;
            }else{
                num=row-eye+1;
            }
            while(column<=num){
                System.out.print("w ");
                column++;
            }
            System.out.println();
            eye++;
        }
    }
    public static void main(String[] args) {
        pattern2W();
    }
}
