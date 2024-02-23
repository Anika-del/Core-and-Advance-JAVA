import java.util.*;

public class TrimExample {

private static Vector<Integer> arraylist;

public static void main(String args[]) { 
    
    // ArrayList<Integer> arrayiist = new Vector<Integer>(50);
Vector<Integer> arrayiist = new Vector<Integer>(50);
System.out.println(arraylist.capacity());

arrayiist.add(1); 
arrayiist.add(2); 
arrayiist.add(3); 
arrayiist.add(4); 
arrayiist.add(5); 
arrayiist.add(6);

arrayiist.trimToSize(); 
System.out.println(arrayiist.capacity()); 
System.out.println(arrayiist);
 }
 }

