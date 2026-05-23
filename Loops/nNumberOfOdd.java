package Loops;
import java.util.Scanner;

public class nNumberOfOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Odd numbers you want to show: ");
        int n = sc.nextInt();
//        int odd = 1;
//        for(int i = 0; i<n; i++){
//            System.out.println(odd);
//            odd+=2;
//        }
//        for(int i = 4; i<=(3*n + 1); i+=3){
//            System.out.println(i);
//        }
        int a = 1, r = 2;
        for (int i = 1; i <=n ; i++) {
            System.out.print(a + " ");
            a *= r;
        }
    }
}
