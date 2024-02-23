import java.util.*;

class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        //ArrayList al = new ArrayList();
        System.out.println(al.size());
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        //al.add(10);

        System.out.println(al.size());
        al.remove(2);
       // al.rep(1,"F");
        System.out.println(al.size());
        System.out.println(al);
    }
}
