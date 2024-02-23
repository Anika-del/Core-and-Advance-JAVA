public class Substring {

    public static void main(String[] args) {
        String Str = new String("Welcome to Tutorials of String"); 

        System.out.print("Return Value : ");
        System.out.println(Str.substring(10)); //Tutorials of String
        //subString ignore space and index number starts with 1
        System.out.println(Str.substring(12)); //utorials of String
        System.out.println(Str.substring(9)); //o Tutorials of String

        System.out.print("Return Value : ");
        System.out.println(Str.substring(0,7));
    }
    
}
