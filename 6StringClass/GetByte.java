public class GetByte {

    public static void main(String[] args) {
        
        String Str1 = new String("Welcome to Tutorial of String");

        try{
            byte[] Str2 = Str1.getBytes();
            for(int i=0; i<Str2.length; i++){
                System.out.print(" "+Str2[i]);
            }
        }catch(Exception e){
            System.out.println("Unspported characte set");

        }
    }
    
}
