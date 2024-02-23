//using Inheritance
import java.awt.*; //AWT package import kiya
public class MyFrame extends Frame {  //MyFrame class bna ke parent class Frame ko extend kiya
    //Frame class ka all object MyFrame me aa jayega, so inheritence-(child class object is always treated as parent class object.)

    MyFrame(String S){//yeh constructor h ar GUI ka sara code constructor me hi likhte h 
        
        super(S); //super parent ke constructor ko call krega //String type ke constructor ko
        setSize(400, 400);   //setSize frame class ka ek method h yha window un visiable h
        setVisible(true); //secton method chalte hi visiable ho jayega ar minimise, cut, and resize Window aa jayega
    }

    public static void main(String[] args) {

        //hm upar ke sare code main ke andar rkhte but hme 1 se jyade object bnana h to cunstrutor me likhenge jisse jb bhi hme jarurt
        // pde to call kr lenge isliye GUIbnane ka sara code hi constructor me likhte h 
        
        new MyFrame("FF");  //1 object make one window 
        new MyFrame("SF");//if we make 50 obje the 50 window
        
    }
    
}
