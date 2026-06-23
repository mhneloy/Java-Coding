package Recursion;
import java.util.Scanner;
public class OneToN_Recursion {

    static void print1toN(int n){
        if(n == 0)return;
        System.out.println(n);
        print1toN(n-1);
        if(n!=1) System.out.println(n);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want to print from 1 to N:");
        int n = sc.nextInt();
        print1toN(n);
    }
}
