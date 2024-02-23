import java.io.*;
class MyFileWriter
{
  public static void main(String s1[])throws IOException
  {
    FileWriter fw=new FileWriter("appsquadz11.txt");
//   FileWriter fw=new FileWriter("appsquadz11.txt",true);
//   FileWriter fw=new FileWriter(new File("e:\\f2\\appsquadz11.txt"),true); 
   String s="India is good Country sss";
   char ch[ ]=s.toCharArray();
   for(int i=0;i<ch.length;i++)
   fw.write(ch[i]); // fw.write(ch) or fe.write(s)
   fw.close();
   }
   }
   class MyFileReader
   {
     publuc static void main(String s1[ ])throws IOException
	 {
	  FileReader fr= new FileReader("appsquadz11.txt");
	  int i=0;
	  while(i=fr.read()!=1)
	  System.out.print((char)i);
	 }
	}
	