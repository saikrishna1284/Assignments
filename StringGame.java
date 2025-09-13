public class StringGame {
    public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                return true;
            }
        }
        return false; 
    }

    private boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
/*Alice and Bob are playing a game on a string.
You are given a string s, Alice and Bob will take turns playing the 
following game where Alice starts first:
On Alice's turn,she has to remove any non-empty substring from s that contains an odd number of vowels.
On Bob's turn,he has to remove any non-empty substring from s that contains an even number of vowels.
The first player who cannot make a move on their turn loses the game.We assume that both Alice and Bob play optimally.

Return true if Alice wins the game, and false otherwise.

*/   
    public static void main(String[] args) {
        StringGame sol = new StringGame();

        String s1 = "leetcoder";
        String s2 = "rhythm";
        String s3 = "a";
        String s4 = "bcdfg";

        System.out.println("Input: " + s1 + " → " + sol.doesAliceWin(s1)); 
        System.out.println("Input: " + s2 + " → " + sol.doesAliceWin(s2)); 
        System.out.println("Input: " + s3 + " → " + sol.doesAliceWin(s3)); 
        System.out.println("Input: " + s4 + " → " + sol.doesAliceWin(s4)); 
    }
}