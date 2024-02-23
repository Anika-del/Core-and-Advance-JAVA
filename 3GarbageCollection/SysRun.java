class SysRun {

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
