public class OddAndEvenQn03 {
    public static void main(String[] args) {
        EvenOddClass evenodd=new EvenOddClass();

        Thread t1=new Thread(()-> evenodd.runOdd());
        Thread t2=new Thread(()-> evenodd.runEven());

        // Thread t1=new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         evenodd.runOdd();
        //     }
        // });
        
        // Thread t2=new Thread(new Runnable() {
        //     @Override
        //     public void run(){
        //         evenodd.runEven();
        //     }
        // });
        
        t1.start();
        t2.start();
    }
}

class EvenOddClass{
    private int num=1;
    private final int max=20;

    public synchronized void runOdd(){
        while(num<=max){
            while (num%2==0) {
                try{
                    wait();
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }        
            }
            if(num<=max){
                System.out.println(num+" "+Thread.currentThread().getName());
                num++;
                notify();
            }        
        }
    }
    public synchronized void runEven(){
        while(num<=20){
            while(num%2!=0){
                try{
                    wait();
                }catch(InterruptedException f){
                    System.out.println(f.getMessage());
                }
            }
            if(num<=max){
                System.out.println(num+" "+Thread.currentThread().getName());
                num++;
                notify();
            }
        }
    }
}
