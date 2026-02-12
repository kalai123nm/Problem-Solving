
public class Pyramid {
    public static void main(String[] args) {
        Pyramid py=new Pyramid();
        py.nNoOfPyramid(20);
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