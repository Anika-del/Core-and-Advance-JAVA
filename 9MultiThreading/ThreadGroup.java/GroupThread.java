class Thread1 implements Runnable{

    public void run(){
        for(int i=1; i<=15; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);

            }catch(Exception e){ }
        }
    }
}

class GroupThread {

    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("rr");
        Thread1 t1 = new Thread1();
        Thread1 t3 = new Thread1(tg,t1,"thread1");
        Thread1 t4 = new Thread1(tg,t1,"thread2");
        Thread1 t5 = new Thread1(tg,t1,"thread3");
        t3.start();
        t4.start();
        t5.start();



    }
    
}
