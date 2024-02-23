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
       

    
    // Calculater(String S){

    //     f=new Frame(S);

    Calculator() {
        GUI();
        addComponents();
    }
 
    public void GUI() {
        f=new Frame(); 
    }

    //component
    public void addComponents(){

        l = new Label("  Standerds \n");  //for label component
        l.setBounds(40,40,80,20);
        f.add(l);

        tf = new TextField();  //for text write component
        tf.setBounds(150,40,60,40);
        f.add(tf);

        //button property
        Button bmod = new Button(" % ");
        bmod.setBounds(10, 150, 60, 40);
        f.add(bmod);
        Button bce = new Button(" CE ");
        bce.setBounds(95, 150, 60, 40);
        f.add(bce);
        Button bc = new Button(" C ");
        bc.setBounds(180, 150, 60, 40);
        f.add(bc);
        Button bdel = new Button(" DEL ");
        bdel.setBounds(265, 150, 60, 40);
        f.add(bdel);

        //squre 
        //reciprocal ,del, clear
        Button buttonSqrt = new Button("\u221A");
        buttonSqrt.setBounds(10, 210, 60, 40);
        f.add(buttonSqrt);

        Button buttonSquare = new Button("x\u00B2");
        buttonSquare.setBounds(95, 210, 60, 40);
        f.add(buttonSquare);

        Button buttonReciprocal = new Button("1/x");
        buttonReciprocal.setBounds(180, 210, 60, 40);
        f.add(buttonReciprocal);

        Button bdiv = new Button(" / ");
        bdiv.setBounds(265, 210, 60, 40);
        f.add(bdiv);
        

        

//7,8,9
        Button b7 = new Button(" 7 ");
        b7.setBounds(10, 270, 60, 40);
        f.add(b7);

        Button b8 = new Button(" 8 ");
        b8.setBounds(95, 270, 60, 40);
        f.add(b8);

        Button b9 = new Button(" 9 ");
        b9.setBounds(180, 270, 60, 40);
        f.add(b9);

        Button bmul = new Button(" x ");
        bmul.setBounds(265, 270, 60, 40);
        f.add(bmul);

        //4,5,6
        Button b4 = new Button(" 4 ");
        b4.setBounds(10, 330, 60, 40);
        f.add(b4);
        Button b5 = new Button(" 5 ");
        b5.setBounds(95, 330, 60, 40);
        f.add(b5);
        Button b6 = new Button(" 6 ");
        b6.setBounds(180, 330, 60, 40);
        f.add(b6);
        Button bsub = new Button(" - ");
        bsub.setBounds(265, 330, 60, 40);
        f.add(bsub);

//1,2,3
        Button b1 = new Button(" 1 ");
        b1.setBounds(10, 390, 60, 40);
        f.add(b1);
        Button b2 = new Button(" 2 ");
        b2.setBounds(95, 390, 60, 40);
        f.add(b2);
        Button b3 = new Button(" 3 ");
        b3.setBounds(180, 390, 60, 40);
        f.add(b3);
        Button bplus = new Button(" + ");
        bplus.setBounds(265, 390, 60, 40);
        f.add(bplus);
        
        //.,0.=
        Button bpm = new Button(" +/- ");
        bpm.setBounds(10, 450, 60, 40);
        f.add(bpm);
        Button b0 = new Button(" 0 ");
        b0.setBounds(95, 450, 60, 40);
        f.add(b0);
        Button bdot = new Button(" . ");
        bdot.setBounds(180, 450, 60, 40);
        f.add(bdot);
        Button bequal = new Button(" = ");
        bequal.setBounds(265, 450, 60, 40);
        f.add(bequal);

       
        f.setBounds(400, 200, 355, 516);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        
        new Calculator();
        
    }  
}

    

