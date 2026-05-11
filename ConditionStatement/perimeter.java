package ConditionStatement;
import java.util.Scanner;
public class perimeter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the length: ");
        double length = sc.nextDouble();
        System.out.printf("Enter the breadth: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        double perimeter = 2*(length + breadth);
        if(area>perimeter){
            System.out.println("The area is Grater then perimeter");
        }else if(area == perimeter){
            System.out.println("The area is Equal to then perimeter");
        }else {
            System.out.println("The area is Smaller then perimeter");
        }
    }
}
