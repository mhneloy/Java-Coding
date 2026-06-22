package BasicOfJava;

import java.util.Scanner;

public class sumOfDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp != 0){
            int reminder = temp % 10;
            sum += reminder;
            temp = temp/10;
        }
        System.out.println(sum);
    }
}
