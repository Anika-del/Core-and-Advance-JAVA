// public boolean endsWith(String suffix)
//same value = true, Different value = false
public class EndsWith {

    public static void main(String[] args) {
        String Str = new String("This is really not immutable! ");
        System.out.println(Str);
        boolean retVal;

        retVal = Str.endsWith("Immutable! ");
        System.out.println("Returned Value = " + retVal); //Returned Value = false

        retVal = Str.endsWith("table");
        System.out.println("Returned Value = " + retVal); //false

        retVal = Str.endsWith("This is really not immutable! ");
        System.out.println("Returned Value = " + retVal); //true
    }
    
}
