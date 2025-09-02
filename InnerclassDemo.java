class Outer{
    int m=10;
    class Inner{
        void doStuff(){
            System.out.println(m);
        }
    }
}
public class InnerclassDemo {
    public static void main(String[] args) {
        Outer.Inner obj= new Outer().new Inner();
        obj.doStuff();
    }
}
