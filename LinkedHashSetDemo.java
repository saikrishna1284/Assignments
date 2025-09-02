import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
      
        LinkedHashSet<String> set = new LinkedHashSet<>();

       
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Apple"); 
        set.add(null);    

        System.out.println("Set: " + set);

        
        System.out.println("Contains Mango? " + set.contains("Mango"));

        
        set.remove("Apple");
        System.out.println("After removing Apple: " + set);

        System.out.print("Iterating: ");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();

        
        System.out.println("Size: " + set.size());

       
        LinkedHashSet<String> cloned = (LinkedHashSet<String>)set.clone();
        System.out.println("Cloned Set: " + cloned);

       
        set.clear();
        System.out.println("After clear: " + set);
    }
}
