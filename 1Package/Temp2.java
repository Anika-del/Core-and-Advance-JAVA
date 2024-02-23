//call our Temp1 package in our Temp2
// package P1;
// public class Temp1{

// }
// package P1;
// import P1.Temp1;
// public class Temp2 {

//     void show(){
//         System.out.println("import P1 package in Temp2");
//     }
//     public static void main(String[] args) {
//         new Temp1().show();//call temp 1 data
//         new Temp2().show();
//     }
// }
/*
>javac -d . Temp2.java
>java P1.Temp2
PKI P1 To simple create a package //Temp1 output
import P1 package in Temp2  //Temp2 output
*/