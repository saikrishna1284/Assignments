import java.util.*;

public class SortingVowelsWithoutChangingCons {
    
    public static String sortVowels(String s) {

        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        List<Character> vowels = new ArrayList<>();

        for(char c: s.toCharArray()){
            System.out.println(c);
            if(vowelSet.contains(c)){
                vowels.add(c);
            }
        }

        Collections.sort(vowels);

        StringBuilder result = new StringBuilder();
        int index = 0;
        
        for(char c: s.toCharArray()){
            if(vowelSet.contains(c)){
                result.append(vowels.get(index++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

      
        String sortedVowels = sortVowels(input);

       
        System.out.println("Result after sorting vowels: " + sortedVowels);

        sc.close();
    }
}
