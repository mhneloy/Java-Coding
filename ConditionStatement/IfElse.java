package ConditionStatement;
import java.util.Scanner;
public class IfElse {
    static String EvenOdd (int num){
        if(num%2 == 0) return "Even";
        else return "ODD";
    }
    static  String divisible5(int num){
        if(num%5 == 0)return "Divisible by 5";
        else return  "Not Divisible by 5";
    }
    static String leapYear(int year){
        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            return String.format("This year %d is a Leap Year", year);
        }else return String.format("This year %d is not a Leap Year", year);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = sc.nextInt();
        System.out.printf("The number is: " +EvenOdd(num));
        System.out.println();
        System.out.printf("The number is: " +divisible5(num));
        System.out.println();
        System.out.printf(leapYear(num));
    }
}
