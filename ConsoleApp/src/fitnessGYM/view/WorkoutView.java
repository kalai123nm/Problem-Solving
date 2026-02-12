package fitnessGYM.view;
import java.util.Map;

import fitnessGYM.model.User;
import fitnessGYM.model.WorkoutPlan;

public class WorkoutView {
    public void displayUser(User user){
        System.out.println("\n-----------User Details-----------");
        System.out.println("Gender :  "+user.getGender());
        System.out.println("Age :  "+user.getAge());
        System.out.println("Weight :  "+user.getWeight());
        System.out.println("Level :  "+user.getLevel());

    }
    public void displayWorkout(WorkoutPlan plan){
        System.out.println();
        System.out.println("----------  "+plan.getLevel()+" Workout Plan----------");
        Map<String, String> weeklyPlan=plan.getWeeklyPlan();
        for(String day: weeklyPlan.keySet()){
            System.out.println(day+" : "+weeklyPlan.get(day));
        }
    }
}
