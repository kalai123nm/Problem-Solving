import java.io.FileWriter;
import java.io.IOException;

public class AppendQn04 {
    public static void main(String[] args) {
        try {
            FileWriter fwr=new FileWriter("fileQn01.txt",true);
            fwr.write("\nnullable");
            fwr.append("\nnullable values are null only");
            System.out.println("append successfully");
            fwr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
