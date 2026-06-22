package BasicOfJava;

import java.util.Scanner;

public class armstrong {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for check is it Armstrong or not: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp!= 0){
            int reminder = temp%10;
            sum += Math.pow(reminder, 3);
            temp = temp/10;
        }
        if (num == sum){
            System.out.println("this number is armstrong");
        }else System.out.println("this is not a armstrong number");

    }
}
