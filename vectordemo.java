import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectordemo {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<>(2);

        
        System.out.println("Initial capacity: " + vec.capacity());

        vec.add("Apple");
        vec.add("Banana");
        System.out.println("Capacity after 2 adds: " + vec.capacity());

        vec.add("Cherry"); 
        System.out.println("Capacity after adding 3rd element: " + vec.capacity());
        System.out.println("Vector now: " + vec);

     
        vec.add(1, "Orange");
        System.out.println("After adding Orange at index 1: " + vec);

       
        System.out.println("Element at index 2: " + vec.get(2));

        vec.set(2, "Blueberry");
        System.out.println("After setting index 2 to Blueberry: " + vec);

     
        vec.remove(1);
        System.out.println("After removing index 1: " + vec);

        vec.remove("Apple");
        System.out.println("After removing Apple: " + vec);

        System.out.println("Contains Cherry? " + vec.contains("Cherry"));
        System.out.println("Index of Cherry: " + vec.indexOf("Cherry"));
        vec.add("Cherry"); 
        System.out.println("Last index of Cherry: " + vec.lastIndexOf("Cherry"));

    
        System.out.println("\nEnumeration iteration:");
        Enumeration<String> e = vec.elements();
        vec.add("Dates");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        
        System.out.println("\nIterator iteration:");
        try {
            Iterator<String> itr = vec.iterator();
            while (itr.hasNext()) {
                String fruit = itr.next();
                System.out.println(fruit);
                if (fruit.equals("Banana")) {
                    vec.add("Grapes"); 
                }
            }
        } catch (ConcurrentModificationException ex) {
            System.out.println("⚠ ConcurrentModificationException caught — fail-fast triggered!");
        }

       
        vec.ensureCapacity(10);
        System.out.println("\nCapacity after ensureCapacity(10): " + vec.capacity());

        
        vec.trimToSize();
        System.out.println("Capacity after trimToSize(): " + vec.capacity());

     
        System.out.println("\nFinal Vector: " + vec);
        System.out.println("Size: " + vec.size());
        System.out.println("Capacity: " + vec.capacity());

      
        vec.clear();
        System.out.println("After clear(): " + vec);
    }
}
