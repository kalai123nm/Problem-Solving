public class EmployeeQn03{
    public static void main(String[] args) {
        FullTimeEmployee full=new FullTimeEmployee(1500, 25);
        System.out.println("Salary for FullTime Employee: "+full.calculateSalary());
        System.out.println();
        PartTimeEmployee part=new PartTimeEmployee(500, 27);
        System.out.println("Salary for PartTime Employee: "+part.calculateSalary());
    }
}
class Employee{
    protected double salary;
    protected int totalWorkingDays;

    public Employee(double salary, int totalWorkingDays) {
        this.salary=salary;
        this.totalWorkingDays=totalWorkingDays;
    }

    double calculateSalary(){
        return salary*totalWorkingDays;
    }
}
class FullTimeEmployee extends Employee{
    FullTimeEmployee(double fullSalary, int fullWorkingDays){
        super(fullSalary, fullWorkingDays);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary();
    }
}
class PartTimeEmployee extends Employee{
    PartTimeEmployee(double partSalary, int partWorkingDays){
        super(partSalary, partWorkingDays);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary();
    }
}