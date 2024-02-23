class Thread3 extends Runnable{

    int x;

    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" "+ x);

            try{
                Thread.sleep(1000); //1000 mitisecond 1 sec
            }catch(Exception e){ }
        }
    }   
}
class RunThread3{
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        t1.x=50;
        Thread tt1 = new Thread("Thread1");
        tt1.start();

        Thread3 t2 = new Thread3();
        t2.x=100;
        Thread tt2 = new Thread("Thread2");
        tt2.start();

        Thread3 t3 = new Thread3();
        t3.x=150;
        Thread tt3 = new Thread("Thread3");
        tt3.start();

        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName());
               try{
                Thread.sleep(1000);
               }catch(Exception e){ }
               
        }
    }
}
