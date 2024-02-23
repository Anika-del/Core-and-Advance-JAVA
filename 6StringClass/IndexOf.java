/*
public int indexOf(int ch)
public int indexOf(int ch, int fromIndex)
int indexOf(String str)
int indexOf(String str, int fromIndex)
 */ 

public class IndexOf {

    public static void main(String[] args) {
        String Str = new String("Welcome to Tutorials");
        String SubStr1 = new String("Tutorials");  //index start from 1
        String SubStr2 = new String("Sutorials");

        System.out.print("Found Index number of o : ");
        System.out.println(Str.indexOf('o'));

        System.out.print("Found Index start from 5 : ");  //start index from 5
        System.out.println(Str.indexOf('o', 5));

        System.out.print("Found Index : "); //index start from 0 in str
        System.out.println(Str.indexOf(SubStr1)); // T in 11 place
        System.out.print("Found Index : ");
        System.out.println(Str.indexOf(SubStr1, 15));

        System.out.print("Found Index :");
        System.out.println(Str.indexOf(SubStr2));
    }
    
}
