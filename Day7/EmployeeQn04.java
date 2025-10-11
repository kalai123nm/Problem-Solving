import java.util.Scanner;

public class EmployeeQn04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Employee part=new PartTimeEmployee();
        Employee full=new FullTimeEmployee();
        int num=0;

        do {
            System.out.println("\n=== Employee Salary Menu ===");
            System.out.println("1. PartTime Employee.");
            System.out.println("2. FullTime Employee.");
            System.out.println("3. Exitig.");
            num=scan.nextInt();

            switch (num) {
                case 1:
                    part.calculateSalary(300, 28);
                    break;
                case 2:
                    full.calculateSalary(1050, 29);
                    break;   
                case 3:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Choose the valid option.");
                    break;
            }
        } while (num!=3);
        
        scan.close();
    }
}


interface Employee{
    abstract void calculateSalary(double oneDaySalary,int attendance);
}

class FullTimeEmployee implements Employee{

    @Override
    public void calculateSalary(double oneDaySalary, int attendance) {
        System.out.println("Monthly salary of a fullTimeEmployee: "+oneDaySalary*attendance);
    }
}

class PartTimeEmployee implements Employee{

    @Override
    public void calculateSalary(double oneDaySalary, int attendance) {
        System.out.println("Monthly salary of a partTimeEmployee: "+oneDaySalary*attendance);
    }
}