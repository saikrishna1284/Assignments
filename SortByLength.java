import java.util.Arrays;
import java.util.Scanner;

public class SortByLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Elements:");
        int n=sc.nextInt();
        
        String[] str =new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(str[j].length()>str[j+1].length()||(str[j].length()==str[j+1].length()&&str[j].compareTo(str[j+1])>0)){
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(str));
        // for(String s:str){
        //     System.out.println(s);
        // }
     }
    
}
