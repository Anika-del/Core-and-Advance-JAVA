import java.lang.annotation.*;

class TestDeprecated{

    @Deprecated
    static void display(){
        System.out.println("display");
    }

    // @Deprecated
    // static void display1(){
    //     System.out.println("display1");
    // }
}

class TestAnnotation {

    public static void main(String[] args) {
        new TestAnnotation().doSomeTestNow();
    }
    @SuppressWarnings({"checked","deprecation"})
    public void doSomeTestNow(){
      TestDeprecated.display();
    }  
}
