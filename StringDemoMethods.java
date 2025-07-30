import java.util.Arrays;
public class StringDemoMethods {
    public static void main(String[] args) {
     
      String s="Sai Krishna";
      String s1= new String(" Sai Krishna ");
      String s2="SAI";
      String s3="sai";
      String s4="Hi, this is sai Krishna nice to meet you";
      System.out.println(s4.length());
      System.out.println(s2.toLowerCase());
      System.out.println(s3.toUpperCase());
      System.out.println(s.charAt(4));
      System.out.println(s2.equals(s3));
      System.out.println(s2.equalsIgnoreCase(s3));
      System.out.println(s4.substring(2, 10));
      System.out.println(s4.substring(7));
      System.out.println(s1.trim());
      System.out.println(s2.compareTo(s3));
      System.out.println(s2.compareToIgnoreCase(s3));

      String[] parts=s4.split(" ");
      System.out.println(Arrays.toString(parts));
      for(String part:parts){
        System.out.println(part);
      }
      System.out.println(s3.indexOf("a"));
      System.out.println(s4.contains("sai"));
      System.out.println(s3.replace("s","k"));
      System.out.println(s3.isEmpty());
      System.out.println(s4.isBlank());
      System.out.println(s3.repeat(4));
    }
    

    
}
