import java.io.*;
public class FileReaderWriter {
    public static void main(String[] args)throws IOException {
        File fi=new File("example.txt");
        try{
            if(fi.exists()){
                System.out.println("File exists. Rerading Contents");
            }else{
                fi.createNewFile();
                System.out.println("new File created. And the file name is: "+fi.getName());
            }

            BufferedReader bufferedR=new BufferedReader(new FileReader("example.txt"));
            String line;
            while((line=bufferedR.readLine())!=null){
                System.out.println("Line is "+line);
            }
            bufferedR.close();
        }catch(IOException f){
            System.out.println("Something went wrong...."+f);
        }
    }
}
