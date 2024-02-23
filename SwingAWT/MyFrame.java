import java.awt.*;

class MyFrame extends Frame{

    Frame f;
    TextField tf;
    Button b1;

    MyFrame(String s){
    f = new Frame(s);

    tf = new TextField();
    tf.setBounds(40,40,60,30); 
    f.add(tf);

    /*for button(component)
    1).suppose we need ek sidh me the x same and y + height add
    2).if we need row then x + width of
     */
    b1 = new Button("%");
    b1.setBounds(40, 100,60,50);
    f.add(b1);
    b1 = new Button("%");
    b1.setBounds(110, 100,60,50);
    f.add(b1);
    b1 = new Button("%");
    b1.setBounds(190, 100,60,50);
    f.add(b1);
    b1 = new Button("%");
    b1.setBounds(260, 100,60,50);
    f.add(b1);
//for close window write on CMD Ctrl+c

    b1 = new Button("0");
    b1.setBounds(40, 160,60,50);
    f.add(b1);
    b1 = new Button("0");
    b1.setBounds(110, 160,60,50);
    f.add(b1);
    b1 = new Button("0");
    b1.setBounds(180, 160,60,50);
    f.add(b1);
    b1 = new Button("0");
    b1.setBounds(250, 160,60,50);
    f.add(b1);
    f.setLayout(null);

    f.setSize(400,400);
    f.setVisible(true);
}

public static void main(String[] args) {
    new MyFrame("FF");
    //YOUR WISH TO MAKE MORE OBJEXT

    //set quardinate
   
}
}