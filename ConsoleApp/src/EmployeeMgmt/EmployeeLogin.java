package EmployeeMgmt;

import java.util.Scanner;

public class EmployeeLogin {

    private Scanner input;
        private EmployeeDetails employee;

        public EmployeeLogin(Scanner input){
            this.input=input;
        }

    public void employeeMenu() {

        System.out.println("Enter your Employee ID: ");
        int id=input.nextInt();

        this.employee=EmployeeStore.employees.get(id);
        if(employee==null){
            System.out.println("Invalid Employee ID! ");
            return;
        }

        int num = 0;
        do {
            System.out.println("\n1. View My Details");
            System.out.println("2. View my attendance");
            System.out.println("3. Logout");
            num = input.nextInt();
            switch (num) {
                case 1:
                    employee.display();
                    break;
                case 2:
                    String status=AttendanceStore.attendanceHashMap.get(employee.getEmp_ID());
                    if(status==null){
                        System.out.println("Attendance not marked yet");
                    }else{
                        System.out.println("Your attendance "+ status);
                    }
                    break;
                case 3:
                    System.out.println("Successfully logged out from EmployeeMenu\n");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (num != 3);
        // input.close();
    }
}