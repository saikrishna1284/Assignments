import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Enter the "+(n-1)+" number: ");
        Integer[] arr=new Integer[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        // List<Integer> list=Arrays.asList(arr);
        // Collections.sort(list);
        // for(int i=0;i<=n;i++){
        //     if(!list.contains((i))){
        //         System.out.println("Missing Element: "+i);

        //         break;
        //     }
        // }

        for(int i=0;i<=n;i++){
            boolean found=false;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                   found=true;
                   break;
                }
            }
            if(!found){
                System.out.println("Missing element: "+i);
               // break;
            }
        }
    }
}
