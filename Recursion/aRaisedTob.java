package Recursion;

import java.util.Scanner;

public class aRaisedTob {
    public static int power(int num, int pow){
        if(pow == 1) return num;
        return (num * power(num,pow-1));
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num, pow;
        System.out.printf("Enter any two number to see the 'a' raised to the power 'b' anser: ");
        num = sc.nextInt();
        pow = sc.nextInt();
        System.out.print(power(num,pow));

    }
}
