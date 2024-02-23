import java.io.*;

class MyFileWriter {

    public static void main(String s1[])throws IOException{
       // FileOutputStream fw = new FileOutputStream("lalu.txt");//Write Mode
        //FileOutputStream fw = new FileOutputStream("lalu.txt",true);//Append Mode
      // FileOutputStream fw = new FileOutputStream(new File("D:\\d2\\lalu2.txt"));//Write Mode
        FileOutputStream fw = new FileOutputStream(new File("D:\\lalu2.txt"));//Write Mode
    
       String s = "india is a good country and with corrupted leader ramdev and family";
    
       
       byte ch[] = s.getBytes();
       //w.write(ch);
       for(int i=0; i<ch.length; i++)
       fw.write(ch[i]);
       fw.close();

       System.out.println("file createed Sucessfully");
    }   
}

class MyFileReader{
    public static void main(String s1[])throws IOException {
        
        //FileInputStream fr = new FileInputStream("lalu.txt");
        FileInputStream fr = new FileInputStream(new File("D:\\lalu2.txt"));
       int i=0;

       while((i = fr.read()) != -1){
       System.out.println((char)i);
       fr.close();
    }
}
}