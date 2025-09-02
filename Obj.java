class Mainobj{
    int a=10;
    String s1="Sai";
    Mainobj(int a,String s1){
       this.a=a;
       this.s1=s1;
    }
    Mainobj(){}
    public String toString(){
     return a+" "+s1;
    }
} 
public class Obj {
    public static void main(String[] args) {
        Mainobj s =new Mainobj();
        System.out.println(s);
    }
    
}
