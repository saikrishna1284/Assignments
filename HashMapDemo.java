import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        System.out.println("Initial Map: " + map);

        map.putIfAbsent(2, "Blueberry");
        map.putIfAbsent(5, "Elderberry");
        System.out.println("After putIfAbsent: " + map);

        System.out.println("Value for key 3: " + map.get(3));

        
        System.out.println("Value for key 10: " + map.getOrDefault(10, "Not Found"));

        
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));


        map.replace(2, "Banana", "Blueberry");
        System.out.println("After replace: " + map);

        map.remove(4);
        System.out.println("After removing key 4: " + map);

        map.remove(5, "WrongValue"); 
        map.remove(5, "Elderberry"); 
        System.out.println("After conditional remove: " + map);

        System.out.println("Keys: " + map.keySet());

        System.out.println("Values: " + map.values());

        System.out.println("Entries: " + map.entrySet());

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        map.forEach((key, value) -> System.out.println("forEach -> " + key + ":" + value));

        System.out.println("Size of map: " + map.size());
        System.out.println("Is map empty? " + map.isEmpty());

        @SuppressWarnings("unchecked")
        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) map.clone();
        System.out.println("Cloned Map: " + cloneMap);

 
        map.clear();
        System.out.println("After clear, map: " + map);
    }
}
