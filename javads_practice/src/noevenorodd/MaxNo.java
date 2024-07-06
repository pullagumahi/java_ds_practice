package noevenorodd;

import java.util.Scanner;

public class MaxNo {

    static String check_evenorodd(int n) {
        // manual code
        return (n % 2 == 0) ? "EVEN NUMBER" : "ODD NUMBER";
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = obj.nextInt();
        System.out.println(check_evenorodd(n));
    }

}
