import java.util.List;
import java.util.Vector;
import java.util.ListIterator;

public class MyListIterator {
    public static void main(String[] args) {
        List<Integer> li = new Vector<Integer>();
        li.add(71);
        li.add(5);
        li.add(23);
        li.add(98);
        li.add(29);

        ListIterator<Integer> litr = li.listIterator();

        System.out.println("Elements in forward direction");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("Elements in backward direction");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}