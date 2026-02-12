package fitnessGYM;

import java.util.Scanner;

import fitnessGYM.controller.WorkoutController;
import fitnessGYM.model.User;
import fitnessGYM.view.WorkoutView;

public class WorkOutMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Gender: ");
        String gender = scan.nextLine();

        System.out.print("Enter Workout Level (Beginner / Intermediate / Expert): ");
        String level = scan.nextLine();

        System.out.print("Enter Age: ");
        int age = scan.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = scan.nextDouble();

        User user=new User(gender, level, age, weight);
        WorkoutView view=new WorkoutView();
        WorkoutController controller=new WorkoutController(view);

        controller.processWorkout(user);
        scan.close();
    }
}
