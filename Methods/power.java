package Methods;

import java.util.Scanner;

public class power {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
//        int pow = 1;
//        for (int i = 0; i < b; i++) {
//            pow *= a;
//        }

//        System.out.println((Math.max(a,b) > c)?Math.max(a,b):c); // one line print
        System.out.println(Math.min(d,Math.min(a, Math.min(b,c))));
    }
}

