class RunSync {
//run all file like costumthread.java and shared.java

// D:\1CoreJava\9MultiThreading\Synchronization(talMel)>javac *.java
// Note: Shared.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.

// D:\1CoreJava\9MultiThreading\Synchronization(talMel)>java RunSync
// starting in methodone 10
// exit from method one 10
// starting in methodthree 30
// exit from method three 30
// starting in methodtwo 20
// exit from method two 20
    public static void main(String s[]){
        Shared st= new Shared();
        CustomThread t1 = new CustomThread(st, "one");
        CustomThread1 t2 = new CustomThread1(st, "two");
        CustomThread2 t3 = new CustomThread2(st, "three");
    }
    
}
