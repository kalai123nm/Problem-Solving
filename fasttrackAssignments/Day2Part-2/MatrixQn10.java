import java.util.Arrays;
import java.util.Scanner;

public class MatrixQn10 {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int m=Scan.nextInt();
        System.out.println("Enter the columns: ");
        int n=Scan.nextInt();
        int matrix[][]=new int[m][n];
        MatrixQn10 mat=new MatrixQn10();
        int choice;
        do{
            System.out.println("1. InputElements: ");
            System.out.println("2. DisplayElements: ");
            System.out.println("3. SumOfAll: ");
            System.out.println("4. RowWiseSum: ");
            System.out.println("5. ColumnWiseSum: ");
            System.out.println("6. Transpose: ");
            System.out.println("7. Exit: ");
            choice=Scan.nextInt();

            switch (choice) {
                case 1:
                    inputElements(matrix, m, n, Scan);
                    break;
                case 2:
                    displayElements(matrix, m, n);
                    break;
                case 3:
                    int sum=sumOfAllElements(matrix, m, n);
                    System.out.println("Sum of All: "+sum);
                    break;
                case 4:
                    rowWiseSum(matrix, m, n);
                    break;
                case 5:
                    columnWiseSum(matrix, m, n);
                    break;
                case 6:
                    transposeOfMatrix(matrix, m, n);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option.");
                    break;
            } 
        }while(choice!=7);
        Scan.close();
    }
    static void inputElements(int matrix[][],int m, int n,Scanner Scan){
        System.out.println("Enter the elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=Scan.nextInt();
            }
        }
    }
    static void displayElements(int matrix[][], int m, int n){
        System.out.println("Matrix is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    static int sumOfAllElements(int matrix[][], int m, int n){
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    static void rowWiseSum(int matrix[][], int m, int n){
        for(int i=0;i<m;i++){
            int rowSum=0;
            for(int j=0;j<n;j++){
                rowSum+=matrix[i][j];
            }
            System.out.println("Row wise sum: "+rowSum);
        }
    }
    static void columnWiseSum(int matrix[][], int m, int n){
        for(int j=0;j<n;j++){
            int columnSum=0;
            for(int i=0;i<m;i++){
                columnSum+=matrix[i][j];
            }
            System.out.println("Column wise sum: "+columnSum);
        }
    }
    static void transposeOfMatrix(int matrix[][],int m, int n){
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
}
