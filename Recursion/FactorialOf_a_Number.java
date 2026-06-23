package Recursion;

import java.util.Scanner;

public class FactorialOf_a_Number {
    public  static int fact(int n){
        if(n==1){
            return 1;
        }
        return (n * fact(n-1));
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to see the Factorial of it:");
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
}
