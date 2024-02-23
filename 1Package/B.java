/*

public class A {
   // error: class A is public, should be declared in a file named A.java
    //public class name same as java file name B.java not support.
    //keep file neme sa class name same.
}
class B{
    public static void main(String[] args) {
        new A();
    }
}

*/

class A {
   //compile successfully
}
public class B{
    public static void main(String[] args) {
        new A();
    }
}