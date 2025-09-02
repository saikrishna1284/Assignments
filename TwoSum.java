import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        indexTwoSuM(arr,target);

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                   System.out.println("["+i+","+j+"]");
                return;
                }
            }
        }
    }
    public static void indexTwoSuM(int[] arr,int target ){

        HashMap<Integer,Integer> ts=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(ts.containsKey(complement)){
                System.out.println("["+ts.get(complement)+","+i+"]");
                return;
            }
            ts.put(arr[i],i);
        }
       System.out.println("No Pair Found");

    }
    
}
