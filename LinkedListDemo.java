import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("A");              
        ll.add(1, "B");           
        ll.addAll(Arrays.asList("C", "D"));
        System.out.println("LinkedList: " + ll);

        System.out.println("Get by index 2: " + ll.get(2));
        ll.set(2, "C-modified");  
        System.out.println("After set(2): " + ll);

        //deque methods
        ll.addFirst("Start");
        ll.addLast("End");
        ll.offer("X");            
        ll.offerFirst("Head");
        ll.offerLast("Tail");
        System.out.println("After addFirst, addLast, offer, offerFirst, offerLast: " + ll);

        System.out.println("First: " + ll.getFirst());
        System.out.println("Last: " + ll.getLast());
        System.out.println("Peek: " + ll.peek()); 
        System.out.println("PeekFirst: " + ll.peekFirst());
        System.out.println("PeekLast: " + ll.peekLast());

        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removeFirst & removeLast: " + ll);

        System.out.println("Poll: " + ll.poll()); 
        System.out.println("PollFirst: " + ll.pollFirst());
        System.out.println("PollLast: " + ll.pollLast());
        System.out.println("After poll, pollFirst & pollLast: " + ll);

        ll.push("Pushed");                
        System.out.println("After push: " + ll);
        System.out.println("Pop from front: " + ll.pop()); 

        
        System.out.println("Contains 'B'? " + ll.contains("B"));
        System.out.println("Index of 'B': " + ll.indexOf("B"));
        System.out.println("Last index of 'B': " + ll.lastIndexOf("B"));
        System.out.println("Size: " + ll.size());
        System.out.println("Is empty? " + ll.isEmpty());

        
        ll.remove("B");
        System.out.println("After remove('B'): " + ll);
        ll.removeAll(Arrays.asList("C-modified", "X"));
        System.out.println("After removeAll: " + ll);
        ll.add("G");
        ll.add("H");
        ll.retainAll(Arrays.asList("G", "H"));
        System.out.println("After retainAll: " + ll);

        ll.clear();
        System.out.println("After clear: " + ll);

        
        ll.add("AA");
        ll.add("BB");
        Object[] arr = ll.toArray();
        System.out.println("To array: " + Arrays.toString(arr));
        String[] strArr = ll.toArray(new String[0]);
        System.out.println("To String array: " + Arrays.toString(strArr));

        
        ll.add("CC");
        ll.add("DD");
        System.out.print("Iterator: ");
        Iterator<String> it = ll.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        ListIterator<String> lit = ll.listIterator(ll.size());
        System.out.print("ListIterator backward: ");
        while (lit.hasPrevious()) System.out.print(lit.previous() + " ");
        System.out.println();

        
        ll.add("BB");
        ll.add("CC");
        ll.removeFirstOccurrence("BB");
        ll.removeLastOccurrence("CC");
        System.out.println("After removeFirstOccurrence('BB') & removeLastOccurrence('CC'): " + ll);


    }
}
