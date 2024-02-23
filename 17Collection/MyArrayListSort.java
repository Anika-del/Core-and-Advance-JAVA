import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.List;

public class MyArrayListSort { 
    
    public static void main(String a[]) { 
        
        List<Empl> list = new ArrayList<Empl>(); 
        list.add(new Empl("Ram", 3000)); 
        list.add(new Empl("John", 6000)); 
        list.add(new Empl("Crish", 2000)); 
        list.add(new Empl("Tom", 2400));

// Collections.sort(List<T> list, Comparator<? s c) 

Collections.sort(list, new MySalaryComp()); 
System.out.println("Sorted list entries by salary: "); 

for (Empl e : list) { 
    System.out.println(e.getSalary()); 
}

Collections.sort(list, new MyNameComp()); 

System.out.println("Sorted list entries by name: "); 
for (Empl e : list) { 
    System.out.println(e.getName()); 
} 
}
 }

class MySalaryComp implements Comparator<Empl> 

{ 

   

