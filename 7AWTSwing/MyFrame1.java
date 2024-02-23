//using Association
import java.awt.*;

public class MyFrame1 extends Frame {

    //Component class ke refrence variable ko always class level pr define krte h AR Object constructor me bnate h
    Frame f;  //Instant refrence variable bnaya abhi object nhi bna h only Refrence variable bnaya h 
    MyFrame1(String S){

        f=new Frame(S);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        
        new MyFrame1("FF");
        new MyFrame1("SF");
    }
    
}


