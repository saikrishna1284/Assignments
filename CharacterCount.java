import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Elements:");
        int n=sc.nextInt();
        int c;
        String[] str =new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }for(int i=0;i<n;i++){
          c=uppercount(str[i]);
          System.out.println(str[i]+"->"+c);
        }
        
    }
    public static int uppercount(String s){
        int c=0;
        char[] ch=s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]<=90&&ch[i]>=65){
                c++;

            }
        }
         return c;
    }

}
