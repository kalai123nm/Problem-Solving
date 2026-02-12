public class RightAngleTriangle {
    public static void main(String[] args) {
        RightAngleTriangle py=new RightAngleTriangle();
        py.nNoOfPyramid(7);
    }

    public void nNoOfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}