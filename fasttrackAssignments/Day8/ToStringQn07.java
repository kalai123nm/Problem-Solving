import java.util.Arrays;
public class ToStringQn07 {
    public static void main(String[] args) {
        String[] myHobbies={"chess","coding","playing"};
        NewClass nc= new NewClass(myHobbies,"kalai",2);
        NewClass nc1=new NewClass(myHobbies, "selva", 7);
        
        System.out.println(nc);
        System.out.println(nc1);
    }
}
class NewClass{
    String[] myHobbies;
    String name;
    int k;

    NewClass(String[] myHobbies,String name, int k){
        this.myHobbies=myHobbies;
        this.name=name;
        this.k=k;
    }
    @Override
    public String toString() {      // this toString method will automatically invoked itself whenever we call an object.
        return k+" : "+" : "+name+" : "+Arrays.toString(myHobbies)+"\n";
    }
}

