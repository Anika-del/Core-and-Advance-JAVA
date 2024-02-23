import java.awt.*;
public class DemoFrame {

    Frame f;  //Instant refrence variable bnaya abhi object nhi bna h only Refrence variable bnaya h 
    Button b;
    Label l;
    TextField tf;
    
    DemoFrame(String S){

        f=new Frame(S);

        l = new Label("Enter the no. ");  //for label component
        l.setBounds(40,40,80,20);
        f.add(l);

        tf = new TextField();  //for text write component
        tf.setBounds(150,40,50,20);
        f.add(tf);

        b = new Button(" % ");   //for button component
        b.setBounds(40,100,50,50);
        f.add(b);

        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        
        new DemoFrame("first frame");
        
    }  
}
