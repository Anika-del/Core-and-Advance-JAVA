import java.util.*;

public class CharToString {

    public static void main(String[] args) {
        
        String(char c[], int position, int numberofelement);
        char c[] = {'A', 'P', 'P', 'S'};
        String s1 = new String(c);
        String s2 = new String(c,2,3);
        System.out.println(s2);

System.out.println();
        // print character
        char[] ch = {'d','e','e','p'};
        String s = new String(ch);
        System.out.println(s);
    }
    
}
