import java.util.*;
public class ReplaceNonCoprimesNumbersArray {

    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> nlist = new ArrayList<>();
        for (Integer n : nums) {
            nlist.add(n);
            while (nlist.size() > 1) {
                int a = nlist.get(nlist.size() - 2);
                int b = nlist.get(nlist.size() - 1);
                int g = greatCommanDivisor(a, b);
                if (g > 1) {
                    nlist.remove(nlist.size() - 1);
                    nlist.remove(nlist.size() - 1);
                    nlist.add(lcm(a, b, g));
                } else {
                    break;
                }
            }
        }
        return nlist;
    }

    private int greatCommanDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b, int g) {
        return (int)((long)a * b / g);
    }

    public static void main(String[] args) {
        ReplaceNonCoprimesNumbersArray sol = new ReplaceNonCoprimesNumbersArray();

        int[] nums1 = {6, 4, 3, 2, 7, 6, 2};
        int[] nums2 = {2, 2, 1, 1, 3, 3, 3};

        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + sol.replaceNonCoprimes(nums1));

        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.println("Output: " + sol.replaceNonCoprimes(nums2));
    }
}


