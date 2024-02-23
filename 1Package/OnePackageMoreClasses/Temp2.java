package OnePackageMoreClasses; ////same package name Temp1, Temp2, Temp3

public class Temp2 {

    void show(){
        System.out.println("PkG Temp2");
    }
    public static void main(String[] args) {
        new Temp2().show();
    }
    
}
/*open and run on CMD
>javac -d . Temp2.java  //compile
>java OnePackageMoreClasses.Temp2  //run
PkG Temp2
*/