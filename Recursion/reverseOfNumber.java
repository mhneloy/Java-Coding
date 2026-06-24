package Recursion;

import java.util.Scanner;

public class reverseOfNumber {
    public static int reverseOfNum(int n, int r){
        if(n==0) return r;
        r *= 10;
        r += (n%10);
        n/=10;
        return (reverseOfNum(n,r));
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = 0;
        System.out.print(reverseOfNum(num,r));
    }
}
