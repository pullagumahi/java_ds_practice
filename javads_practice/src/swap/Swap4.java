package swap;

import java.util.Scanner;

/*
 * without using temp variable using bitwise operators
 */
public class Swap4 {

    static void swap(int a, int b) {
        System.out.println("before swaping a=" + a + " and b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swaping a=" + a + " and b=" + b);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = obj.nextInt();
        System.out.println("Enter b value");
        int b = obj.nextInt();
        swap(a, b);
    }

}
