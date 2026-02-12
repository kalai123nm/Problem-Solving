public class CommandLineQn04 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("No arguments found ");
            
        }else{
            System.out.println("Total arguments length "+args.length);
            System.out.println("Strings are: \n");
            for (String str : args) {
                System.out.println(str);
            }
        }
    }
}
