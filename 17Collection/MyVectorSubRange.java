import java.util.List;

public class MyVectorSubRange {

    public static void main(String[] args) {
        
        Vector<String> vct = new Vector<String>();

//adding elements to the end

vct.add("First");

vct.add("Second");

vct.add("Third");

vct.add("Random");

vct.add("click");

System.out.println("Actual vector:"+vct);

List<String> list = vct.subList(1, 4);

System.out.println("Sub List: "+list);

}

}
    
    

