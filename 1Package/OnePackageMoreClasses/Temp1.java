package OnePackageMoreClasses; //same package name Temp1, Temp2, Temp3 //class file in package file

public class Temp1 {

    void show(){
        System.out.println("PKG via Temp1");
    }
    public static void main(String[] args) {
       new Temp1().show();
    }
    
}
/*open and run on CMD command
>javac Temp1.java
>javac -d . Temp1.java
>java OnePackageMoreClasses.Temp1
PKG P

*/