public class IOExceptionQn09 {
    public static void main(String[] args) throws FileNotFoundException {
        IOExceptionQn09 ioEx=new IOExceptionQn09();
        ioEx.readFile();
    }
    void readFile(){
        if(true){

        }
    }
}

class FileNotFoundException extends Exception{
    public FileNotFoundException(String msg){
        super(msg);
    }
}