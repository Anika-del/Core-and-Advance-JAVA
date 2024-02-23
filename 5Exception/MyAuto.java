//Autometic Resources

class MyAuto {

    public static void main(String[] args)
     {
        try(Demo d = new Demo();
        Demo1 d1 = new Demo1())
        {
            System.out.println(0);
            int x = 10/0;
            d.show();
            d1.show1();
        }

    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
    } 
}
class Demo implements AutoCloseable{
void show(){
    System.out.println("Show");
}
public void close(){
    System.out.println(" Close from Demo ");
}
}

class Demo1 implements AutoCloseable{
void show1(){
    System.out.println("show1");
    }
public void close(){
    System.out.println(" Close fron Demo1");
}
}

// PS D:\1CoreJava\5Exception> cd "d:\1CoreJava\5Exception\" ; if ($?) { javac MyAuto.java } ; if ($?) { java MyAuto }        
// 0
//  Close fron Demo1
//  Close from Demo