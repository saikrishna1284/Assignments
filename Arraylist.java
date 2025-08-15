import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Arraylist{
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(2); 

        
        list.add("Apple");
        list.add("Banana");
        System.out.println("ArrayList after 2 adds: " + list);
        

        list.add("Cherry");
        System.out.println("After adding Cherry: " + list);

        
        list.add(1, "Orange");
        System.out.println("After adding Orange at index 1: " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, "Blueberry");
        System.out.println("After setting index 2 to Blueberry: " + list);

        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        
        list.remove("Apple");
        System.out.println("After removing Apple: " + list);

        
        System.out.println("Contains Cherry? " + list.contains("Cherry"));
        System.out.println("Index of Cherry: " + list.indexOf("Cherry"));
        list.add("Cherry"); 
        System.out.println("Last index of Cherry: " + list.lastIndexOf("Cherry"));

        
        System.out.println("\nIterator iteration (fail-fast demo):");
        try {
            Iterator<String> itr = list.iterator();
            while (itr.hasNext()) {
                String fruit = itr.next();
                System.out.println(fruit);
                if (fruit.equals("Banana")) {
                    list.add("Grapes"); 
                }
            }
        } catch (ConcurrentModificationException ex) {
            System.out.println("⚠ ConcurrentModificationException caught — fail-fast triggered!");
        }

        
        list.ensureCapacity(10);
        System.out.println("\nList after ensureCapacity(10): " + list);

        
        list.trimToSize();
        System.out.println("After trimToSize(): " + list);

       
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
