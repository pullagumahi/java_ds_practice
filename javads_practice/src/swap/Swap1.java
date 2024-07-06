package swap;

/* 
 * Logic1: using temp variable 
 */
public class Swap1 {

    static void swap(int a, int b) {
        System.out.println("before swaping a=" + a + " and b=" + b);
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println("after swaping a=" + a + " and b=" + b);
    }

    public static void main(String[] args) throws Exception {
        Swap1.swap(1,2);//3
    }
}
