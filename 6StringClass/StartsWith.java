public class StartsWith {

    public static void main(String[] args) {
        
        String Str = new String("Welcome to Tutorials of String"); 

        System.out.print("Return Value : ");
        System.out.println(Str.startsWith("Welcome"));  //String Start words //Output True

        System.out.print("Return Value : ");
        System.out.println(Str.startsWith("Tutorials")); //Turorials is not start String //Output False

        System.out.print("Return Value : ");
        System.out.println(Str.startsWith("Tutorials",11)); //index start 0 and at Tutorials T is 11 index
        //so at 11 what starting String is Tutorials
        //Like as
        System.out.print("Return Value : ");
        System.out.println(Str.startsWith("to",8)); //true
        System.out.print("Return Value : ");
        System.out.println(Str.startsWith("to",10)); //false
    }
    
}
