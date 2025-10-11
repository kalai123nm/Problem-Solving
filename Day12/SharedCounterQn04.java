public class SharedCounterQn04 {
    public static void main(String[] args) {
        

    }
}

class SpawnThread{
    private int count=0;

    public synchronized void methodOne(){
        for(int i=1;i<=1000;i++){
            count++;
        }
    }
    public synchronized void methodTwo(){
        for(int i=0;i<=1000;i++){
            count++;
        }
    }
    public synchronized void methodThree(){
        for(int i=0;i<=1000;i++){
            count++;
        }
    }
}
