import java.util.Scanner;
public class ClassLevelArray {

   // int z[] = new int[10];

    int z[];
    public static void main(String[] args) {
        System.out.println("Enter the size of array ");
        int x1 = new Scanner(System.in).nextInt();
        ClassLevelArray o1 = new ClassLevelArray();
        o1.z = new int[x1];
        System.out.println(o1.z.getClass().getName());
        for(int i=0; i<o1.z.length; i++){
            System.out.print(o1.z[i]);
            System.out.print("  ");
        }
        System.out.println("  ");
        for(int x:o1.z){
            System.out.print(x);
            System.out.print("  ");
        }
    }
    


    
}
