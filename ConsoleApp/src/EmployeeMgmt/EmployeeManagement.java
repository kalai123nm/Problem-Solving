// Employee Management System	---  This console application used to manage employee records in an organization.
// It allows the user (admin) to store, view, update, and delete employee details in a simple and structured way.

import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // AdminLogin adminLogin=new AdminLogin();
        int num=0;

        do{
            System.out.println("\nChoose your login: ");
            System.out.println("1. Admin Login");
            System.out.println("2. Employee Login");
            System.out.println("3. Exit");
            num=input.nextInt();

            switch(num){
                case 1:
                    new AdminLogin(input).adminMenu();
                    break;
                case 2:
                    new EmployeeLogin(input).employeeMenu();
                    break;
                case 3:
                    System.out.println("Logged out successfully\n");
                    break;
            }

        }while(num<3);
        //input.close();
    }
    
}