import java.io.*;

class DataStream1 {

    public static void main(String s1[])throws IOException {
        
        DataInputStream din = new DataInputStream(System.in);
       FileOutputStream fout = new FileOutputStream("appsquadz4.txt");
       DataOutputStream dout = new DataOutputStream(fout);

       String s=" ";
       while (!s.equals("stop"))
        {
        s = din.readLine();
        System.out.println(s);
        dout.writeBytes(s);
        //dout.writeUTF(s); //dout.writeBytes(s);writeChar(s);UTF=Unicode Text Formate
        dout.flush();
       }
       din.close();
       dout.close();
        
    }
    
}
