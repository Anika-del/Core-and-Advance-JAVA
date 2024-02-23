/*
public String[] split(String regex, int limit)
public String[] split(Strring args[])
*/

public class Split {
    public static void main(String[] args) {

        String Str = new String("Welcome-to-Tutorials-of-String");
     // String Str = new String("Welcome to Tutorials of String");

    System.out.print("Return value : ");
    //String  s[] = Str.split("-", 1); if put 1 output willbe in one line
    String  s[] = Str.split("-", 2); //if put 2 output willbe in two line
    for(int i=0; i<s.length; i++){
    System.out.println(s[i]);
    }
    System.out.println(" ");

    //String  s[] = Str.split("-", 3); if put 2 output willbe in three line
    //Like as
    s = Str.split("-", 3);
    System.out.print("Return Value : ");
    for(int i=0; i<s.length; i++){
    System.out.println(s[i]);
    }

System.out.println(" ")
;
    //only - hifan
    s = Str.split("-");
    System.out.print("Return Value : ");
    for(int i=0; i<s.length; i++){
    System.out.println(s[i]);
    }
    } 
}
