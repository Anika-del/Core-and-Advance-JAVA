import javax.swing.*;
import java.awt.*;
public class Calculator {

    Frame f;  //Instant refrence variable bnaya abhi object nhi bna h only Refrence variable bnaya h 
    //Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    //for label component
    Label l = new Label();
    //for textfield component
    TextField tf = new TextField();
    //for button component
    Button b0 = new Button(" 0 ");
    Button b1 = new Button(" 1 ");
    Button b2 = new Button(" 2 ");
    Button b3 = new Button(" 3 ");
    Button b4 = new Button(" 4 ");
    Button b5 = new Button(" 5 ");
    Button b6 = new Button(" 6 ");
    Button b7 = new Button(" 7 ");
    Button b8 = new Button(" 8 ");
    Button b9 = new Button(" 9 ");
    Button bdot = new Button(" . ");
    Button bc = new Button(" C ");
    Button bdel = new Button(" DEL ");
    Button bequal = new Button(" = ");
    Button bmul = new Button(" x ");
    Button bdiv = new Button(" / ");
    Button bplus = new Button(" + ");
    Button bsub = new Button(" - ");
    Button buttonSquare = new Button("x\u00B2");
    Button buttonReciprocal = new Button("1/x");
    Button buttonSqrt = new Button("\u221A");
       

    
    // Calculater(String S){

    //     f=new Frame(S);

    Calculator() {
        prepareGUI();
        addComponents();
    }
 
    public void prepareGUI() {

        f=new Frame();
        f.setTitle("Calculator");
        f.setSize(300, 500);
        //f.getContentPane().setLayout(null);
        //f.getContentPane().setBackground(Color.black);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addComponents(){

    

        l = new Label("  Standerds ");  //for label component
        l.setBounds(40,40,80,20);
        f.add(l);

        tf = new TextField();  //for text write component
        tf.setBounds(150,40,50,20);
        f.add(tf);

        //button property
//7,8,9
        b7.setBounds(10, 230, 60, 40);
        f.add(b7);
        b8.setBounds(10, 230, 60, 40);
        f.add(b8);
        b9.setBounds(10, 230, 60, 40);
        f.add(b9);

        //4,5,6
        b4.setBounds(10, 290, 60, 40);
        f.add(b4);
        b5.setBounds(10, 290, 60, 40);
        f.add(b5);
        b6.setBounds(10, 290, 60, 40);
        f.add(b6);

//1,2,3
        b1.setBounds(10, 350, 60, 40);
        f.add(b1);
        b2.setBounds(10, 350, 60, 40);
        f.add(b2);
        b3.setBounds(10, 350, 60, 40);
        f.add(b3);
        
        //.,0.=
        bdot.setBounds(10, 410, 60, 40);
        f.add(bdot);
        b0.setBounds(10, 410, 60, 40);
        f.add(b0);
        bequal.setBounds(10, 350, 60, 40);
        f.add(bequal);

        //div, squrt, mul
        bdiv.setBounds(220, 110, 60, 40);
        f.add(bdiv);
        buttonSqrt.setBounds(10, 170, 60, 40);
        f.add(buttonSqrt);
        bmul.setBounds(220, 230, 60, 40);
        f.add(bmul);

        //-,+,squre
        bsub.setBounds(220, 170, 60, 40);
        f.add(bsub);
        bplus.setBounds(220, 290, 60, 40);
        f.add(bplus);
        buttonSquare.setBounds(80, 170, 60, 40);
        f.add(buttonSquare);


        //reciprocal ,del, clear
        buttonReciprocal.setBounds(150, 170, 60, 40);
        f.add(buttonReciprocal);
        bdel.setBounds(150, 110, 60, 40);
        f.add(bdel);
        bc.setBounds(80, 110, 60, 40);
        f.add(bc);

        //f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5); f.add(b6);f.add(b7);f.add(b8);f.add(b9);

        // Toolkit t = f.getToolkit();
        // Dimension screenSize = t.getScreenSize();
        // int width = screenSize.width*8/10;
        // int height = screenSize.height*8/10;
        // f.setBounds(width/8, height/8, width, height);
        // f.setBounds(400,200,600,400);

        // f.setLayout(null);
        // //f.setSize(400, 400);
        // f.setVisible(true);
    }

    public static void main(String[] args) {
        
        new Calculator();
        
    }  
}

    

