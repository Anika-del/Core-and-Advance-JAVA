import java.io.*;

class Ps {

    public static void main(String[] args)throws IOException {
        
        FileOutputStream fout = new FileOutputStream("chachi.txt");
        PrintStream ps= new PrintStream(fout);
        // ps.println("hello");
        // ps.println("hay");
        // System.out.println("file created");
        FileOutputStream fout1 = new FileOutputStream("chacha.txt",true);
        PrintStream ps1 = new PrintStream(fout1);
        System.out.println("before");
        PrintStream ps4 = System.out;
        System.setOut(ps);
        System.setErr(ps1);
        System.out.println("chachi 420");
        System.out.println("chachi 840");
        System.out.println("chacha 420");
        System.out.println("chacha 840");
        //System.out=ps4;
        System.setOut(ps1);
        System.out.println("chacha 420");
        System.setOut(ps4);
        ps4.println("after");
        System.out.println("via actual out");
    }
    
}
