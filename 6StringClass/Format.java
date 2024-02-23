/*  Create Format String :
You have printf() and Formate() method to print output with Formated numbers. The String class has an
equvailent class method, format(), that returns a String object rather than a PrintStream object.

Using String's static format() allowed to you create a formatted String that you can reuse, as opposedto a one-time 
print statement.
*/

class Format{
    public static void main(String[] args) {
        
        float floatVar = 2.4f;
        int intVar = 10;
        String StringVar = "HINDUSTAN";
        System.out.printf("The value of float variable is = %f, The value of the integer variable is = %d, and The value of the string is = %s",floatVar,intVar,StringVar);
       
        // printf and format is gives same output
        
        String fs = String.format("The value of float variable is = %f, The value of the integer variable is = %d, and The value of the string is = %s",floatVar,intVar,StringVar);
        System.out.println("  ");
        System.out.println(fs);
    }
}