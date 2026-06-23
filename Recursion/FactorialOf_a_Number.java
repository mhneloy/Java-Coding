package Recursion;

import java.util.Scanner;

public class FactorialOf_a_Number {
//       Another way to do this code.
    /*

       public static int fact(int n){
           return (n==1)? 1: (n*fact(n-1));
       }

      */
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
