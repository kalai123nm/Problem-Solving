package fitnessGYM.model;

public class User {
    private String gender;
    private String level;
    private int age;
    private double weight;

    public User(String gender, String level, int age, double weight){
        this.age=age;
        this.level=level;
        this.gender=gender;
        this.weight=weight;
    }
    public String getGender(){
        return gender;
    }
    public String getLevel(){
        return level;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
}
