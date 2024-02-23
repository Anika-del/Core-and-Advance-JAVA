public class CharCount {

    public static void main(String[] args) {
        
        String str1 = "String are immutable";
        System.out.println("String  " + str1);

        int chCount=1;
        for(int i=0; i<str1.length(); i++) {  
            chCount++;
       }
       System.out.println("char with spaces : "+ chCount);

       int newString = str1.length();
       int newStrng = str1.replace(" ", "").length();
       System.out.println("char without spaces : " +newString);
       
    }
    
}
