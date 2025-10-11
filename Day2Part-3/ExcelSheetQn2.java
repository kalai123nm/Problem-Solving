import java.util.Scanner;
public class ExcelSheetQn2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int columnNum=scan.nextInt();
        String ans=excelSheet1(columnNum);
        System.out.println("answer is: "+ans);
        scan.close();
    }
    static String excelSheet1(int columnNum){
        StringBuilder result=new StringBuilder();
        while(columnNum>0){
            columnNum--;
            int rem=columnNum%26;
            char ch=(char)('A'+rem);
            result.insert(0,ch);
            columnNum=columnNum/26;
        }
        return result.toString();
    }
}