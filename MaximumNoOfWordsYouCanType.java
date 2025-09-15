import java.util.*;

class MaximumNoOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c = 0;
        String[] words = text.split(" ");
        Set<Character> bl = new HashSet<>();

        for (char ch : brokenLetters.toCharArray()) {
            bl.add(ch);
        }

        for (String word : words) {
            boolean canType = true;
            for (int j = 0; j < word.length(); j++) {
                if (bl.contains(word.charAt(j))) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        MaximumNoOfWordsYouCanType sol = new MaximumNoOfWordsYouCanType();

        String text1 = "hello world";
        String broken1 = "ad";
        System.out.println("Result 1: " + sol.canBeTypedWords(text1, broken1)); 
        

        String text2 = "leet code";
        String broken2 = "lt";
        System.out.println("Result 2: " + sol.canBeTypedWords(text2, broken2)); 
      

        String text3 = "practice makes perfect";
        String broken3 = "abc";
        System.out.println("Result 3: " + sol.canBeTypedWords(text3, broken3)); 
        
    }
}
