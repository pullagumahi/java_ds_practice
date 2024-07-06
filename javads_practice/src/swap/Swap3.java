package swap;

import java.util.Scanner;

/**
 * Swap3 without temp variable using mul and div
 */

public class Swap3 {

    static void swap(int a, int b) {
        System.out.println("before swaping a=" + a + " and b=" + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("after swaping a=" + a + " and b=" + b);
    }

     public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = obj.nextInt();
        System.out.println("Enter b value");
        int b = obj.nextInt();
        Swap2.swap(a,b);//3
    }

}
