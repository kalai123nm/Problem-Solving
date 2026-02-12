import java.util.Scanner;

public class EmployeeQn6 {
    public static void main(String[] args) {
        Employee EmployeeOne=new Employee("Robert",1994,64000,"WallsStreat");
        Employee EmployeeTwo=new Employee("Sam", 2000, 56000, "StreetWall");
        Employee EmployeeThree=new Employee("Jackob", 2013, 91000, "DubaiKurukkuSandhu");
        Employee EmployeeFour=new Employee("Bucky", 1996, 210000, "NewYork");
        System.out.printf("%-10s %-13s %-12s %-14s \n","Name","Joining","Salary","Address\n---------------------------------------------------");
        EmployeeOne.displayValue();
        EmployeeTwo.displayValue();
        EmployeeThree.displayValue();
        EmployeeFour.displayValue();

        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
    }
}
class Employee{
    String name;
    int year_Of_joining;
    int salary;
    String Address;

    public Employee(String emp_Name,int emp_Year_Of_Joining,int emp_Salary,String emp_Address){
        this.name=emp_Name;
        this.year_Of_joining=emp_Year_Of_Joining;
        this.salary=emp_Salary;
        this.Address=emp_Address;
    }
    void displayValue(){
        System.out.printf("%-10s %-13s %-12s %-14s \n",name,year_Of_joining,salary,Address);
    }

    
}