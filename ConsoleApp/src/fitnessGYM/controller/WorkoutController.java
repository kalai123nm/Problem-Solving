package fitnessGYM.controller;

import fitnessGYM.model.User;
import fitnessGYM.model.WorkoutPlan;
import fitnessGYM.view.WorkoutView;

public class WorkoutController {
    private WorkoutView view;
    
    public WorkoutController(WorkoutView view){
        this.view=view;
    }
    public void processWorkout(User user){
        WorkoutPlan plan=new WorkoutPlan(user.getLevel());

        switch (plan.getLevel().toLowerCase()) {
            case "beginner":
                beginnerPlan(plan);
                break;
            case "intermediate":
                intermediatePlan(plan);
                break;
            case "expert":
                expertPlan(plan);
                break;
            default:
                System.out.println("Invalid workout Level selected! please select valid level");
                return;
        }
        view.displayUser(user);
        view.displayWorkout(plan);
    }

    private void beginnerPlan(WorkoutPlan plan) {
        plan.addWorkout("Monday", "Full Body Workout");
        plan.addWorkout("Tuesday", "Rest / Walking");
        plan.addWorkout("Wednesday", "Full Body Workout");
        plan.addWorkout("Thursday", "Rest");
        plan.addWorkout("Friday", "Full Body Workout");
        plan.addWorkout("Saturday", "Light Cardio");
        plan.addWorkout("Sunday", "Rest");
    }

    private void intermediatePlan(WorkoutPlan plan) {
        plan.addWorkout("Monday", "Chest + Triceps");
        plan.addWorkout("Tuesday", "Back + Biceps");
        plan.addWorkout("Wednesday", "Legs");
        plan.addWorkout("Thursday", "Shoulders + Abs");
        plan.addWorkout("Friday", "Arms + Cardio");
        plan.addWorkout("Saturday", "Active Recovery");
        plan.addWorkout("Sunday", "Rest");
    }

    private void expertPlan(WorkoutPlan plan) {
        plan.addWorkout("Monday", "Push (Chest, Shoulder, Triceps)");
        plan.addWorkout("Tuesday", "Pull (Back, Biceps)");
        plan.addWorkout("Wednesday", "Legs");
        plan.addWorkout("Thursday", "Core + Cardio");
        plan.addWorkout("Friday", "Push");
        plan.addWorkout("Saturday", "Pull");
        plan.addWorkout("Sunday", "Rest");
    }
}
