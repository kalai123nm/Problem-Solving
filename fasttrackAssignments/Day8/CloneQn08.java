public class CloneQn08 {
    public static void main(String[] args){
        Student stu=new Student("Kalai", "IT", 21);
        
        CloneSample cloneS;
        try{
            cloneS=new CloneSample(stu);
            CloneSample sampleC=(CloneSample)cloneS.clone();
            cloneS.CopyMethod(stu);
            sampleC.CopyMethod(stu);
            // sampleC.stu.name="selva";
            // sampleC.CopyMethod(stu);
            // cloneS.CopyMethod(stu);
        }catch(CloneNotSupportedException c){
            System.out.println("Clone Not Supported...");
        }

    }
}

class Student{
    String name,department;
    int rollno;

    Student(String name, String department, int rollno){
        this.name=name;
        this.department=department;
        this.rollno=rollno;
    }
    
}

class CloneSample implements Cloneable{ //
    Student stu; 
    CloneSample(Student stu){
        this.stu=stu;
    }
    public Object  clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public void CopyMethod(Student stu){
        System.out.println("Name : "+stu.name+" | RollNo : "+stu.rollno+" | Department : "+stu.department);
    }
}