import java.io.*;
class Pw
{
  public static void main (String s[ ])throws IOException
  {
    PrintWriter pw=new PrintWriter(new FileWriter("abc1.txt"));
	pw.println("hyy");
	pw.println("hloo");
	pw.close();
	System.out.println("File Created");
	}
}
//PrintWriter(Writer t);

//output
//F:\Core_java\Input_Output\Charactor_Input_Output>javac Pw.java

//F:\Core_java\Input_Output\Charactor_Input_Output>java Pw
//File Created