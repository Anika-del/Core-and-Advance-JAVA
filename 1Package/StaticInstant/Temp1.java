package p1; //class file in p1/Temp1.class
public class Temp1 {

    public void show(){
        System.out.println("PKI static p1 To simple create a package");
    }
        public static void main(String[] args) {
            new Temp1().show();    
    }
}
/*

D:\1CoreJava\Package>javac -d . Temp1.java
>java P1.Temp1
PKI P1 To simple create a package

 */