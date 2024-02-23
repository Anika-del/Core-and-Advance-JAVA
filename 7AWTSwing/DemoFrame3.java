import java.awt.*;
public class DemoFrame3 {

    Frame f;  //Instant refrence variable bnaya abhi object nhi bna h only Refrence variable bnaya h 
    Button b;
    Label l;
    TextField tf;
    
    DemoFrame3(String S){

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

        Toolkit t = f.getToolkit();
        Dimension screenSize = t.getScreenSize();
        int width = screenSize.width*8/10;
        int height = screenSize.height*8/10;
        f.setBounds(width/8, height/8, width, height);
        f.setBounds(400,200,600,400);

        f.setLayout(null);
        //f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        
        new DemoFrame3("first frame");
        
    }  
}
