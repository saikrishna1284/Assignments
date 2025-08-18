import java.util.Scanner;
public class ArmStrong {
    public static boolean isArmStrong(int num){
        String str=String.valueOf(num);
        int digits=str.length();
        int s=0;
        for(int i=0;i<digits;i++){
            int digit=str.charAt(i)-'0';
            s+=Math.pow(digit,digits);
        }
        return s==num;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        if(isArmStrong(number)){
             System.out.println(number+" is a ArmStrong Number");
        }else{
            System.out.println(number+" is not a ArmStrong Number");
        }
        
    }
}
