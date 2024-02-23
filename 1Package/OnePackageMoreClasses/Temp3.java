package OnePackageMoreClasses; //same package name Temp1, Temp2, Temp3

public class Temp3 {

    void show(){
        System.out.println("PKG via Temp3");
    }
    public static void main(String[] args) {
        new Temp3().show();
    }  
}
/*open and run on CMD
>javac -d . Temp3.java
>java OnePackageMoreClasses.Temp3
PKG via Temp3 
*/
