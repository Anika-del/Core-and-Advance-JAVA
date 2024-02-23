class Thread11 extends Thread{

      Thread11(String s){
        super(s);
        //start();
      }
      public void run(){
        for(int i=1; i<=5; i++){
            //System.out.println(getName());
            System.out.println(Thread.currentThread().getName());
            //System.out.println("hello");

            try{
                Thread.sleep(1000);
            }catch(Exception e){ }
        }
        System.out.println("Thread1 class run completed");
      }
}
class Thread22 extends Thread{

      Thread22(String s){
        super(s);
        //start();
      }
      public void run(){
        for(int i=1; i<=10; i++){
            //System.out.println(getName());
            System.out.println(Thread.currentThread().getName());
            //System.out.println("hello");

            try{
                Thread.sleep(1000);
            }catch(Exception e){ }
        }
        System.out.println("Thread2 class run completed");
      }
}
class Thread33 extends Thread{

      Thread33(String s){
        super(s);
        //start();
      }
      public void run(){
        for(int i=1; i<=15; i++){
            //System.out.println(getName());
            System.out.println(Thread.currentThread().getName());
            //System.out.println("hello");

            try{
                Thread.sleep(1000);
            }catch(Exception e){ }
        }
        System.out.println("Thread3 class run completed");
      }
}
class RunThread{

    public static void main(String[] args) {
        Thread11 t1 = new Thread11("thread1");
        Thread22 t2 = new Thread22("thread2");
        Thread33 t3 = new Thread33("thread3");

        t1.start();t1.start();t1.start();

        for(int i=0; i<=20; i++){
            System.out.println(Thread.currentThread().getName());
        }
        
    }

}