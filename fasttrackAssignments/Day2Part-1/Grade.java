import java.util.Scanner; 
public class Grade {
    
    public static void main(String[] args) {
        Grade gradeOfStudent=new Grade();
        gradeOfStudent.gradeUsingIf();
        System.out.println("-----------------------------------");
        gradeOfStudent.gradeUsingSwitch();

    }

    
    void gradeUsingIf(){
        Scanner subjectIf=new Scanner(System.in);
        System.out.print("Enter the marks you obtained: ");
        int totalSub=5;
        int arrayy[]=new int[totalSub];
        int grade=0;
        for(int i=0;i<totalSub;i++){
            arrayy[i]=subjectIf.nextInt();
            grade+=arrayy[i];
        }
        
        int finalGrade=grade/totalSub;
        if(finalGrade>=85 && finalGrade<=100){
            System.out.println("Grade 'A'");
        }else if(finalGrade>=70){
            System.out.println("Grade 'B'");
        }else if(finalGrade>=50){
            System.out.println("Grade 'C'");
        }else{
            System.out.println("Fail");
        }
        subjectIf.close();
    }
    void gradeUsingSwitch(){

        Scanner subjectSwitch=new Scanner(System.in);
        System.out.print("Enter the marks you obtained: ");
        int total=5;
        int arrayy[]=new int[total];
        int grade=0;
        for(int i=0;i<total;i++){
            arrayy[i]=subjectSwitch.nextInt();
            grade+=arrayy[i];
        }
        int finalGrade=grade/total;
        switch (finalGrade/10) {
            case 10:
            case 9:
                System.out.println("Grade 'A'");
                break;
            case 8:
                if(finalGrade<=84){System.out.println("Grade 'B'");}
                else{System.out.println('A');}
                break;
            case 7:
            case 6:
                System.out.println("Grade 'B'");
                break;
            case 5:
                System.out.println("Grade 'c'");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter the sufficient values.");
                break;
        }
        subjectSwitch.close();
    }
}
