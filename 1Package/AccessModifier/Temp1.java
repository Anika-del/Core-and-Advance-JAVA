package AccessModifier;

public class Temp1 {

    static int x;
    Temp1(int x){
        this.x=x;
    }
    public void show(){
        System.out.println(x);
    }
    public void show1(){
        System.out.println("Temp1 of public AccessModifier");
    }
    public static void main(String[] args) {
        new Temp1(x).show1();
        Temp1 c1 = new Temp1(100);
        c1.show();
    }  
}
/*
D:\1CoreJava\Package\AccessModifier>javac -d . Temp1.java
>java AccessModifier.Temp1
Temp1 of public AccessModifier
 */
