import java.io.*;

class DataStream1 { 
    public static void main(String s1[]) throws IOException {
        /*
        

        */
        FileInputStream fin = new FileInputStream("codesquadz.txt");
        DataInputStream din = new DataInputStream(fin);
        int i = din.readInt();
        long l = din.readLong();
        boolean b = din.readBoolean();
        double d = din.readDouble();
        System.out.println(i);
        System.out.println(l);
        System.out.println(b);
        System.out.println(d); 
            } 
        }