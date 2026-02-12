import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReaderEx{
    public static void main(String[] args) throws IOException {
        try {
            // File fil=new File("ExampleFile.txt");
            // if(fil.createNewFile()){
            //     System.out.println("Created "+fil.getName()+ " is file name.");
            // }else{
            //     System.out.println("An error occured while trying to create a new file.");
            // }

            // FileWriter fww=new FileWriter("ExampleFile.txt");
            // fww.write("null0123456789abcdefghijklmnopqrstuvwxyz");
            // PrintWriter pw=new PrintWriter(fww);
            // pw.println("\nHello");
            // pw.append("ha he ha he");
            // pw.append("typingggg", 1, 6);
            // PrintWriter pw=new PrintWriter("ExampleFile.txt");
            // pw.write("right");
            // pw.print("\n\nWriteeer");
            // pw.close();

            // FileWriter fw=new FileWriter("ExampleFile.txt",true);
            // fw.write("\nkalai...");
            // fw.close();

            FileReader file=new FileReader("ExampleFile.txt");
            BufferedReader reader=new BufferedReader(file);
            String lline;

            while ((lline=reader.readLine())!=null) {
                System.out.println(lline+" "+lline.length());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}