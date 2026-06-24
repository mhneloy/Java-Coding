package Recursion;

import java.util.Scanner;

public class SumOfN {
    public static int findSum(int n){
        if(n == 0) return 0;
        return n + findSum(n-1);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%d",findSum(n));
    }
}
