import java.io.File;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        File f=new File("ExFile1.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
