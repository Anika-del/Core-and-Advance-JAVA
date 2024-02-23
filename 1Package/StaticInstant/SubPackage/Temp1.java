//How to make sub package
package p1.sub.sub1; //class file in sub package p1\sub\sub1\Temp1.class
public class Temp1 {

    public void show(){
        System.out.println("create Sub Package in p1/sub/sub1/Temp1.class");
    }
        public static void main(String[] args) {
            new Temp1().show();    //call member function of Temp1
    }
}
/*
D:\1CoreJava\Package\StaticInstant\SubPackage>javac -d . Temp1.java
>java p1.sub.sub1.Temp1

//output
create Sub Package in p1/sub/sub1/Temp1.class

*/