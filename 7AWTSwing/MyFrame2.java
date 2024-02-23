import java.awt.*;
public class MyFrame2 {

    Frame f;  //Instant refrence variable bnaya abhi object nhi bna h only Refrence variable bnaya h 
    TextField tf;
    Button b1;
    MyFrame2(String S){

        f=new Frame(S);
        tf = new TextField();
        tf.setBounds(40,40,60,30);
        f.add(tf);

        b1 = new Button(" % ");
        b1.setBounds(40,40,60,30);
        f.add(b1);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        
        new MyFrame2(" ");
        
    }  
}
