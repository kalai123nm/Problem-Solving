public class EmployeeDetails {


    private int emp_ID;
    private String emp_name;
    private String emp_dept;
    private String emp_role;
    private String emp_DOJ;

    public EmployeeDetails(int ID, String name, String dept, String role, String DOJ) {
        this.emp_ID = ID;
        this.emp_name = name;
        this.emp_dept = dept;
        this.emp_role = role;
        this.emp_DOJ = DOJ;
    }

    public int getEmp_ID() {
        return emp_ID;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_dept() {
        return emp_dept;
    }

    public void setEmp_dept(String emp_dept) {
        this.emp_dept = emp_dept;
    }

    public String getEmp_role() {
        return emp_role;
    }

    public void setEmp_role(String emp_role) {
        this.emp_role = emp_role;
    }

    public String getEmp_DOJ() {
        return emp_DOJ;
    }

    public void setEmp_DOJ(String emp_DOJ) {
        this.emp_DOJ = emp_DOJ;
    }

    public void display() {
        System.out.println("\nEmployee ID   : " + emp_ID);
        System.out.println("Name          : " + emp_name);
        System.out.println("Date of Join  : " + emp_DOJ);
        System.out.println("Department    : " + emp_dept);
        System.out.println("Role          : " + emp_role);
        System.out.println("--------------------------------");
    }
}
