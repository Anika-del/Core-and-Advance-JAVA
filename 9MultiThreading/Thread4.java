class Thread4 extends Thread{

    Thread4(String s){
        super(s);
    }
    public void run(){
        for(int i=1; i<=5; i++){
           // System.out.println(Thread.currentThread().getName());
            System.out.println("har har Modi ghar ghar Modi");
            System.out.println(getName());

            try{
                Thread.sleep(1000); //1000 mitisecond 1 sec
            }catch(Exception e){ }
        }
        System.out.println(getName()+ "dean");
    }  
}
