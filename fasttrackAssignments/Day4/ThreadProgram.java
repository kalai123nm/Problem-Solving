import java.io.*;

public class ThreadProgram {
    public static void main(String[] args) throws IOException {
      System.out.println("Let's go!!!!");
      threads1 threa=new threads1();
      threa.start();
      Runnable ru=new threads2();
      Thread t2=new Thread(ru);
      t2.start();
      try {
        t2.join();
      } catch (Exception e) {
        System.out.println("threa joins threa2");
      }
      for(int i=0;i<7;i++){
        System.out.println("Main thread."+i);
      }
      System.out.println("Finished....:)");
    }
}
class threads1 extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
            System.out.println("threads1 is running "+i);
            Thread.sleep(500);
            }
        }catch(InterruptedException ii){
            System.out.println("threads1 is interrupted. "+ii);
        }
    }
}
class threads2 implements Runnable{

    @Override
    public void run() {
        try{
            for(int i=0;i<=5;i++){
            System.out.println("threads2 is running :"+i);
            Thread.sleep(500);
            }
        }catch(InterruptedException iii){
            System.out.println("threads2 is interrupted. "+iii);
        }
    }
    
}