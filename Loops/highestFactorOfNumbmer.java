package Loops;
import java.util.Scanner;

public class highestFactorOfNumbmer {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number for see the highest factor number: ");
        int n = sc.nextInt();
        int max_fact = 0;
        for (int i = 1; i < n; i++) {
            if(n%i == 0 && i>max_fact && i<n){
                max_fact = i;
            }

        }
        System.out.println(max_fact);
    }
}
