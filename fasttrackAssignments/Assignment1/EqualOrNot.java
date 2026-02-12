public class EqualOrNot {
    public static void main(String[] args) {
        int first=15;
        int second=15;
        switch (first^second) {
            case 0:
                System.out.println("equals");
                break;
            default:
                System.out.println("not");
                break;
        }
    }
}