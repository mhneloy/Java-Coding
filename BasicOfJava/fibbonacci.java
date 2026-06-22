package BasicOfJava;

import java.util.Scanner;

public class fibbonacci {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int n = sc.nextInt();

        int first = 0;
        int sec = 1;
        int fibo;
        System.out.println(first + "\n" + sec);
        for (int i = 3; i<=n; i++){
                fibo = first + sec;
            System.out.println(fibo);
            first = sec;
            sec = fibo;
        }
    }
}
