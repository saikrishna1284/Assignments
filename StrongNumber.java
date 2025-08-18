import java.util.Scanner;

public class StrongNumber {
    
    public  static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static boolean isStrong(int n){
        int s=0;
        int temp=n;
        while(temp>0){
            int d=temp%10;
            s+=factorial(d);
            temp=temp/10;

        }
        return s==n;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        if(isStrong(number)){
            System.out.println(number+" is a Strong Number");
        }else{
            System.out.println(number+" is not a Strong Number");
        }
    }
   
}

    

