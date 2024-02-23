public class GetChars {

    public static void main(String[] args) {
                     
                String Str1 = new String("Welcome to Tutorial of String");
                //            index value(         0123456789 ...................)
                char[] Str2 = new char[7]; // 2to9 element print
                char c[] = Str1.toCharArray();
mn  m
                try{
                    Str1.getChars(2, 9, Str2, 0); //index statrt 0 
                    //value print index 2 se 9 tk
                    System.out.println("Copied Value = ");
                    for(int i=0; i<Str2.length; i++)
                        System.out.print(" "+Str2[i]);

                System.out.println(" ");

                for(int i=0; i<c.length; i++)
                   System.out.print(c[i]);
                    }
                catch(Exception e){
                    System.out.println("raised exception...");
        
                }         
  }
    
}
