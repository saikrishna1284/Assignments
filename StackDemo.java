import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        st.push("A");
        st.push("B");
        st.push("C");
        System.out.println("Stack: " + st);

        System.out.println("Peek: " + st.peek());  
        System.out.println("Pop: " + st.pop());  
        System.out.println("After Pop: " + st);

        System.out.println("Search B: " + st.search("B")); 
    }
}
