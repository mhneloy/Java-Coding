package ConditionStatement;
import java.util.Scanner;
public class find2digitNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter any number: ");
        int number = sc.nextInt();
        if(number >= 0 && number <100){
            System.out.println("The number is 2 digit");
        }else {
            System.out.println("The number is not 2 digit");
        }

    }
}
