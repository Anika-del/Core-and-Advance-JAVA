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
        System.out.println("Thread33 class run completed");
      }
    
}
