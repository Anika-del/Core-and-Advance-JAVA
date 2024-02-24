import java.util.Vector;

public class ClearMyVector {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<String>();

        // adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");

        System.out.println("Actual vector: " + vct);
        System.out.println("After clear vector: " + vct);

        vct.clear();
    }
}