import javax.swing.*;
import java.awt.*;
 
public class Calculator1  {
    JFrame frame;
    //Creating objects of Components
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
   
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
 
    Calculator1() {
        prepareGUI();
        addComponents();
    }
 
    public void prepareGUI() {
        //Setting properties of JFrame(Window)
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 490);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public void addComponents() {
        //Setting property of Label
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);
        
        //Setting property of text field
        textField.setBounds(10, 40, 270, 40);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
        
       
        
        //Setting property of button 7
        buttonSeven.setBounds(10, 230, 60, 40);
         frame.add(buttonSeven);
        
        // Setting property of button 8
        buttonEight.setBounds(80, 230, 60, 40);
       frame.add(buttonEight);
 
        //Setting property of button 9
        buttonNine.setBounds(150, 230, 60, 40);
        frame.add(buttonNine);
 
        //Setting property of button 4
        buttonFour.setBounds(10, 290, 60, 40);
        frame.add(buttonFour);
 
       //Setting property of button 5
        buttonFive.setBounds(80, 290, 60, 40);
         frame.add(buttonFive);
 
        //Setting property of button 6
        buttonSix.setBounds(150, 290, 60, 40);
         frame.add(buttonSix);
 
        //Setting property of button 1
        buttonOne.setBounds(10, 350, 60, 40);
        frame.add(buttonOne);
 
        //Setting property of button 2
        buttonTwo.setBounds(80, 350, 60, 40);
        frame.add(buttonTwo);
        
        //Setting property of button 3
        buttonThree.setBounds(150, 350, 60, 40);
         frame.add(buttonThree);
 
        //Setting property of dot button
        buttonDot.setBounds(150, 410, 60, 40);
        frame.add(buttonDot);
 
        //Setting property of button 0
        buttonZero.setBounds(10, 410, 130, 40);
        frame.add(buttonZero);
 
       //Setting property of button =
        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setBackground(new Color(239, 188, 2));
        frame.add(buttonEqual);
 
       //Setting property of button /
        buttonDiv.setBounds(220, 110, 60, 40);
       buttonDiv.setBackground(new Color(239, 188, 2));
        frame.add(buttonDiv);
 
        //Setting property of button square root
        buttonSqrt.setBounds(10, 170, 60, 40);
        frame.add(buttonSqrt);
 
        //Setting property of button X
        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setBackground(new Color(239, 188, 2));
        frame.add(buttonMul);
 
        //Setting property of button -
        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);
        //Setting property of button +
        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setBackground(new Color(239, 188, 2));
        frame.add(buttonPlus);
 
        //Setting property of button square
        buttonSquare.setBounds(80, 170, 60, 40);
        frame.add(buttonSquare);
 
        //Setting property of reciprocal button
        buttonReciprocal.setBounds(150, 170, 60, 40);
        frame.add(buttonReciprocal);
 
        //Setting property of delete button
        buttonDelete.setBounds(150, 110, 60, 40);
        frame.add(buttonDelete);
 
        //Setting property of clear button
        buttonClear.setBounds(80, 110, 60, 40);
        frame.add(buttonClear);
 
    }

    public static void main(String[] args) {

        new Calculator1();
        
    }
}