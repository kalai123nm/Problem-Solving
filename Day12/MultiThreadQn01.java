public class MultiThreadQn01{
    public static void main(String[] args) {
        MyThread myT=new MyThread();
        myT.start();
        MyThread obj1=new MyThread();
        MyThread obj2=new MyThread();
        obj1.start();
        obj2.start();
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.getMessage();
            }
            System.out.println(currentThread().getName()+" is running\n");
        }
    }
}