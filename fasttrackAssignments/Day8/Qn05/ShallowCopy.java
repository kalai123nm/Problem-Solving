public class ShallowCopy{
    public static void main(String[] args) throws CloneNotSupportedException {
        Student st1=new Student( "kalai");

        StudentData stD1=new StudentData(21,"IT", st1);
        StudentData stD2=(StudentData)stD1.clone();

        System.out.println("\nBefore\n");

        stD1.displayAll();
        stD2.displayAll();

        stD2.dept="Mech";
        stD2.rollNo=12;
        stD2.stu.name="selva";
        

        System.out.println("\nAfter\n");

        stD1.displayAll();
        stD2.displayAll();
    }
}

class Student{
    String name;
    Student( String name){ 
        this.name=name;
    }
}

class StudentData implements Cloneable{
    int rollNo;
    String dept;
    Student stu;
    StudentData(int rollNo,String dept, Student stu){
        this.rollNo=rollNo;
        this.dept=dept;
        this.stu=stu;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
        
    }

    public void displayAll(){
        System.out.println("Roll No: "+rollNo+"  Name: "+stu.name+"  Department: "+dept);
    }
}