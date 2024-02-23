import java.util.*;

public class EnsureCapacityExample {
    public static void main(String args[]) {
        // ArrayList with Capacity 4
        //ArrayList<String> al = new ArrayList<String>(4);
        Vector<String> al = new Vector<String>(4);
        System.out.println(al.capacity());

        //Added 4 elements
        al.add("Hi");
        al.add("Hello");
        al.add("Bye");
        al.add("GM");

        //Increase capacity to 76
        al.add("GE");
        al.add("GE");
        al.add("GE");

        System.out.println(al);
        System.out.println(al.capacity());

        for (String temp : al) {
            System.out.println(temp);
        }

       
    }
}