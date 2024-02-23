//bees sal bad

import java.io.*;
public class MyServer1
{
   ObjectInputStream dis;
   
   public MyServer1()
   {
     try
	   {
	    
		dis=new ObjectInputStream(new FileInputStream("appsquadz4.txt"));
		emp z=(emp)dis.readObject();
	   emp z1=(emp)dis.readObject();
	   System.out.println("name="+z.name);
	   System.out.println("age="+z.age);
	   System.out.println("name="+z1.name);
	  System.out.println("age="+z1.age);
	 }
	 catch(Exception e)
	 {
	   System.out.println(e);
	 }
   }
	  
 public static void main(String ar[])
	  {
	    new MyServer1();
	  }
  }
  
  
  /*
  
F:\Core_java\Input_Output>javac MyClient2.java

F:\Core_java\Input_Output>java MyClient2

F:\Core_java\Input_Output>javac MyServer1.java

F:\Core_java\Input_Output>java MyServer1
name=appsquadz noida
age=10
name=lalu
age=13
  */