public class Employee {
    // instance variables declared
        int empId;
        String name;
        String department;
        double salary;
    // constructor
    Employee(int empId, String name, String department, double salary){
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Department: "+department);
        System.out.println("Employee Salary: "+salary);
    }
    public static void main(String[] args) {
        Employee dot=new Employee(07, "First Name", "Human Resource", 70000.00);
    }
}
