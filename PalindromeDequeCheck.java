import java.util.*;

public class PalindromeDequeCheck{
    public static boolean isPalindrome(String str) {
        Deque<Character> dq = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            dq.addLast(c);
        }

        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "mabcm";
        System.out.println(s + " is Palindrome? " + isPalindrome(s));
    }
}
