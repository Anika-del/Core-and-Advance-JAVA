import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {
// Array Declaration and initilization
        String citynames[] = {"Agra", "Mysore", "Chandighar", "Bhopal"};
        List<String> l = Arrays.asList(citynames);
// Array to ArrayList convesrion
ArrayList<String> citylist = new ArrayList<String>(l);
        citylist.add("New City2");
        citylist.add("New City3");

        for(String str : citylist){
            System.out.println(str);
        }
    }
    
}
