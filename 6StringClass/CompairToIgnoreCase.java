
public class CompairToIgnoreCase {

    public static void main(String[] args) {
        String str1 = "String are immutable";
        String str2 = "string are immutable";
        String str3 = "Integers are not immutable";

        int result1 = str1.compareTo(str2);
        System.out.println("compairTo" +result1);
        int result = str1.compareToIgnoreCase(str2);
        System.out.println("compairToIgnoreCase="+ result);

        result = str2.compareToIgnoreCase(str3);
        System.out.println(result);

        result = str3.compareToIgnoreCase(str1);
        System.out.println(result);
    }
    
}
