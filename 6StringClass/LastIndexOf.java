/*
int lastIndexOf(int ch)
public int lastIndexOf(int ch, int fromIndex)
int lastIndexOf(String str)
int lastIndexOf(String str, int fromIndex)
 */ 

public class LastIndexOf {

    public static void main(String[] args) {
        String Str = new String("Welcome to Tutorials"); //14
        String SubStr1 = new String("Tutorials");  //index start from 1
        String SubStr2 = new String("Sutorials");

        System.out.print("Found Last Index number of o : ");
        System.out.println(Str.lastIndexOf('o'));

        System.out.print("Found Last Index start from : ");  //start index from 5
        System.out.println(Str.lastIndexOf('o', 5));

        System.out.print("Found Last Index : "); //index start from 0 in str
        System.out.println(Str.lastIndexOf(SubStr1)); // T in 11 place
        System.out.print("Found Last Index : ");
        System.out.println(Str.lastIndexOf(SubStr1, 15));

        System.out.print("Found Last Index :");
        System.out.println(Str.lastIndexOf(SubStr2));
    }
    
}
