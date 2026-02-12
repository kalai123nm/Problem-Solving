package fitnessGYM.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class WorkoutPlan {
    private String level;
    private Map<String, String> weeklyPlan;

    public WorkoutPlan(String level){
        this.level=level;
        this.weeklyPlan=new LinkedHashMap<>();
    }
    public void addWorkout(String day, String workout){
        weeklyPlan.put(day, workout);
    }
    public String getLevel(){
        return level;
    } 
    public Map<String, String> getWeeklyPlan(){
        return weeklyPlan;
    }
}
