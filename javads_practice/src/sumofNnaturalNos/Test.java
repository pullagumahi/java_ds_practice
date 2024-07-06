package sumofNnaturalNos;

import java.util.Scanner;

public class Test {
    static int sumofn_v1(int n) {
        // for loop
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    static int sumofn_v2(int n) {
        // recursion
        if (n == 0)
            return 0;
        else
            return n + sumofn_v2(n - 1);
    }

    static int sumofn_v3(int n) {
        // math formula
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = obj.nextInt();
        System.out.println(sumofn_v1(n));
        System.out.println(sumofn_v2(n));
        System.out.println(sumofn_v3(n));
    }

}
