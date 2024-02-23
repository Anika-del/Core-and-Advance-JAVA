package appsqudz;
import java.lang.ref.WeakReference;
class Appsqudz{
}

public class Weak {

    public static void main(String[] args) {
        Appsqudz ap = new Appsqudz();
        System.out.println(ap);
        /*
PS D:\1CoreJava\4refrenceType> javac -d . Weak.java
PS D:\1CoreJava\4refrenceType> java appsqudz.Weak
appsqudz.Appsqudz@15db9742 */


        // WeakReference weakap = new WeakReference(ap);
        // ap = null;
        // System.out.println(ap);
        /*
PS D:\1CoreJava\4refrenceType> javac -d . Weak.java
Note: Weak.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details. */
        
        //  ap = weakap.get();
        // System.out.println(ap);
    }
    
}
