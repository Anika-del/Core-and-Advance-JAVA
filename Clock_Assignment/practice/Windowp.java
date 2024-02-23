import javax.swing.*;

public class Windowp extends JFrame {
    /*window is the normal class so we are use inheritence forextends other class property 
     now JFrame class extends, then all property of JFrame come into Windo class

*/

    Windowp(){ /*constructor of my window and call some method of jframe
        like set of parent class method*/

        //setTitle("My Clock"); you call like this 
        //or
        super.setTitle("My Clock");
        super.setSize(400,400); //for height wedth
        super.setLocation(300,50);//for x and y quardinate
        super.setVisible(true); //for visiability
        /*but it works when constructor call then we create MyWindow 
         but make in Digitalclok.java file 
         if we want or run constructor the must be make Object.
        */
    }
    
    public static void main(String[] args) {
        
        System.out.println("Testing.....");
        Windowp w = new Windowp(); //now we want to store
    }
    


    
}
