import java.util.*;
public class Duplicate {
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Set<Integer> set=new LinkedHashSet<>();
      for(int num:a){
        set.add(num);
      }
      int[] result=new int[set.size()];
      int i=0;
      for(int num:set){
        result[i++]=num;
      }
      for(int j:result){
        System.out.print(j+" ");
      }
    
    //System.out.println(Arrays.toString(result));
    
    }
}
