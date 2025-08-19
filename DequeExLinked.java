import java.util.*;

public class DequeExLinked {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        
        deque.add("X");                
        deque.addFirst("A");           
        deque.addLast("B");            
        deque.offer("C");              
        deque.offerFirst("D");         
        deque.offerLast("E");         
        deque.push("F");               

        System.out.println("Deque after insertions: " + deque);

       
        System.out.println("getFirst(): " + deque.getFirst());   
        System.out.println("getLast(): " + deque.getLast());     
        System.out.println("peek(): " + deque.peek());           
        System.out.println("peekFirst(): " + deque.peekFirst()); 
        System.out.println("peekLast(): " + deque.peekLast());  

        System.out.println("remove(): " + deque.remove());       
        System.out.println("removeFirst(): " + deque.removeFirst());
        System.out.println("removeLast(): " + deque.removeLast());
        System.out.println("poll(): " + deque.poll());           
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollLast(): " + deque.pollLast());

        
        deque.addAll(Arrays.asList("A", "B", "C", "D", "B", "E"));

        System.out.println("\nDeque before occurrence removals: " + deque);

        
        System.out.println("removeFirstOccurrence(\"B\"): " + deque.removeFirstOccurrence("B"));
        System.out.println("removeLastOccurrence(\"B\"): " + deque.removeLastOccurrence("B"));
        System.out.println("Deque after occurrence removals: " + deque);

        
        System.out.println("pop(): " + deque.pop());

        
        System.out.print("\nNormal Iterator: ");
        Iterator<String> it = deque.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.print("\nDescending Iterator: ");
        Iterator<String> dit = deque.descendingIterator();
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }

       
        System.out.println("\n\nFinal Deque: " + deque);
    }
}
