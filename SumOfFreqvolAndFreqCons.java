import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SumOfFreqvolAndFreqCons {
 public int maxFreqSum(String s) {
        Map<Character,Integer> vmap = new HashMap<>();
        Map<Character,Integer> cmap = new HashMap<>();
        
        char[] str = s.toCharArray();
        
        
        for (char ch : str) {
            if (isVowel(ch)) {
                vmap.put(ch, vmap.getOrDefault(ch, 0) + 1);
            } else {
                cmap.put(ch, cmap.getOrDefault(ch, 0) + 1);
            }
        }

        int vmax, cmax;
        if (vmap.isEmpty()) {
            vmax = 0;
        } else {
            vmax = Collections.max(vmap.values());
        }

        if (cmap.isEmpty()) {
            cmax = 0;
        } else {
            cmax = Collections.max(cmap.values());
        }

        return vmax + cmax;
    }

    private boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

   
    public static void main(String[] args) {
         SumOfFreqvolAndFreqCons sol= new SumOfFreqvolAndFreqCons();
        
        String s1 = "banana";   
        String s2 = "aeiouu";   
        String s3 = "bcdfg";    
        String s4 = "aabbccddeeiioouu"; 

        System.out.println("banana -> " + sol.maxFreqSum(s1));   
        System.out.println("aeiouu -> " + sol.maxFreqSum(s2));   
        System.out.println("bcdfg -> " + sol.maxFreqSum(s3));    
        System.out.println("aabbccddeeiioouu -> " + sol.maxFreqSum(s4)); 
    }
}