package BasicOfJava;
import  java.util.Scanner;
public class AreaOfCircle {
    static void main() {
        double radius, pi;
        Scanner sc = new Scanner(System.in);
        pi = 3.1416;
        System.out.print("Enter the radius here: ");
        radius = sc.nextDouble();
        double area = pi * radius * radius;
        System.out.print("The area of circle is: "+area);
    }
}
