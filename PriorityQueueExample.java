import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.offer(5);


        System.out.println("PriorityQueue (min-heap): " + pq);
        System.out.println("peek(): " + pq.peek());
        System.out.println("poll(): " + pq.poll());
        System.out.println("After poll(): " + pq);

    
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());
        maxPQ.addAll(Arrays.asList(30, 10, 20, 5));
        System.out.println("PriorityQueue (max-heap): " + maxPQ);

        
        PriorityQueue<Student> studentPQ = new PriorityQueue<>(
            (s1, s2) -> s1.name.compareTo(s2.name)
        );

        studentPQ.add(new Student(3, "Charlie"));
        studentPQ.add(new Student(1, "Alice"));
        studentPQ.add(new Student(2, "Bob"));

        System.out.println("PriorityQueue (Students by name):");
        while (!studentPQ.isEmpty()) {
            System.out.println(studentPQ.poll());
        }
    }
}

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}
