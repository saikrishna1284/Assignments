import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=findElement(arr);
        System.out.println(result);
        System.out.println("Using HashMap");
        int maj=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>n/2){
                maj=num;
                break;
            }
        }
        if(maj!=-1){
            System.out.println("Major Element "+maj);
        }else{
            System.out.println("No major element");
        }


        
    }
    public static int findElement(int[] arr) {
    Arrays.sort(arr);

    int candidate = arr[arr.length / 2]; 
    int count = 0;
    for (int num : arr) {
        if (num == candidate) {
            count++;
        }
    }
    if (count > arr.length / 2) {
        return candidate;
    } else {
        return -1; 
    }
}

}
