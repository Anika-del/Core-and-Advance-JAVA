import java.io.*;
import java.util.Scanner;

public class MyScanner {
    public static void main(String s2[]) throws IOException {
        Scanner s = new Scanner(System.in);
        String s1 = " ";
        while (!s1.equalsIgnoreCase("stop")) {
            s1 = s.nextLine();
            System.out.println(s1);
        }
    }
}