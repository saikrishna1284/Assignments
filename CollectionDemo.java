
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("A");
        coll.add("B");
        coll.add("C");
        coll.add(null);
        Collection<String> coll1=new ArrayList<>();
        coll1.add("D");
        coll1.add("D");
        coll1.add("B");
        coll1.add("C");
        coll1.add("E");
        System.out.println(coll);
        System.out.println(coll1);
        coll.addAll(coll1);
        System.out.println(coll);
        coll.retainAll(coll1);
        coll1.retainAll(Arrays.asList("C","D"));
        System.out.println(coll);
        System.out.println(coll1);
        System.out.println("IsEmpty? " + coll.isEmpty());
        coll1.remove("D");
        System.out.println(coll1);
        coll.removeAll(coll1);
        System.out.println(coll);
        System.out.println("Size: " + coll.size());
        Object[] arr = coll.toArray();
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println(coll.contains("D"));
    
       
        



           
    }
    
}
