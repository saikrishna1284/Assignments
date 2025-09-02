import java.util.*;
public class FriendlyPair {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int sum1=getFactorsSum(n1);
       int sum2=getFactorsSum(n2);
       if(sum1/n1==sum2/n2){
        System.out.println(n1+" and "+n2+" are Friendly Pairs");
       }else{
        System.out.println(n1+" and "+n2+" are not Friendly Pairs");
       }

    }
    static int getFactorsSum(int num){
        int s=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                s+=i;
            }
        }
        return s;
    }
}
