import java.util.Scanner;
public class MarksOf10Stu {
    public static void main(String[] args) {
        MarksOf10Stu marr=new MarksOf10Stu();
        marr.inputt();
        marr.printt();
    }  
    int i=0,j=0;
    int total=0; double percentage=0.0;
    Scanner scan=new Scanner(System.in);
    int roll[][]=new int[10][4];
    void inputt(){
        for(i=0;i<10;i++){
            for(j=0;j<4;j++){
                roll[i][j]=scan.nextInt();
            }
        }
        scan.close();        
    }
    void printt(){
        System.out.printf("%-10s %-15s %-10s","Roll_No","Total_Marks","Percentage\n");
        System.out.println("-------------------------------------");
        for(i=0;i<10;i++){
            total=0;
            percentage=0.0;
            for(j=1;j<4;j++){
                total+=roll[i][j]; 
            }
            percentage=total/3;  
            System.out.printf("%-10d %-15d %-10.1f",roll[i][0],total,percentage);
            System.out.println();

        }
    }
}
