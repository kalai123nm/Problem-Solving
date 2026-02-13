package EmployeeMgmt;

import java.util.Scanner;

public class AdminLogin {

    private Scanner input;

    public AdminLogin(Scanner input) {
        this.input = input;
    }

    public void adminMenu() {

        int num1 = 0;
        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View all employees");
            System.out.println("3. Update employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Attendance");
            System.out.println("6. Logout");

            num1 = input.nextInt();

            switch (num1) {
                case 1:
                    addEmp();
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    System.out.println("1. Mark Attendance");
                    System.out.println("2. View Attendance");
                    int choice = input.nextInt();

                    if (choice == 1) {
                        markAttendance();
                    } else if (choice == 2) {
                        viewAttendance();
                    }
                    break;

                case 6:
                    System.out.println("Logged Out from Admin Menu\n");
                    break;
            }
        } while (num1 < 6);
        // input.close();
    }

    private void addEmployee() {
        System.out.println("Enter employee ID: ");
        int id = input.nextInt();
        input.nextLine();

        if (EmployeeStore.employees.containsKey(id)) {
            System.out.println("Employee ID already exists");
            return;
        }

        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter Role/Designation: ");
        String role = input.nextLine();
        System.out.println("Enter Department: ");
        String dept = input.nextLine();
        System.out.println("Enter Date Of Joining: ");
        String doj = input.nextLine();

        EmployeeDetails emp = new EmployeeDetails(id, name, dept, role, doj);
        EmployeeStore.employees.put(id, emp);
        System.out.println("Employee Added Successfully");

    }

    public void addEmp() {
        addEmployee();
    }

    private void viewAllEmployees() {
        if (EmployeeStore.employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        for (EmployeeDetails emp : EmployeeStore.employees.values()) {
            emp.display();
        }
    }

    private void updateEmployee() {
        System.out.println("Enter Employee ID to update: ");
        int id = input.nextInt();
        input.nextLine();

        EmployeeDetails emp = EmployeeStore.employees.get(id);

        if (emp == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.println("\nCurrent Details: ");
        emp.display();
        int num = 0;
        do {
            System.out.println("\nEnter the Details you want to update: ");
            System.out.println("1. Name");
            System.out.println("2. Department");
            System.out.println("3. Role");
            System.out.println("4. DOJ");
            System.out.println("5. Exit");
            num = input.nextInt();
            input.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Enter new name: ");
                    String name = input.nextLine();
                    if (!name.isEmpty()) {
                        emp.setEmp_name(name);
                    }
                    break;
                case 2:
                    System.out.println("Enter new Department: ");
                    String dept = input.nextLine();
                    if (!dept.isEmpty()) {
                        emp.setEmp_dept(dept);
                    }
                    break;
                case 3:
                    System.out.println("Enter new Role: ");
                    String role = input.nextLine();
                    if (!role.isEmpty()) {
                        emp.setEmp_role(role);
                    }
                    break;
                case 4:
                    System.out.println("Enter new DOJ: ");
                    String doj = input.nextLine();
                    if (!doj.isEmpty()) {
                        emp.setEmp_DOJ(doj);
                    }
                    break;
            }

        } while (num != 5);
        System.out.println("Employee details updated successfully");

    }

    private void deleteEmployee() {
        System.out.println("\nEnter employee ID to delete: ");
        int id = input.nextInt();
        if (!EmployeeStore.employees.containsKey(id)) {
            System.out.println("No such Employee id found!");
            return;
        }

        EmployeeStore.employees.remove(id);
        System.out.println("Employee deleted successfully");
    }

    private void markAttendance() {
        System.out.println("Enter employee ID: ");
        int id = input.nextInt();
        if (!EmployeeStore.employees.containsKey(id)) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.println("1. Present");
        System.out.println("2. Absent");
        int choice = input.nextInt();

        String status = (choice == 1) ? "present" : "absent";
        AttendanceStore.attendanceHashMap.put(id, status);
        System.out.println("Attendance marked successfully");

    }

    private void viewAttendance() {
        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();

        if (!EmployeeStore.employees.containsKey(id)) {
            System.out.println("Employee not found!");
            return;
        }

        String status = AttendanceStore.attendanceHashMap.get(id);

        if (status == null) {
            System.out.println("Attendance not marked yet.");
        } else {
            System.out.println("Attendance Status: " + status);
        }
    }
}
