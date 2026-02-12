import java.util.ArrayList;
import java.util.Collections;

public class ComparableQn03 {
    public static void main(String[] args) {
        ArrayList<StudentComparable>arrayL=new ArrayList<>();
        arrayL.add(new StudentComparable("kalai", 19, 98));
        arrayL.add(new StudentComparable("selva", 23, 81));
        arrayL.add(new StudentComparable("laika", 28, 88));

        Collections.sort(arrayL);

        for (StudentComparable l : arrayL) {
            System.out.println(l);
        }
    }
}

class StudentComparable implements Comparable<StudentComparable>{
    String name;
    int age,marks;

    StudentComparable(String name, int age, int marks){
        this.marks=marks;
        this.age=age;
        this.name=name;
    }

    @Override
    public int compareTo(StudentComparable obj1) {
        return this.name.compareTo(obj1.name);
    }
    public String toString(){
        return (name+" - "+age+" - "+marks);
    }
}
