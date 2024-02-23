//How to import sub package
package p1.sub.sub1;
//import p1.Temp1;     //Error: Could not find or load main class p1.Tempp2
import p1.sub.sub1.Temp1;

public class Tempp1 {

    public void show(){
        System.out.println("import sub package of p1.sub.sub1.Temp1 in Tempp1");
    }
    public static void main(String[] args) {
        new Tempp1().show();
        new Temp1().show();   //Data of import class 
    }    
}
/*
D:\1CoreJava\Package\StaticInstant\SubPackage>set classpath=D:\1CoreJava\Package\StaticInstant\SubPackage;

>javac -d D:\1CoreJava\Package\StaticInstant\SubPackage Tempp1.java

>java p1.sub.sub1.Tempp1
//output

import sub package of p1.sub.sub1.Temp1 in Tempp1
create Sub Package in p1/sub/sub1/Temp1.class
 */
