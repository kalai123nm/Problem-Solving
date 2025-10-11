public class EmployeeQnNo03{
    public static void main(String[] args) {
        EmployeeQnNo03 employ=new EmployeeQnNo03();
        employ.displayEmpSalary(123, "ragu", "TeamLeader", "Digital Marketing", 34000);
        employ.displayEmpSalary(124, "jubiksha", "Another TL", "EmailMarketing", 30000);
    }

    private String emp_Name,emp_designation, emp_dept;
    private int emp_ID;
    private double emp_monthly_salary;

    void setEmp_ID(int emp_ID){
        this.emp_ID=emp_ID;
    }
    void setEmp_Name(String emp_Name){
        this.emp_Name=emp_Name;
    }
    void setEmp_dept(String emp_dept){
        this.emp_dept=emp_dept;
    }
    void setEmp_designation(String emp_designation){
        this.emp_designation=emp_designation;
    }
    void setEmp_monthly_salary(double emp_monthly_salary){
        this.emp_monthly_salary=emp_monthly_salary;
    }
    
    int getEmp_ID(){
        return emp_ID;
    }
    String getEmp_Name(){
        return emp_Name;
    }
    String getEmp_dept(){
        return emp_dept;
    }
    String getEmp_designation(){
        return emp_designation;
    }
    double getEmp_monthly_salary(){
        return emp_monthly_salary;
    }

    double calculate(double emp_monthly_salary){
        return emp_monthly_salary*12;
    }
    void displayEmpSalary(int emp_ID, String emp_Name, String emp_designation, String emp_dept,double emp_monthly_salary){
        System.out.println("-----Employee Pay-slip-----");
        System.out.println("Employee ID: "+emp_ID+"\nEmployee Name: "+emp_Name+"\nEmployee Designation: "+emp_designation+"\nEmployee Department: "+emp_dept+"\nEmployee Monthly Salary: "+emp_monthly_salary);
        System.out.println("Annual salary is: "+calculate(52100));
        System.out.println();
    }
}