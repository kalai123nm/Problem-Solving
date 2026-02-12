import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class ReadFileQn01{
    public static void main(String[] args) {
        ReadFileQn01 rFile=new ReadFileQn01();
        try {
            FileWriter fw=new FileWriter("fileQn01.txt");
            fw.write("It's just the began.\nhehehehehehe heeee hee\nLight weight is height weight");
            fw.close();
            System.out.println("written successfully");
            // File fi=new File("fileQn01.txt");
            // if(fi.createNewFile()){
            //     System.out.println("File created: "+fi.getName()+" is the file name.");
            // }
            // else{
            //     System.out.println("File already exixts.");
            // }
            FileReader frr=new FileReader("fileQn01.txt");
            BufferedReader bfr=new BufferedReader(frr);
            String lle;
            while ((lle=bfr.readLine())!=null) {
                System.out.println(lle);
            }
            bfr.close();   
            //fi.mkdir();
        } catch (IOException e) {
            //System.out.println("An error occured while creating a file."+e.getMessage());
            e.printStackTrace();
        }
           
    }

}

// class FileNotFoundException extends Exception{
//     public FileNotFoundException(String msg){
//         super(msg);
//     }
// }