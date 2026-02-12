import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorQn02 {
    public static void main(String[] args) {
        ArrayList<StudentComparator>aList=new ArrayList<>();
        aList.add(new StudentComparator("kalai", 96, 21));
        aList.add(new StudentComparator("Alim", 88, 25));
        aList.add(new StudentComparator("Abhu", 93, 18));
        aList.add(new StudentComparator("vinay", 77, 11));

        Collections.sort(aList,new ComparatorMy());

        for (StudentComparator jk : aList) {
            System.out.println(jk);
        }
    }
}

class StudentComparator{
    String name;
    int age, marks;
    StudentComparator(String name, int marks, int age){
        this.name=name;
        this.age=age; this.marks=marks;
    }
    public String toString(){
        return (name+ " - "+age+ " - "+marks);
    }
}

class ComparatorMy implements Comparator<StudentComparator>{

    @Override
    public int compare(StudentComparator obj1, StudentComparator obj2) {
        return obj1.marks-obj2.marks;
    }

}