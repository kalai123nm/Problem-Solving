
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 
public class MenuDrivenQn02 {
    public static void main(String[] args) throws IOException{
        Scanner scan=new Scanner(System.in);
        MenuDrivenQn02 menu=new MenuDrivenQn02();

        try{
            int num=0;
            while (num!=6) {
                System.out.println("\n-==- MENU -==-\n");
                System.out.println("1. --> Read Content from the user and write it into another file.");
                System.out.println("2. --> Write it to another file into another file.");
                System.out.println("3. --> Modify the content of the file.");
                System.out.println("4. --> Search a particular word from the file and display how many times it appears.");
                System.out.println("5. --> Read the content of the .txt file and copy them into .csv file.");
                System.out.println("6. --> Exit");
                num=scan.nextInt();
                scan.nextLine();
                switch (num) {
                    case 1:
                        menu.readAnotherFile(scan);
                        break;
                    case 2:
                        menu.writeIntoAnotherFile();
                        break;
                    case 3:
                        menu.modifyContent(scan);
                        break;
                    case 4:
                        menu.searchWord(scan);
                        break;
                    case 5:
                        menu.copyToCSVFile();
                        break;
                    case 6:
                        System.out.println("Exiting.....");
                        break;
                    default:
                        System.out.println("Choose the valid Option.");
                        break;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            scan.close();
        }
    }

    void readAnotherFile(Scanner scan) throws IOException{

        // File file=new File("readFromUser.txt");
        // if(!file.exists()){
        //     file.createNewFile();
        //     System.out.println("File created.");
        // }else{
        //     System.out.println("File already exists. And the file name is "+file.getName());
        // }

        System.out.print("Write your contents here. ");
        String content=scan.nextLine();
        // BufferedReader bfr= new BufferedReader(new FileReader("readFromUser.txt"));
        // String lin;
        // while ((lin=bfr.readLine())!=null) {
            FileWriter fwr=new FileWriter("readFromUser.txt");
            fwr.write(content);
            System.out.println("Content written successfully.");
            // System.out.println(lin);
            fwr.close();
        // }bfr.close();
        
    }

    void writeIntoAnotherFile() throws IOException{
        File Afile=new File("anotherFile.txt");
        if(!Afile.exists()){
            Afile.createNewFile();
            System.out.println("Another File created.");
        }else{
            System.out.println("Another File already exists. "+Afile.getName());
        }
        BufferedReader bfr=new BufferedReader(new FileReader("readFromUser.txt"));
        String line;
        while((line=bfr.readLine())!=null){
            FileWriter fwr=new FileWriter("anotherFile.txt");
            fwr.write(line);
            fwr.close();
        }
        bfr.close();
    }

    void modifyContent(Scanner scan)throws IOException{
        
        System.out.println("Write what do u want to modify. ");
        StringBuilder strBuilder=new StringBuilder();
        while (true) {
            String modify=scan.nextLine();
            if(modify.equalsIgnoreCase("End")){
                break;
            }
            strBuilder.append(modify).append(System.lineSeparator());
        }
        
        
        
        BufferedReader bfr=new BufferedReader(new FileReader("anotherFile.txt"));
        String str;
        while((str=bfr.readLine())!=null){

        }
        FileWriter fwr=new FileWriter("anotherFile.txt",true);
            fwr.write(strBuilder.toString());
            fwr.close();
        
        bfr.close();
        
    }

    void searchWord(Scanner scan)throws IOException{

        BufferedReader bfr=new BufferedReader(new FileReader("anotherFile.txt"));
        System.out.print("Enter the word that you want to search. ");
        String word=scan.nextLine();
        String str;
        int count=0;
        while((str=bfr.readLine())!=null){
            String string[]=str.toLowerCase().split("\\s+");
            for (String str2 : string) {
                String words=str2.replaceAll("[.-?-!]","");
                if(words.equals(word)){
                count++;
                }
            } 
        }if(count>0){
            System.out.println("Yes, "+word+" was found in the file "+count+" times.");
        }else{
                System.out.println("No, the word you entered was not found in the file.");
        }
        bfr.close();
    }

    void copyToCSVFile()throws IOException{
        // File csvFile=new File("csvFile.csv");
        // if(!csvFile.exists()){
        //     csvFile.createNewFile();
        //     System.out.println(".csv file created.");
        // }else{
        //     System.out.println("File already exists....");
        // }
        BufferedReader bfr=new BufferedReader(new FileReader("anotherFile.txt"));
        String str;
        while((str=bfr.readLine())!=null){
            FileWriter fw=new FileWriter("csvFile.csv");
            fw.write(str);
            fw.close();
        }
        bfr.close();
    }
}

