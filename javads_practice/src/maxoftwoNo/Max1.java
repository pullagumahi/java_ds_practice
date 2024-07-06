package addition.maxoftwoNo;

import java.util.*;

public class Max1 {

    static int max_version1(int a,int b)
    {
    //manual code
    return (a>b)?a:b;
    }

    static int max_version2(int a, int b) {
        // predefined lib's
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = obj.nextInt();
        System.out.println("Enter b value");
        int b = obj.nextInt();
        System.out.println("max value from version1= " + max_version1(a, b));
        System.out.println("max value from version2= "+max_version2(a,b));

    }

}
