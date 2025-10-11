import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileQn03 {
    public static void main(String[] args){
        try {
            FileReader fReader= new FileReader("fileQn01.txt");
            BufferedReader bReader=new BufferedReader(fReader);
            String str;
            int wordCount=0;
            int charCount=0;
            int numLines=0;
            while ((str=bReader.readLine())!=null) {
                System.out.println(str);
                
                String[] words=str.split("\\s+");
                wordCount+=words.length;
                charCount+=str.length();
                numLines++;
            }
            System.out.println  ("\nTotal words are: "+wordCount);
            System.out.println("Total characters: "+charCount);
            System.out.println("Total lines: "+numLines);
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
