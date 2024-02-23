import java.util.Date;

class RunnableJob implements Runnable{
    
    public void run(){
        Thread thread = Thread.currentThread();
        System.out.println(("RunnableJob is being run by " + thread.getName() +" at " +new Date()));
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class ThreadJobExample1{

    public static void main(String[] args) throws InterruptedException{
        RunnableJob runnableJob = new RunnableJob();

        Thread thread1 = new Thread(runnableJob,"T1");
        Thread thread2 = new Thread(runnableJob,"T2");
        Thread thread3 = new Thread(runnableJob,"T3");
        Thread thread4 = new Thread(runnableJob,"T4");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        thread4.start();
        thread4.join();

        Thread thread5 = new Thread(runnableJob,"T1");
        Thread thread6 = new Thread(runnableJob,"T2");
        Thread thread7 = new Thread(runnableJob,"T3");
        Thread thread8 = new Thread(runnableJob,"T4");

        thread5.start();
        thread5.join();
        thread6.start();
        thread6.join();
        thread7.start();
        thread7.join();
        thread8.start();
        thread8.join();
    }
}
