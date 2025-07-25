import java.util.Scanner;
public class ArraySmallestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        byte n = sc.nextByte();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
       
    }
}
