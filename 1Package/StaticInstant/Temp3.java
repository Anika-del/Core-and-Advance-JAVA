package p2;
import p1.Temp1; //when we import any package need to set path in ackage
import static p1.Temp1.*;
import static java.lang.System.*;
class Temp3 {
    static int x=200;
    public static void main(String[] args) {
        out.println(x);
        out.println("Temp3 value");
       new Temp1().show();
       //Temp2();
    } 
}
/*
D:\1CoreJava\Package\StaticInstant>set classpath=D:\1CoreJava\Package\StaticInstant;
>javac -d D:\1CoreJava\Package\StaticInstant Temp3.java
>java p2.Temp3

200
Temp3 value
PKI static p1 To simple create a package 
 
 */