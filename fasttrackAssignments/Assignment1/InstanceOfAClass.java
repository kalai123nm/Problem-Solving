public class InstanceOfAClass {

    public static void main(String[] args) {
        InstanceOfAClass right=new InstanceOfAClass();
        if(right instanceof InstanceOfAClass){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}


