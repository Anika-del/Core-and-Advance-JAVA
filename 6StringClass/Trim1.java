public class Trim1 {

    public static void main(String[] args) {
        String Str = new String("Welcome to Tutorials of String"); 

        System.out.println(Str);
        System.out.println("before trim "+ Str.length());  //Output 30

        System.out.print("Return Value : ");
        String z = Str.trim();
        System.out.println(z);
        System.out.println("After trim " + z.length()); //Output 30
    }
    
}
