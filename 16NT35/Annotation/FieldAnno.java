import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno11 {
    int val() default 100;
}

class A {
    @MyAnno11(val = 999)
    int x;
}

public class FieldAnno {
    public static void myMeth() {
        A ob = new A();
        try {
            Class c = ob.getClass();
            Field f = c.getField("x");
            MyAnno11 anno = f.getAnnotation(MyAnno11.class);
            System.out.println(anno.val());
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}