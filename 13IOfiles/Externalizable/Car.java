import java.io.*;
class Car implements Externalizable
{
  static int age;
  String name;
  int age;
  /*
    mandatory public no-agr constructor
  */
  public Car()
  {
    System.out.println("default");
  }
  
    Car(String n, int y)
	{
	  name=n;
	  year=n;
	  age= 10;
	 }
	 
/*
*Mandatory writeExternal method.
*/
public void writeExternal(ObjectOutput out) throws IOException
{
  System.out.println("writeExternal");
  out.writeObject(name);
  out.writeInt(year);
  out.writeInt(age);
}

/*
* Mandatory readExternal method.
*/
public void readExternal(ObjectInput in) throws IOException, classNotFoundException
{
	  System.out.println("readExternal");
	  name=(String) in.readObject();
	  year=in.readInt();
}
 
 public String toString()
 {
	 return("Name: " + name + "\n" + "Year: " + year+ "\n" + "Age: "+age);
 }
}

public class ExternExample{
	
public static void main(String args[])
{
	// create a car object
Car car= new Car("MG Hector", 2019);
Car newCar=null;

// serialize the car
try{
	   FileOutputStream fo = new FileOutputStream(tmp);
	   ObjectOutputStream so=new ObjectOutputStream(fo);
	   so.writeObject(car);
	   so.flush();
}
     catch(Exception e)
	 {
		System.out.println(e);
	 }
	 
	 // De- serialize the Car
	 try{
		    FileInputStream fi = new FileInputStream("temp");
			ObjectInputStream si = new ObjectInputStream(fi);
			newCar = (Car) si.readObject();
	     }
	catch(Exception e)
	{
		System.out.println(e);
	}
	
    System.out.println("The Original car is ");
	System.out.println(car);
	System.out.println("The New Car is ");
	System.out.println(newCar);
}
}

	 