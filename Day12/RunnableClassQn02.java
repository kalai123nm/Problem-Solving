public class RunnableClassQn02 {
    public static void main(String[] args) {
        TaskRunner taskR=new TaskRunner();
        
        Thread taskObj1=new Thread(taskR);
        Thread taskObj2=new Thread(taskR);
        taskObj1.start();
        taskObj2.start();
    }
}

class TaskRunner implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            try { 
                Thread.sleep(1000);
                System.out.println("Runnable method "+i+" "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}