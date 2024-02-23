//sir ka code
package p1;
import p1.Temp1;
public class Tempp1 {

    public static int x=200; //Data Member
    public static void show(){ //Member Function
    System.out.println("Pkg p1 for static");
    }

    public static void show1(){
        System.out.println("Pkg via show1");
    } 
    public static void main(String[] args) {
        System.out.println(x);
        new Tempp1().show();
        new Tempp1().show1();
        new Temp1().show();
    }
}
/*
D:\1CoreJava\Package\StaticInstant>set classpath=D:\1CoreJava\Package\StaticInstant;
>javac -d D:\1CoreJava\Package\StaticInstant Tempp1.java
>java p1.Tempp1
//output
200               //static
Pkg p1 for static
Pkg via show1             //instant
PKI static p1 To simple create a package              //Temp1
 */
