import java.util.Scanner;
class FinalArray {

public static void main(String[] args) {
 int z[] = {10,20,30};  //if we make final    FinalArray.java:10: error: cannot assign a value to final variable z

       System.out.print(z[0] +" "); //10
       System.out.print(z[1] +" "); //20
       System.out.println(z[2] +" "); //30

final int y[] = {100, 102, 200};
    z = y;      //if we make final then it is change value
       System.out.println(z[0]);  //100
       
     z[0] = 20000;
         System.out.println(z[0]); //2000
     }  
}
