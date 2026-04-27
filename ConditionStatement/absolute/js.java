package ConditionStatement.absolute;
import java.util.Scanner;

public class js {
    static int absolute(int num){
        if(num>=0) return  num;
        else return (-1*num);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter any number: ");
        int num = sc.nextInt();
        System.out.printf("Absoulte number: "+absolute(num));
    }
}
