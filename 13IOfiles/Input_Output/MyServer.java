// bees sal bad
import java.io.*;
public class MyServer
{
  ObjectInputStream dis;
  public MyServer()
 {
 try
 {
   dis=new ObjectInputStream(new FileInputStream("appsquadz3"));
   emp z=(emp)dis.readObject();
   System.out.println("name=" +z.name);
   System.out.println("age=" +z.age);
   System.out.println("a=" +z.a);
   System.out.println("b=" +z.b);
   System.out.println("z=" +z.z);
 }
 
 catch(Exception e)
 {
  System.out.println(e);
  }
 }
 public static void main(String ar[ ])
  {
    new MyServer();
   }
 }
 
 /*
 F:\Core_java\Input_Output>javac emp.java

F:\Core_java\Input_Output>javac Base.java

F:\Core_java\Input_Output>javac MyServer.java

F:\Core_java\Input_Output>java MyServer
name=Codesquadz noida
age=10
a=0
b=0
z=0
 */