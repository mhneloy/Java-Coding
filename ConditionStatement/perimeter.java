package ConditionStatement;
import java.util.Scanner;
public class perimeter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entehre the length: ");
        double lenght = sc.nextDouble();
        System.out.printf("Entehre the breadth: ");
        double breadth = sc.nextDouble();
        double area = lenght * breadth;
        double peremetter = 2*(lenght + breadth);
        if(area>peremetter){
            System.out.println("The area is Grater then peremetter");
        }else {
            System.out.println("The area is Smaller then peremetter");
        }
    }
}
