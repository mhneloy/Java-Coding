package Loops;
import java.util.Scanner;
public class basiclopps {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(n * i);
        }
    }
}
