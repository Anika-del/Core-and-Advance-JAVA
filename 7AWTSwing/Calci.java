import java.awt.*;
class Calci
{
  Frame f;
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
  //Button b[ ]= new Button[10];
  //Button  per,ce,c,add, sub,mul,div,clear,mod,Eq,dot,minus;
  
  Calci(String s)
  {
	f = new Frame(s);
	
/*/////////////////////////////////////////////////////////////*/
		
    b1=new Button("%");
	b1.setBounds(10,150,80,55);
	f.add(b1);
	
	b2=new Button("CE");
	b2.setBounds(95,150,80,55);
	f.add(b2);
	
	b3=new Button("C");
	b3.setBounds(180,150,80,55);
	f.add(b3);
	
	b4=new Button("Sqrt");
	b4.setBounds(265,150,80,55);
	f.add(b4);
	
/*/////////////////////////////////////////////////////////////*/
	
	b5=new Button("1/x");
	b5.setBounds(10,210,80,55);
	f.add(b5);
	
	b6=new Button("x^2");
	b6.setBounds(95,210,80,55);
	f.add(b6);
	
	b7=new Button("Log");
	b7.setBounds(180,210,80,55);
	f.add(b7);
	
	b8=new Button("/");
	b8.setBounds(265,210,80,55);
	f.add(b8);
	
/*/////////////////////////////////////////////////////////////*/
	
    b9=new Button("7");
	b9.setBounds(10,270,80,55);
	f.add(b9);
	
	b10=new Button("8");
	b10.setBounds(95,270,80,55);
	f.add(b10);
	
	b11=new Button("9");
	b11.setBounds(180,270,80,55);
	f.add(b11);
	
	b12=new Button("*");
	b12.setBounds(265,270,80,55);
	f.add(b12);
	
/*/////////////////////////////////////////////////////////////*/


  b13=new Button("4");
	b13.setBounds(10,330,80,55);
	f.add(b13);
	
	b14=new Button("5");
	b14.setBounds(95,330,80,55);
	f.add(b14);
	
	b15=new Button("6");
	b15.setBounds(180,330,80,55);
	f.add(b15);
	
	b16=new Button("-");
	b16.setBounds(265,330,80,55);
	f.add(b16);
	
/*/////////////////////////////////////////////////////////////*/
  
    b17=new Button("1");
	b17.setBounds(10,390,80,55);
	f.add(b17);
	
	b18=new Button("2");
	b18.setBounds(95,390,80,55);
	f.add(b18);
	
	b19=new Button("3");
	b19.setBounds(180,390,80,55);
	f.add(b19);
	
	b20=new Button("+");
	b20.setBounds(265,390,80,55);
	f.add(b20);
	
/*/////////////////////////////////////////////////////////////*/

    b21=new Button("+/-");
	b21.setBounds(10,450,80,55);
	f.add(b21);
	
	b22=new Button("0");
	b22.setBounds(95,450,80,55);
	f.add(b22);
	
	b23=new Button(".");
	b23.setBounds(180,450,80,55);
	f.add(b23);
	
	b24=new Button("=");
	b24.setBounds(265,450,80,55);
	f.add(b24);
	
/*/////////////////////////////////////////////////////////////*/
      f.setBounds(400, 200, 355, 516);
      f.setLayout(null);
	  f.setVisible(true);
	}
	
	public static void main(String...s)
	{
	  new Calci("Calculator");
	 }
}

	
	