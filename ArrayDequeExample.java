import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(10);
        adq.addFirst(20);
        adq.addLast(30);
        adq.offer(40);
        adq.offerFirst(50);
        adq.offerLast(60);

        System.out.println("ArrayDeque: " + adq);

        System.out.println("peek(): " + adq.peek());
        System.out.println("peekFirst(): " + adq.peekFirst());
        System.out.println("peekLast(): " + adq.peekLast());

      
        System.out.println("poll(): " + adq.poll());
        System.out.println("pollFirst(): " + adq.pollFirst());
        System.out.println("pollLast(): " + adq.pollLast());

        System.out.println("Final ArrayDeque: " + adq);
    }
}
