public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employee emp1=new Employee("kalai");

        EmpOthers e1=new EmpOthers(8, "XXX", emp1);

        EmpOthers ey1=(EmpOthers)e1.clone();

        System.out.println("\nbefore\n");
        e1.displays();
        ey1.displays();

        e1.companyName="zzz";
        e1.employ.name="selva";
        e1.workingHours=12;
        System.out.println("\nafter\n");

        e1.displays();
        ey1.displays();

    }
}

class Employee implements Cloneable{
    String name;
    Employee(String name){
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class EmpOthers implements Cloneable{
    int workingHours;
    String companyName;
    Employee employ;

    EmpOthers(int workingHours, String companyName, Employee employ){
        this.workingHours=workingHours;
        this.companyName=companyName;
        this.employ=employ;
    }

    public Object clone() throws CloneNotSupportedException{
        EmpOthers cloning=(EmpOthers)super.clone();
        cloning.employ=(Employee)employ.clone();
        return cloning;
    }
    void displays(){
        System.out.println("Name: "+employ.name+"  Company: "+companyName+"  Hours: "+workingHours);
    }
}
