import java.util.*;
public class pascaltriangle {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=1;
            for(int j=0;j<n-i-1;j++){
             System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
              System.out.printf("%2d", num);
              num = num * (i - k) / (k + 1); 
            }

            System.out.println();
    
        }
    }
   
}
