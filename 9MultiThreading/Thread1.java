class Thread1 extends Thread{

    Thread1(String s){

        super(s); //call parend constructor
    }
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(getName());
        }
    }  
}
class Thread2 extends Thread{

    Thread2(String s){

        super(s); //call parend constructor
    }
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(getName());
        }
    }  
}
class Thread3 extends Thread{

    Thread3(String s){

        super(s); //call parend constructor
    }
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(getName());
        }
    }  
}
class RunThread{

    public static void main(String[] args) {
        Thread1 t1 = new Thread1("thread1");
        Thread2 t2 = new Thread2("thread2");
        Thread3 t3 = new Thread3("thread3");

        t1.start();t1.start();t1.start();

        for(int i=0; i<=20; i++){
            System.out.println(Thread.currentThread().getName());
        }
        
    }

        
}
