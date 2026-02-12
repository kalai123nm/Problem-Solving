public class StudentQn1{
    String name;  //instance variables
    int roll_no;
    StudentQn1(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
        // System.out.println("name: "+name+ "\nroll_no: "+roll_no);
    }
    public static void main(String[] args) {
        StudentQn1 value=new StudentQn1("John",2);
        // System.out.println(value.name +" "+value.roll_no);
    }
}
