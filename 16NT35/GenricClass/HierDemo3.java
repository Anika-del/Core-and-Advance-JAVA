class Gen<T>
{
    T ob;
    Gen(T o){
        ob = o;
    }

    //return ob
    T getob(){
        return ob;
    }
}

//A subclass of Gen.
class Gen2<T> extends Gen<T>{
    Gen2(T o){
        super(o);
    }
}

//Demonstrate runtime type ID implications of generic class hierachy.

public class HierDemo3 {
    
    public static void main(String[] args) {
        
        //Create a Gen object for Integers.
        Gen<Integer>iOb = new Gen<Integer>(88);

        //Create a Gen2 object for Integers.
        Gen2<Integer>iOb2 = new Gen2<Integer>(88);

        //Create a Gen2 object for Strings.
        Gen2<String>strOb2 = new Gen2<String>("Generics Text");

        if(iOb2 instanceof Gen2<?>)
        System.out.println("iOb2 is instance of Gen2");

        if(iOb2 instanceof Gen2<?>)
        System.out.println("iOb2 is instance of Gen");

        System.out.println();

        if(strOb2 instanceof Gen2<?>)
        System.out.println("strOb is instance of Gen2");

        if(strOb2 instanceof Gen<?>)
        System.out.println("strOb is instance of Gen");

        System.out.println();

        //See of iOb is an instance of Gen2, which its not.
        if(iOb instanceof Gen2<?>)
        System.out.println("iOb is instance of Gen2");

        //See of iOb is an instance of Gen, which its not.
        if(iOb instanceof Gen<?>)
        System.out.println("iOb is instance of Gen");

        //The following can't be compiled because
        //generic type info does not exixt at runtime.
        // if(iOb2 instanceof Gen2<Integer>)
        // System.out.println("iOb2 is instant of Gen2<integer>");


    }
}
