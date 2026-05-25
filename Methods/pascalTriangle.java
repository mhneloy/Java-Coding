package Methods;

import java.util.Scanner;

public class pascalTriangle {
    public static int fact (int x){
        int nfac = 1;
        for (int i = 1; i <=x; i++) {
            nfac *= i;
        }
        return  nfac;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(fact(i)/(fact(j)*fact(i-j)) + " ");
            }
            System.out.println();
        }

    }
}
