import java.io.*;
public class MyClient1
{
 ObjectOutputStream dout;
 public MyClient1()
 {
  try
  {
  
   emp e1=new emp("Codesquadz noida",10,5,20,100);
   dout=new ObjectOutputStream(new FileOutputStream("appsquadz3"));
   dout.writeObject(e1);
   dout.flush();
  }
  
  catch(Exception e)
  {
    System.out.println(e);
  }
  }
 public static void main(String ar[])
 {
   new MyClient1();
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