public class Employee {

    private String employee_Name;
    private int employee_ID;
    private String Designation;
    private int salary;

    Employee(){  //non-parameterized constructor
        System.out.println(employee_Name+" \n"+employee_ID+" \n"+Designation+" \n"+salary);
        
    }

    // parameterized constructor
    Employee(String employee_Name, int employee_ID, String Designation, int salary){
        this.employee_Name=employee_Name;
        this.employee_ID=employee_ID;
        this.Designation=Designation;
        this.salary=salary;
    }

    // copy constructor
    Employee(Employee copyConstructor){
        Employee temp=copyConstructor;
        temp.printMethod();
        // employee_Name=copyConstructor.employee_Name;
        // employee_ID=copyConstructor.employee_ID;
        // Designation=copyConstructor.Designation;
        // salary=copyConstructor.salary;
         
    }
    void printMethod(){
        System.out.println("Employee name: "+employee_Name+" \n"+"Employee_ID: "+employee_ID+" \n"+"Designation: "+Designation+" \n"+"Salary: "+salary);
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
        System.out.println("The object has been created, and sets default values for all the fields.");
        Employee value1=new Employee();  //object with no-argument constructor

        // object with parameterized constructor
        Employee value2=new Employee("Lucy",11,"SowftwareDeveloper",20000);
        Employee value3=new Employee(value2);  // object with copy constructor
        value2.printMethod();
     
    }
}
