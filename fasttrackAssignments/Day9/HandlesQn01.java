public class HandlesQn01{
    public static void main(String[] args) {
        try {
            int arr[]={2,5,1,4,0,7};
            int quotient=arr[7]/arr[4];
            System.out.println(quotient);
        }catch (ArithmeticException a1) {
            System.out.println("Arithmetic Exception found - "+a1.getMessage());
            a1.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException a2){
            System.out.println("Array Index Out Of Bounds Exception - "+a2.getMessage());
            a2.printStackTrace();
        }
    }
}