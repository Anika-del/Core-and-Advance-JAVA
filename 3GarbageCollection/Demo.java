class Demo {
    int x=10; 
    int y=20;
    public void finilized(){
       // show.Throwable{
            System.out.println("Javaan Shaheed");
        }
    
    


    static void show(){
        Demo d2 = new Demo();
        display();
    }
    static void display(){
        Demo d3 = new Demo();
    }
    public static void main(String[] args) {
        show();
        System.gc();
        //Runtime.gc();
    }
    
}
