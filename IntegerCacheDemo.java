public class IntegerCacheDemo {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;

        Integer x = 200;
        Integer y = 200;

        System.out.println("a == b : " + (a == b));         // true: uses cached objects
        System.out.println("a.equals(b) : " + a.equals(b)); // true: values are equal

        System.out.println("x == y : " + (x == y));         // false: different objects
        System.out.println("x.equals(y) : " + x.equals(y)); // true: values are equal

        /* 
        System.out.println("System.identityHashCode(a): " + System.identityHashCode(a));
        System.out.println("System.identityHashCode(b): " + System.identityHashCode(b));
        System.out.println("System.identityHashCode(x): " + System.identityHashCode(x));
        System.out.println("System.identityHashCode(y): " + System.identityHashCode(y));
        */
    }
}
