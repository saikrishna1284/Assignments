
import java.util.*;
public class Prime
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++){
		    if(isPrime(i)){
		        sum+=i;
		    }
		}
		System.out.println(sum);
		
	}
	 static boolean isPrime(int n){
	    int count=0;
	    for(int i=2;i<=n;i++){
	        if(n%i==0){
	            count++;
	        }
	    }
	    if(count==1){
	        return true;
	    }else{
	        return false;
	    }
	    
	}
} 
    

