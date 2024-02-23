import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Bstream {

    public static void main(String[] args) {
        String srcFile = "lalu.txt";

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile))){
            //Read one byte at a time and display it
            byte byteData;

            while((byteData = (byte) bis.read()) != -1){
                System.out.print((char) byteData);
                /*  PS D:\1CoreJava\13IOfiles> cd "d:\1CoreJava\13IOfiles\" ; if ($?) { javac Bstream.java } ; if ($?) { java Bstream }
india is a good country and with corrupted leader ramdev and familyindia is a good country and with corrupted leader ramdev and
 familyindia is a good country and with corrupted leader ramdev and family
*/
            }
        }
        catch(Exception e2){
            e2.printStackTrace();
        }
    }
    
}
