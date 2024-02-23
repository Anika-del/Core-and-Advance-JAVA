import java.io.*;
class MyCharWriter
{
  public static void main (String s1[ ])throws IOException
  {
    CharArrayWriter fw=new CharArrayWriter();
	String s="India is Good Country sss";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	fw.write(ch[i]);//fw.write(ch)
	//fw.writeTo(Write t)
	fw.writeTo(new FileWriter("temp.txt"));
	System.out.println(fw.toString());
	char z[ ]=fw.toCharArray();
	CharArrayReader fr=new CharArrayReader(z);
	int i=0;
	while((i=fr.read())!=-1)
	System.out.print((char)i);
	}
}

/*
India is Good Country sss
India is Good Country sss
*/