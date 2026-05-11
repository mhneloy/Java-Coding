package Loops;
import java.util.Scanner;

public class reverseLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer");
        int n = sc.nextInt();
        for(int i = n; i>0; i--){
            System.out.println(i);
        }
    }
}
