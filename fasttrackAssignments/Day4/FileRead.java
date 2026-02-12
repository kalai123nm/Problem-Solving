import java.io.*;
public class FileRead {
    public static void main(String[] args) throws IOException {
        try{
        BufferedReader bfr=new BufferedReader(new FileReader("example.txt"));
        BufferedWriter bfw=new BufferedWriter(new FileWriter("example.txt"));
        bfw.write("hello kalaiiii...\n");
        bfw.write("hi there..");
        bfw.close();
        }catch(IOException fi){
            System.out.println("File");
        }
        
    }
}
