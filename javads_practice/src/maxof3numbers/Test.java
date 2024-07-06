package maxof3numbers;

import java.util.Scanner;

public class Test {
    
    static int max1(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    static int max2(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = obj.nextInt();
        System.out.println("Enter b value");
        int b = obj.nextInt();
        System.out.println("Enter c value");
        int c = obj.nextInt();
        System.out.println(max1(a, b, c));
        System.out.println(max2(a, b, c));
    }
}
