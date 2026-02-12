public class Practice{
    public static void main(String[] args) {
        // Eat<Integer> met=new Eat(14);
        // met.rabbit();
        String x="C";
        int s=Integer.parseInt(x);
        System.out.println(s);
    }
}
class Eat{
    public <K>rabbit (K kay){
        System.out.println(kay);
    }
    
}