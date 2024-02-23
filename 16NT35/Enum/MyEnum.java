enum myCars{


    //these are constant
    HONDA, BMW, LANDROVER
};

public class MyEnum {

    public static void main(String[] args) {
        myCars currentcar = myCars.LANDROVER;

        myCars currentcars = myCars.BMW;

        System.out.println(("My First current Car is going to be : "+ currentcar));

        System.out.println(("My Second current Car is going to be : "+ currentcars));
    }
    
}
