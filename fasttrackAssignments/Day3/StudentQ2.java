public class StudentQ2 {

    static class Student{
        String name;
        int roll_no;
        int phone_no;
        String address;

        Student(String name, int roll_no, int phone_no,String address){
            // this.name=name;
            // this.roll_no=roll_no;
            // this.phone_no=phone_no;
            // this.address=address;
            System.out.println("Name: "+name);
            System.out.println("Roll_number: "+roll_no);
            System.out.println("Phone_number: "+phone_no);
            System.out.println("Address: "+address);
        }
    }


    public static void main(String[] args) {
        Student StudentValue1=new Student("Sam", 11, 123456, "Queensland");
        System.out.println("-------****-----------------********-----------");
        Student StudentValue2=new Student("John", 12, 654321, "Kingsland");        
    }
}


// Name: Sam
// Roll_number: 11
// Phone_number: 123456
// Address: Queensland
// -------****-----------------********-----------
// Name: John
// Roll_number: 12
// Phone_number: 654321
// Address: Kingsland