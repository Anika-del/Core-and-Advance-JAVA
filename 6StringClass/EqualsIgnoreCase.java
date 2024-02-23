public class EqualsIgnoreCase {

    public static void main(String[] args) {
        String Str1 = new String("This is really not immutable! ");
        String Str2 = Str1;
        String Str3 = new String("This is roally not immutalbe! ");
        String Str4 = new String("ThIs is rEally nOt iMMutaBle! ");
        boolean retVal;

        retVal = Str1.equals(Str2);
        System.out.println("Returning Value = "+ retVal);  //True

        retVal = Str1.equals(Str3);
        System.out.println("Returning Value = "+ retVal); //False

        retVal = Str1.equals(Str4);
        System.out.println("Returning Value = "+ retVal);  //False
        retVal = Str1.equalsIgnoreCase(Str4);
        System.out.println("Returning Value = "+ retVal);  //True casecensative ignore
    }
    
}
