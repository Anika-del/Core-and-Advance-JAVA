public class WordCount {

    public static void main(String[] args) {
        
        String St = "You are on Tutorials Point website aa";
        System.out.println(St);

    //     int total = 1, i=0;
    //   while (i < St.length()) { 
    //      if ((St.charAt(i) == ' ') && (St.charAt(i + 1) != ' '))  {
    //         total++;  
    //      }
    //      i++; 
    //  
// } 
int total = 1;
for (int i = 0; i < St.length(); i++) {
   //check space or not
    if ((St.charAt(i) == ' ') && (St.charAt(i + 1) != ' ')) {
       total++; 
    }
 }
      System.out.println("Number of words in string: " +  total);
   } 
}

