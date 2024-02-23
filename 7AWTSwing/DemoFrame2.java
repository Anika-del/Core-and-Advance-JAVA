import java.awt.*;
public class DemoFrame2{

    Frame f;  //Instant refrence variable bnaya abhi object nhi bna h only Refrence variable bnaya h 
    

    DemoFrame2(String s){

        f = new Frame(s);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        
        new DemoFrame2("First Frame Association");
        Frame f = new Frame("jjjaaaaaaa");
        f.setSize(200,200);
        f.setVisible(true);
    }
    
}
